package cn.sp.observer.java;

import java.util.Observable;

/**
 * 使用Java内置的支持
 * Created by 2YSP on 2018/1/24.
 */
public class WeatherData extends Observable {

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

    }

    public void measurementsChanged(){
        //再调用notifyObservers()之前要先调用setChanged()来指示状态已改变
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
}
