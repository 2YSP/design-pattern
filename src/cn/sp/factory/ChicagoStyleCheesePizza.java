package cn.sp.factory;


/**
 * 芝加哥风格奶酪披萨
 * Created by 2YSP on 2018/1/28.
 */
public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza(){
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Think Crust Dough";
        sauce = "Plum  Tomato Sauce";
        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    void cut() {
        //切成正方形
        System.out.println("Cutting the pizza into square slices");
    }
}
