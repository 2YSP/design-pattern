package cn.sp.state.state02;

/**
 * Created by 2YSP on 2020/4/23.
 */
public class NightState implements State {

    private static NightState singleton = new NightState();

    private NightState() {

    }

    public static NightState getInstance() {
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
        if (9 <= hour && hour < 17) {
            context.changeState(DayState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.callSecurityCenter("紧急：晚上使用金库！");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("按下警铃（晚上）");
    }

    @Override
    public void doPhone(Context context) {
        context.recordLog("晚上的通话录音");
    }


    public String toString() {
        return "[晚上]";
    }
}
