package cn.sp.proxyPattern;

import java.lang.reflect.Proxy;

/**
 * Created by 2YSP on 2017/9/1.
 */
public class Test {
    /**
     * 动态代理测试
     */
    public static  void testDynamicProxy(){
        Calculator calculator = new CalculatorImpl();
        LogHandler logHandler = new LogHandler(calculator);
        //动态生成代理类
        Calculator proxy = (Calculator)Proxy.newProxyInstance(
                calculator.getClass().getClassLoader(), calculator.getClass().getInterfaces(), logHandler);
        int result = proxy.add(1, 1);
        System.out.println(result);
    }

    public static void main(String[] args) {
//        testDynamicProxy();
        testStaticProxy();
    }

    /**
     * 测试静态代理
     */
    public static void testStaticProxy(){
        Calculator calculator = new CalculatorImpl();
        CalculatorProxy calculatorProxy = new CalculatorProxy(calculator);
        int i = calculatorProxy.add(1, 2);
        System.out.println(i);
    }
}
