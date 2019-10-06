package cn.sp.template;

/**
 * Created by 2YSP on 2019/10/6.
 */
public class Coffee extends CaffeineBeverage {

  @Override
  protected void addCondiments() {
    System.out.println("Adding Sugar and Milk ");
  }

  @Override
  protected void brew() {
    System.out.println("Dripping Coffee through filter");
  }
}
