package cn.sp.proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by 2YSP on 2019/10/24.
 */
public class MyInvocationHandler implements InvocationHandler {

  /**
   * 目标对象
   */
  private Object target;

  public MyInvocationHandler(Object target){
    this.target = target;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    System.out.println("---------before---------");
    // 执行目标对象的方法
    Object result = method.invoke(target, args);
    System.out.println("---------after---------");
    
    return result;
  }

  /**
   * 获取目标对象的代理对象
   * @return
   */
  public Object getProxy(){
    return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),target.getClass().getInterfaces(),this);
  }
}
