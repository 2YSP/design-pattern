package cn.sp.factory.idcard;

import cn.sp.factory.framework.Factory;
import cn.sp.factory.framework.Product;

/**
 * Created by 2YSP on 2020/4/10.
 */
public class Main {

    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("小明");
        Product card2 = factory.create("小红");
        Product card3 = factory.create("小刚");

        card1.use();
        card2.use();
        card3.use();
    }
}
