package cn.sp.factory;

import java.util.ArrayList;

/**
 * Created by 2YSP on 2018/1/28.
 */
public abstract class Pizza {
    String name;
    String dough;
    String sauce;

    ArrayList toppings = new ArrayList();

    /**
     * 准备
     */
    void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings:");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println(" " + toppings.get(i));
        }
    }

    /**
     * 烘焙
     */
    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    /**
     * 切片
     */
    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    /**
     * 装箱
     */
    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}
