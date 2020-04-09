package cn.sp.adapter.extend;

/**
 * Created by 2YSP on 2020/4/8.
 * 继承的方式
 *
 */
public class PrintBanner extends Banner implements Print {

    public PrintBanner(String string){
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
