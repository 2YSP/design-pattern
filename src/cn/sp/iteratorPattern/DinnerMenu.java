package cn.sp.iteratorPattern;

import java.util.Iterator;

/**
 * Created by 2YSP on 2017/7/14.
 */
public class DinnerMenu {
    static final  int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinnerMenu(){
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Vegetarian BLT","bacon ",true,2.99);
        addItem("BLT","Bacon with lettuce & tomato on whole wheat",false,2.99);
        addItem("Soup of the day","with a side of potato salad",false,3.29);
    }

    public void addItem(String name,String description,boolean vegetarian,double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS){
            System.err.println("Sorry,menu is full!Can't add item to menu");
        }else{
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }

//    public MenuItem[] getMenuItems(){不再需要
//        return menuItems;
//    }

    public Iterator createIterator(){
        return  new DinnerMenuIterator(menuItems);
    }
}
