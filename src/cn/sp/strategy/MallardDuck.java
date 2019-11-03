package cn.sp.strategy;

/**
 * Created by 2YSP on 2019/11/3.
 */
public class MallardDuck extends Duck {

  public MallardDuck(){
    // 绿头鸭会飞会叫
    this.flyBehavior = new FlyWithSwings();
    this.quackBehavior = new Quack();
  }


  @Override
  public void display() {
    System.out.println("I'm real Mallard duck");
  }
}
