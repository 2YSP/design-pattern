package cn.sp.proxy;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

/**
 * Created by 2YSP on 2017/9/1.
 * 两个线程之间交换数据
 */
public class ExchangerTest {


    public static void main(String[] args) {
        final Exchanger<List<Integer>> exchanger = new Exchanger<>();

        new Thread(() -> {
            List<Integer> l = new ArrayList<Integer>(2);
            l.add(1);
            l.add(2);
            try {
                l = exchanger.exchange(l);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("thread1: " + l);
        }).start();

        new Thread(() -> {
            List<Integer> l = new ArrayList<Integer>(2);
            l.add(3);
            l.add(4);
            try {
                l = exchanger.exchange(l);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("thread2: " + l);
        }).start();

    }
}
