package cn.sp.decorator;

/**
 * @Author: 2YSP
 * @Description: 另一种饮料
 * @Date: Created in 2018/1/26
 */
public class HouseBlend extends Beverage {

    public HouseBlend(){
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
