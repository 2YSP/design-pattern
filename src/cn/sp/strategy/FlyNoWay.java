package cn.sp.strategy;

/**
 * Created by 2YSP on 2019/11/3.
 */
public class FlyNoWay implements FlyBehavior {


  @Override
  public void fly() {
    System.out.println("I can't fly");
  }
}
