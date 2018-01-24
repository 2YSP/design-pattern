package cn.sp.observer;

/**
 * 观察者模式
 * Created by 2YSP on 2018/1/24.
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentCondition = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(80,65,30.4f);
    }
}
