package cn.sp.pc;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.stream.IntStream;

/**
 * 生产者消费者模式最简单版
 * Created by 2YSP on 2020/10/2
 */
public class PAndC2 {

    /**
     * 最大库存数
     */
    private int maxInventory = 10;

    private BlockingQueue<String> product = new LinkedBlockingQueue<>(maxInventory);

    public void produce(String p) {
        try {
            product.put(p);
            System.out.println("放入一个商品库存，总库存为：" + product.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String consume() {
        String result = null;
        try {
            result = product.take();
            System.out.println("消费一个商品，总库存为：" + product.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 生产者
     */
    private class Producer implements Runnable {
        @Override
        public void run() {
            IntStream.range(0, 20).forEach(i -> {
                produce("商品" + i);
            });
        }
    }

    /**
     * 消费者
     */
    private class Consumer implements Runnable {
        @Override
        public void run() {
            IntStream.range(0, 20).forEach(i -> {
                consume();
            });
        }
    }

    /**
     * 利用BlockingQueue实现生产者消费者模式
     * @param args
     */
    public static void main(String[] args) {
        PAndC2 pc = new PAndC2();
        new Thread(pc.new Producer()).start();
        new Thread(pc.new Consumer()).start();
        new Thread(pc.new Producer()).start();
        new Thread(pc.new Consumer()).start();

    }
}
