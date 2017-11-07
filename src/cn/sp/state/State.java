package cn.sp.state;

/**
 * Created by 2YSP on 2017/7/17.
 */
public interface State {
    /**
     * 投钱
     */
    public void insertQuarter();

    /**
     * 退钱
     */
    public void ejectQuarter();

    /**
     * 转动把手
     */
    public void turnCrank();

    /**
     * 出糖果
     */
    public void dispense();
}
