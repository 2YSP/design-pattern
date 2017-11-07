package cn.sp.proxy;

/**
 * Created by 2YSP on 2017/9/1.
 * 实现类
 */
public class CalculatorImpl implements Calculator {
    @Override
    public int add(int a, int b) {
        return a+b;
    }
}
