package cn.sp.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by 2YSP on 2017/9/1.
 */
public class LogHandler implements InvocationHandler {
    Object obj;

    LogHandler(Object obj){
        this.obj = obj;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        this.doBefore();
        Object o = method.invoke(obj, args);
        this.doAfter();
        return o;
    }

    public void doBefore(){
        System.out.println("do this before");
    }

    public void doAfter(){
        System.out.println("do this after");
    }
}
