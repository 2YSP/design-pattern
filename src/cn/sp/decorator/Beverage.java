package cn.sp.decorator;

/**
 * @Author: 2YSP
 * @Description:
 * @Date: Created in 2018/1/26
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription(){
        return description;
    }

    //改方法必须在子类实现
    public abstract double cost();
}
