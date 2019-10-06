package cn.sp.template;

/**
   * 咖啡因饮料超类
 * Created by 2YSP on 2019/10/6.
 */
public abstract class CaffeineBeverage {

  /**
   * 模板方法
   * 定义的算法步骤
   */
  final void prepareRecipe(){
    boilWater();
    brew();
    pourInCup();
    addCondiments();
  }

  /**
   * 添加调料
   */
  protected abstract void addCondiments();


  /**
   * 冲泡
   */
  protected abstract void brew();

  /**
   * 煮开水
   */
  private void boilWater() {
    System.out.println("Boiling water");
  }

  /**
   * 把饮料倒进杯子
   */
  private void pourInCup() {
    System.out.println("Pouring in cup");
  }

}
