package cn.sp.observer;

/**
 * 主题接口
 * Created by 2YSP on 2018/1/24.
 */
public interface Subject {
    /**
     * 注册一个观察者
     * @param observer
     */
    public void registerObserver(Observer observer);

    /**
     * 移除一个观察者
     * @param observer
     */
    public void removeObserver(Observer observer);

    /**
     * 通知所有观察者
     */
    public void notifyObservers();
}
