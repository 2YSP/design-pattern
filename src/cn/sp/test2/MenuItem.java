package cn.sp.test2;

import java.util.Iterator;

/**
 * 实现菜单项(叶子节点)
 * Created by 2YSP on 2017/7/17.
 */
public class MenuItem extends MenuComponent {
    private String name;
    private String description;
    private boolean isVegetarian;
    private double price;

    public MenuItem(String name,String description,boolean isVegetarian,double price){
        this.name = name;
        this.description = description;
        this.isVegetarian = isVegetarian;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean isVegetarian() {
        return isVegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        isVegetarian = vegetarian;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void print() {
        System.out.print("   "+getName());
        if (isVegetarian){
            System.out.print("(v)");
        }
        System.out.println(", "+getPrice());
        System.out.println("    -- "+getDescription());
    }

    @Override
    public Iterator createIterator() {
        return new NullIterator();
    }
}
