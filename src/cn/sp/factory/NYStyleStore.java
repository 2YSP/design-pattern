package cn.sp.factory;

/**
 * Created by 2YSP on 2018/1/28.
 */
public class NYStyleStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        //根据类型提供对应的披萨，其他的省略
        if (type.equals("cheese")){
            return new NYStyleCheesePizza();
        }

        return null;
    }
}
