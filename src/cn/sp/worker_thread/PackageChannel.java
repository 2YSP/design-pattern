package cn.sp.worker_thread;

import java.util.Arrays;

/**
 * Created by 2YSP on 2020/9/26
 */
public class PackageChannel {

    private final static int MAX_PACKAGE_NUM = 100;

    private final Package[] packageQueue;

    private final Worker[] workerPool;

    private int head;

    private int tail;

    private int count;

    public PackageChannel(int workers) {
        this.packageQueue = new Package[MAX_PACKAGE_NUM];
        this.workerPool = new Worker[workers];
        this.head = 0;
        this.tail = 0;
        this.count = 0;
        this.init();
    }

    private void init() {
        for (int i = 0; i < workerPool.length; i++) {
            workerPool[i] = new Worker("Worker-"+i,this);
        }
    }

    /**
     * 启动所有的Worker
     */
    public void startWorker(){
        Arrays.asList(workerPool).forEach(Worker::start);
    }

    public synchronized void put(Package p){
        while (count >= packageQueue.length){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.packageQueue[tail] = p;
        this.tail = (tail + 1) % packageQueue.length;
        this.count++;
        this.notifyAll();
    }


    public synchronized Package take(){
        while (count <= 0){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        Package request = this.packageQueue[head];
        this.head = (head + 1) % packageQueue.length;
        count--;
        this.notifyAll();
        return request;
    }



}
