package cn.sp.iteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by 2YSP on 2017/7/14.
 */
public class PancakeHouseMenuIterator implements Iterator {
    ArrayList menuItems;
    int position = 0;

    public  PancakeHouseMenuIterator(ArrayList items){
        menuItems = items;
    }

    public Object next(){
        Object obj = menuItems.get(position);
        position = position + 1;
        return obj;
    }

    public boolean hasNext(){
        if(position >= menuItems.size() || menuItems.get(position) == null){
            return  false;
        }else{
            return  true;
        }
    }
}
