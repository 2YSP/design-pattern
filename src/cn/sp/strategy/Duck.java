package cn.sp.strategy;

/**
 * 策略模式：定义了算法簇，分别封装起来，让它们之间可以相互替换，
 * 此模式让算法的变化独立于使用算法的客户。
 * Created by 2YSP on 2019/11/3.
 */
public abstract class Duck {

  QuackBehavior quackBehavior;

  FlyBehavior flyBehavior;

  public abstract void display();

  public void performFly(){
    flyBehavior.fly();
  }

  public void performQuack(){
    quackBehavior.quack();
  }

  public void swim(){
    System.out.println("All ducks float,even decoys");
  }


  public void setQuackBehavior(QuackBehavior quackBehavior) {
    this.quackBehavior = quackBehavior;
  }

  public void setFlyBehavior(FlyBehavior flyBehavior) {
    this.flyBehavior = flyBehavior;
  }
}
