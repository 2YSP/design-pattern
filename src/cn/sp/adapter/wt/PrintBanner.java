package cn.sp.adapter.wt;

/**
 * Created by 2YSP on 2020/4/8.
 * 委托的方式
 *
 */
public class PrintBanner implements Print {

    private Banner banner;

    public PrintBanner(String string){
        banner = new Banner(string);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
