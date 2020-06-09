package cn.sp.flyweight;

/**
 * @author 2YSP
 * @date 2020/6/9 21:16
 */
public class Client {
    /**
     * <pre>
     *     享元模式是运用共享技术有效地最大限度地复用细粒度对象的一种模式。
     *     内部数据是对象可以共享出来的信息，这些信息不会随着系统的运行而改变；
     *     外部数据则是在不同运行时被标记了不同的值。
     *     应用例子：线程池、Java 的 String 字符串，在一些字符串常量中，会共享常量池中字符串对象，从而减少重复创建相同值对象.
     * </pre>
     *
     * @param args
     */
    public static void main(String[] args) {
        Flyweight fw0 = FlyweightFactory.getFlyweight("a");
        Flyweight fw1 = FlyweightFactory.getFlyweight("b");
        Flyweight fw2 = FlyweightFactory.getFlyweight("a");
        Flyweight fw3 = FlyweightFactory.getFlyweight("b");
        fw1.operation("abc");
        System.out.printf("[结果(对象对比)] - [%s]\n", fw0 == fw2);
        System.out.printf("[结果(内在状态)] - [%s]\n", fw1.getType());
    }
}
