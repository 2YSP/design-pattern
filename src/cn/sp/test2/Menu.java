package cn.sp.test2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 组合菜单
 * Created by 2YSP on 2017/7/17.
 */
public class Menu extends MenuComponent{
    private ArrayList menuComponents = new ArrayList();
    private String name;
    private String description;

    public Menu(String name,String description){
        this.name = name;
        this.description = description;
    }
    @Override
    public void add(MenuComponent menuComponent){
        menuComponents.add(menuComponent);
    }
    @Override
    public void remove(MenuComponent menuComponent){
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i){
        return (MenuComponent) menuComponents.get(i);
    }

    @Override
    public String getName(){
        return  name;
    }

    @Override
    public String getDescription(){
        return description;
    }

    @Override
    public void print() {
        System.out.print("\n"+getName());
        System.out.println(", "+getDescription());
        System.out.println("---------------------");
        Iterator iterator = menuComponents.iterator();
        while (iterator.hasNext()){//递归
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            menuComponent.print();
        }
    }

    @Override
    public Iterator createIterator() {
        return new CompsiteIterator(menuComponents.iterator());
    }
}
