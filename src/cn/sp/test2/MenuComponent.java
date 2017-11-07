package cn.sp.test2;

import java.util.Iterator;

/**
 * 菜单组件,组合模式&迭代器模式
 * Created by 2YSP on 2017/7/17.
 */
public abstract class MenuComponent {

    public void add(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent){
        throw  new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i){
        throw  new UnsupportedOperationException();
    }

    public String getName(){
        throw new UnsupportedOperationException();
    }

    public String getDescription(){
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian(){
        throw new UnsupportedOperationException();
    }

    public void print(){
        throw new UnsupportedOperationException();
    }

    public Iterator createIterator(){
        throw new UnsupportedOperationException();
    };
}
