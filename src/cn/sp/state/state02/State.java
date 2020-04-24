package cn.sp.state.state02;

/**
 * Created by 2YSP on 2020/4/23.
 */
public interface State {
    // 设置时间
    void doClock(Context context,int hour);

    // 使用金库
    void doUse(Context context);

    /**
     * 按下警铃
     * @param context
     */
    void doAlarm(Context context);

    /**
     * 正常通话
     * @param context
     */
    void doPhone(Context context);
}
