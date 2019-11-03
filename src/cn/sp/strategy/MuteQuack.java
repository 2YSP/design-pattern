package cn.sp.strategy;

/**
 * Created by 2YSP on 2019/11/3.
 */
public class MuteQuack implements QuackBehavior {

  @Override
  public void quack() {
    // 不会叫
    System.out.println("<<Silence>>");
  }
}
