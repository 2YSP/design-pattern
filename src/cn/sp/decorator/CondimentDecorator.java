package cn.sp.decorator;

/**
 * @Author: 2YSP
 * @Description: 调料抽象类(抽象装饰者)
 * @Date: Created in 2018/1/26
 */
public abstract class CondimentDecorator extends Beverage{

    @Override
    public abstract String getDescription();
}
