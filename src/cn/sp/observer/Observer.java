package cn.sp.observer;

/**
 *
 * Created by 2YSP on 2018/1/24.
 */
public interface Observer {
    /**
     * 所有观察者必须实现该方法，
     * 当气象观测值改变时，主题会把这些状态值当参数传给观察者
     * @param temp
     * @param humidity
     * @param pressure
     */
    public void update(float temp,float humidity,float pressure);
}
