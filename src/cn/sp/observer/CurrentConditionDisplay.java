package cn.sp.observer;

/**
 * 当前状况布告板（还可以建立其他观察者）
 * Created by 2YSP on 2018/1/24.
 */
public class CurrentConditionDisplay implements Observer,DisplayElement {
    /**
     * 温度
     */
    private float temperature;
    /**
     * 湿度
     */
    private float humidity;

    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: "+temperature+"F degrees and "+humidity+"% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
