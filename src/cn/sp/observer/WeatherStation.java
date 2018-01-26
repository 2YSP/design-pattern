package cn.sp.observer;

/**
 * 观察者模式：定义了对象之间的一对多依赖，这样一来，当一个对象的状态改变时，
 *            它的所有依赖者都会收到通知并自动更新。
 * Created by 2YSP on 2018/1/24.
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentCondition = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(80,65,30.4f);
    }
}
