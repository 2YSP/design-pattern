package cn.sp.strategy;

/**
 * Created by 2YSP on 2019/11/3.
 */
public class MiniDuckSimulator {

  public static void main(String[] args) {
    Duck mallard = new MallardDuck();
    mallard.display();
    mallard.performFly();
    mallard.performQuack();

  }

}
