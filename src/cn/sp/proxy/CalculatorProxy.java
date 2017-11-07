package cn.sp.proxy;

/**
 * Created by 2YSP on 2017/9/1.
 * 静态代理类
 */
public class CalculatorProxy implements Calculator{
    Calculator calculator;

    public CalculatorProxy(Calculator calculator){
        this.calculator = calculator;
    }

    @Override
    public int add(int a, int b) {
        //具体执行前可以做的工作
        int result = calculator.add(a, b);
        //具体执行后可以做的工作
        return result;
    }
}
