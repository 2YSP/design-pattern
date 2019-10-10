package cn.sp.singleton;

/**
 * 单例模式--静态内部类实现
 * Created by 2YSP on 2019/10/10.
 */
public class Singleton7 {

  private static class SingletonHolder{
    private static Singleton7 instance = new Singleton7();
  }

  private Singleton7(){

  }

  public static Singleton7 getInstance(){
    return SingletonHolder.instance;
  }

}
