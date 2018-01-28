package cn.sp.factory;

/**
 *  工厂方法模式：定义了一个创建对象的接口，但由子类决定要实例化的类是哪一个。
 *              工厂方法让类把实例化推迟到子类
 * Created by 2YSP on 2018/1/28.
 */
public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYStyleStore();
        PizzaStore chicagoStore = new ChicagoStyleStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a "+pizza.getName()+"\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a "+pizza.getName()+"\n");
    }
}
