package cn.sp.decorator;

/**
 * @Author: 2YSP
 * @Description: 摩卡是一个具体装饰者
 * @Date: Created in 2018/1/26
 */
public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage b){
        this.beverage = b;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Mocha";
    }

    /**
     * 摩卡的价格加上 被装饰对象的价格
     * @return
     */
    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
