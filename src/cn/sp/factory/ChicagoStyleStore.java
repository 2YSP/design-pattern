package cn.sp.factory;

/**
 * Created by 2YSP on 2018/1/28.
 */
public class ChicagoStyleStore extends PizzaStore{


    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")){
            return new ChicagoStyleCheesePizza();
        }
        return null;
    }
}
