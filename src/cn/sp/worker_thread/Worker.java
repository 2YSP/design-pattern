package cn.sp.worker_thread;

import java.util.Random;

/**
 * Created by 2YSP on 2020/9/26
 */
public class Worker extends Thread{

    private final PackageChannel channel;

    private static final Random random = new Random(System.currentTimeMillis());

    public Worker(String name,PackageChannel channel){
        super(name);
        this.channel = channel;
    }

    @Override
    public void run() {
        channel.take().execute();
        try {
            Thread.sleep(random.nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
