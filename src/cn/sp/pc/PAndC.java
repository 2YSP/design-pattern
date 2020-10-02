package cn.sp.pc;

import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;

/**
 * 生产消费模式升级版
 * Created by 2YSP on 2020/10/2
 */
public class PAndC {

    private LinkedList<String> product = new LinkedList<>();
    /**
     * 最大库存数
     */
    private int maxInventory = 10;
    /**
     * 当前库存数
     */
    private AtomicInteger currInventory = new AtomicInteger(0);

    private Lock produceLock = new ReentrantLock();

    private Lock consumeLock = new ReentrantLock();
    /**
     * 库存满和空条件
     */
    private Condition notFullCondition = produceLock.newCondition();

    private Condition notEmptyCondition = consumeLock.newCondition();

    /**
     * 新增商品到库存
     *
     * @param p
     */
    public void produce(String p) {
        produceLock.lock();
        try {
            while (currInventory.get() == maxInventory) {
                notFullCondition.await();
            }

            product.add(p);
            System.out.println("放入一个商品库存，总库存为：" + currInventory.incrementAndGet());
            if (currInventory.get() < maxInventory) {
                notFullCondition.signalAll();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            produceLock.unlock();
        }

        if (currInventory.get() > 0) {
            try {
                consumeLock.lockInterruptibly();
                notEmptyCondition.signalAll();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                consumeLock.unlock();
            }
        }
    }

    /**
     * 消费商品
     *
     * @return
     */
    public String consume() {
        String result = null;
        consumeLock.lock();
        try {
            while (currInventory.get() == 0) {
                notEmptyCondition.await();
            }

            result = product.removeLast();
            System.out.println("消费一个商品库存，总库存为：" + currInventory.decrementAndGet());
            if (currInventory.get() > 0){
                notEmptyCondition.signalAll();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            consumeLock.unlock();
        }

        if (currInventory.get() < maxInventory){
            try {
                produceLock.lockInterruptibly();
                notFullCondition.signalAll();
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                produceLock.unlock();
            }
        }

        return result;
    }

    private class Producer implements Runnable{
        @Override
        public void run() {
            IntStream.range(0,20).forEach(i->{
                produce("商品"+i);
            });
        }
    }

    private class Consumer implements Runnable{
        @Override
        public void run() {
            IntStream.range(0,20).forEach(i->{
                consume();
            });
        }
    }

    public static void main(String[] args) {
        PAndC lc = new PAndC();
        new Thread(lc.new Producer()).start();
        new Thread(lc.new Consumer()).start();
        new Thread(lc.new Producer()).start();
        new Thread(lc.new Consumer()).start();
    }

}
