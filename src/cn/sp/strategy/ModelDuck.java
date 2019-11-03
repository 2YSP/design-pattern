package cn.sp.strategy;

/**
 * Created by 2YSP on 2019/11/3.
 */
public class ModelDuck extends Duck {

  //模型鸭
  public ModelDuck(){
    this.flyBehavior = new FlyNoWay();
    this.quackBehavior = new Quack();
  }

  @Override
  public void display() {
    System.out.println("I am a model duck");
  }
}
