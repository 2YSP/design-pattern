package cn.sp.decorator;

/**
 * @Author: 2YSP
 * @Description: 豆浆是一个具体装饰者
 * @Date: Created in 2018/1/26
 */
public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage b){
        this.beverage = b;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Soy";
    }

    /**
     * 豆浆的价格加上 被装饰对象的价格
     * @return
     */
    @Override
    public double cost() {
        return 0.11 + beverage.cost();
    }
}
