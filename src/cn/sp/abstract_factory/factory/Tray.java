package cn.sp.abstract_factory.factory;

import java.util.ArrayList;

/**
 * Created by 2YSP on 2020/4/12.
 *
 * 抽象零件
 * 一个含有多个Link类和Tray类的容器
 */
public abstract class Tray extends Item{

    protected ArrayList tray = new ArrayList();


    public Tray(String caption){
        super(caption);
    }

    public void add(Item item){
        tray.add(item);
    }

}
