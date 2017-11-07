package cn.sp.iteratorPattern;

import java.util.Iterator;

/**
 * Created by 2YSP on 2017/7/14.
 */
public class DinnerMenuIterator implements Iterator {
    MenuItem[] menuItems;
    int position = 0;//记录当前位置

    public DinnerMenuIterator(MenuItem[] items){
        this.menuItems = items;
    }

    public Object next(){
        MenuItem menuItem = menuItems[position];
        position = position + 1;
        return  menuItem;
    }

    public boolean hasNext(){
        if(position > menuItems.length || menuItems[position] == null){//不但要检查是否超过数组长度，还要检查下一项是否为Null
            return  false;
        }else {
            return  true;
        }
    }

    public void remove(){
        if (position <= 0){
            throw  new IllegalStateException("you can't remove an item util you have done at least one next");
        }

        if (menuItems[position-1] != null ){
            for(int i = position-1;i < (menuItems.length -1);i++){
                menuItems[i] = menuItems[i+1];
            }
            menuItems[menuItems.length-1] = null;
        }
    }
}
