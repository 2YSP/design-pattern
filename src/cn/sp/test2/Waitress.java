package cn.sp.test2;

import java.util.Iterator;

/**
 * Created by 2YSP on 2017/7/17.
 */
public class Waitress {
    private MenuComponent allMenus;

    public Waitress(MenuComponent menuComponent){
        this.allMenus = menuComponent;
    }

    public void prinfMenu(){
        allMenus.print();
    }

    public  void printVegetarianMenu(){
        Iterator iterator = allMenus.createIterator();

        while (iterator.hasNext()){
            MenuComponent component = (MenuComponent) iterator.next();
            try {
                if (component.isVegetarian()){
                    component.print();
                }
            }catch (UnsupportedOperationException e){}

        }
    }
}
