package cn.sp.decorator;

/**
 * @Author: 2YSP
 * @Description: 浓缩咖啡
 * @Date: Created in 2018/1/26
 */
public class Espresso extends Beverage {

    public Espresso(){
        description = "Espresso";
    }

    /**
     * 不需要管调料价钱，直接返回Espresso价格即可
     * @return
     */
    @Override
    public double cost() {
        return 1.99;
    }
}
