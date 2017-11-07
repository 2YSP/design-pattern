package cn.sp.iteratorPattern;

import java.util.Iterator;

/**
 * Created by 2YSP on 2017/7/14.
 * 迭代器模式
 */
public class Test {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinnerMenu dinnerMenu = new DinnerMenu();
        Iterator it1 = pancakeHouseMenu.createIterator();
        while (it1.hasNext()){
            System.out.println(((MenuItem)it1.next()).toString());
        }
        System.out.println("===================");
        Iterator it2 = dinnerMenu.createIterator();
        while (it2.hasNext()){
            System.out.println(((MenuItem)it2.next()).toString());
        }
    }
}
