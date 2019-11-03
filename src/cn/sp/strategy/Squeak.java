package cn.sp.strategy;

/**
 * Created by 2YSP on 2019/11/3.
 */
public class Squeak implements QuackBehavior {

  @Override
  public void quack() {
    //橡皮鸭吱吱叫
    System.out.println("Squeak");
  }
}
