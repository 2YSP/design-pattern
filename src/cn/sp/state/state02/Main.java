package cn.sp.state.state02;

/**
 * Created by 2YSP on 2020/4/23.
 */
public class Main {

    public static void main(String[] args) {
        SateFrame frame = new SateFrame("State Sample");

        while (true) {
            for (int hour = 0; hour < 24; hour++) {
                frame.setClock(hour);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
