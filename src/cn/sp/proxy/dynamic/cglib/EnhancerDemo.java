package cn.sp.proxy.dynamic.cglib;

import java.lang.reflect.Method;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * Created by 2YSP on 2019/10/24.
 */
public class EnhancerDemo {

  public static void main(String[] args) {
    Enhancer enhancer = new Enhancer();
    enhancer.setSuperclass(EnhancerDemo.class);
    enhancer.setCallback(new MethodInterceptorImpl());

    EnhancerDemo demo = (EnhancerDemo) enhancer.create();
    demo.test();
    System.out.println(demo);
  }


  public void test(){
    System.out.println("EnhancerDemo test");
  }

  private static class MethodInterceptorImpl implements MethodInterceptor{

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy)
        throws Throwable {
      System.out.println("Before invoke "+method);
      Object result = methodProxy.invoke(obj, args);
      System.out.println("After invoke "+method);
      return result;
    }
  }
}
