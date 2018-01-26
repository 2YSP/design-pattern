package cn.sp.decorator;

/**
 * @Author: 2YSP
 * @Description: 装饰者模式：
 *               动态地将责任附加到对象上。若要扩展此功能，
 *               装饰者提供了比继承更有弹性的方案
 * @Date: Created in 2018/1/26
 */
public class StartbuzzCoffee {
    public static void main(String[] args) {
        //单点一杯浓缩咖啡，打印其描述与价钱
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()+" $ "+beverage.cost());

        //再来一杯加了豆浆，摩卡，奶泡的HouseBlend咖啡
        Beverage beverage2 = new HouseBlend();
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);

        System.out.println(beverage2.getDescription()+" $ "+beverage2.cost());
    }
}
