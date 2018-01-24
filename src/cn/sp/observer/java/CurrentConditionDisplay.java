package cn.sp.observer.java;

import cn.sp.observer.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * Java内置版
 * Created by 2YSP on 2018/1/24.
 */
public class CurrentConditionDisplay implements Observer,DisplayElement {
    Observable observable;
    /**
     * 温度
     */
    private float temperature;
    /**
     * 湿度
     */
    private float humidity;


    public CurrentConditionDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: "+temperature+"F degrees and "+humidity+"% humidity");
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData){
            WeatherData weatherData = (WeatherData)o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
