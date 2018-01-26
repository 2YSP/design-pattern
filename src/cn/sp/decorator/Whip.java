package cn.sp.decorator;

/**
 * @Author: 2YSP
 * @Description: 奶泡是一个具体装饰者
 * @Date: Created in 2018/1/26
 */
public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage b){
        this.beverage = b;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Whip";
    }

    /**
     * 奶泡的价格加上 被装饰对象的价格
     * @return
     */
    @Override
    public double cost() {
        return 0.11 + beverage.cost();
    }
}
