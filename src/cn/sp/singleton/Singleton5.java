package cn.sp.singleton;

/**
 * 单例模式-- 静态代码块实现
 * Created by 2YSP on 2019/10/10.
 */
public class Singleton5 {

  private static Singleton5 singleton;

  private Singleton5() {

  }

  static {
    singleton = new Singleton5();
  }

  public static Singleton5 getInstance() {
    return singleton;
  }

  public static void main(String[] args) {
    Singleton5 instance = Singleton5.getInstance();
    System.out.println(instance);
  }
}
