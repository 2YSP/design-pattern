package cn.sp.pc;

import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 库存设计之生产者消费者模式
 * Created by 2YSP on 2020/10/2
 */
public class LockConditionTest {

    private LinkedList<String> product = new LinkedList<>();
    /**
     * 最大库存数
     */
    private int maxInventory = 10;
    /**
     * 资源锁
     */
    private Lock lock = new ReentrantLock();
    /**
     * 库存非满和非空条件
     */
    private Condition condition = lock.newCondition();

    /**
     * 新增商品库存
     *
     * @param p
     */
    public void produce(String p) {
        lock.lock();
        try {
            while (product.size() >= maxInventory) {
                condition.await();
            }
            product.add(p);
            System.out.println("放入一个商品库存，总库存为:" + product.size());
            condition.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    /**
     * 消费商品
     */
    public String consume() {
        String result = null;
        lock.lock();
        try {
            while (product.size() == 0) {
                condition.await();
            }
            result = product.removeLast();
            System.out.println("消费一个商品，总库存为：" + product.size());
            condition.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
        return result;
    }

    /**
     * 生产者
     */
    private class Producer implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 20; i++) {
                produce("商品" + i);
            }
        }
    }

    /**
     * 消费者
     */
    private class Consumer implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 20; i++) {
                consume();
            }
        }
    }

    /**
     * 这里生产者和消费者没有同步关系，但是竞争同一把锁，性能不好。
     * @param args
     */
    public static void main(String[] args) {
        LockConditionTest lc = new LockConditionTest();
        new Thread(lc.new Producer()).start();
        new Thread(lc.new Consumer()).start();
        new Thread(lc.new Producer()).start();
        new Thread(lc.new Consumer()).start();
    }
}
