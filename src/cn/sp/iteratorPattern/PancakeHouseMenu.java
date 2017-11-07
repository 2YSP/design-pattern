package cn.sp.iteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by 2YSP on 2017/7/14.
 */
public class PancakeHouseMenu {
    ArrayList menuItems;

    public PancakeHouseMenu(){
        menuItems = new ArrayList();
        addItem("ddf","Pancakes with scrambled eggs,and toast",true,2.99);
        addItem("Regular ","Pancakes with fried eggs,sausage",false,2.99);
        addItem("Blueberry","Pancakes made with fresh blueberries",true,3.49);
    }

    public void addItem(String name,String description,boolean vegetarian,double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

//    public ArrayList getMenuItems(){
//        return menuItems;
//    }

    public Iterator createIterator(){
//        return  new PancakeHouseMenuIterator(menuItems);
        return  menuItems.iterator();//ArrayList有迭代器
    }
}
