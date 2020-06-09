package cn.sp.prototype;

import cn.sp.prototype.framework.Manager;
import cn.sp.prototype.framework.Product;

/**
 * @author Ship
 * @date 2020-06-09 9:49
 */
public class Main {
    /**
     * 原型模式：通过clone来避免new创建对象，提高性能
     *
     * @param args
     */
    public static void main(String[] args) {
        Manager manager = new Manager();
        UnderlinePen upen = new UnderlinePen('~');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');
        manager.register("strong message", upen);
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);

        // 生成
        Product p1 = manager.create("strong message");
        p1.use("Hello,world.");
        Product p2 = manager.create("warning box");
        p2.use("Hello,world.");
        Product p3 = manager.create("slash box");
        p3.use("Hello,world.");

    }
}
