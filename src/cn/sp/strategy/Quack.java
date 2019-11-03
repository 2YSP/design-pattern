package cn.sp.strategy;

/**
 * Created by 2YSP on 2019/11/3.
 */
public class Quack implements QuackBehavior {

  @Override
  public void quack() {
    // 鸭子呱呱叫
    System.out.println("Quack");
  }
}
