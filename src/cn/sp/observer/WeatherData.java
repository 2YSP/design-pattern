package cn.sp.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 2YSP on 2018/1/24.
 */
public class WeatherData implements Subject {
    /**
     * 注册的观察者集合
     */
    private List<Observer> observers;
    /**
     * 温度
     */
    private float temperature;
    /**
     * 湿度
     */
    private float humidity;
    /**
     * 气压
     */
    private float pressure;

    public WeatherData(){
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (observers.contains(observer)){
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        observers.forEach(o -> {
            o.update(temperature,humidity,pressure);
        });
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    //WeatherData的其他方法
}
