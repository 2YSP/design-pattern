package cn.sp.decorator.two;

/**
 * 装饰字符串的两侧，如|被装饰物|
 * @author 2YSP
 * @date 2020/6/16 21:21
 */
public class SideBorder extends Border {
    private char borderChar;// 修饰边框的字符

    protected SideBorder(Display display, char ch) {
        super(display);
        this.borderChar = ch;
    }


    @Override
    protected int getColumns() {
        // 字符数=字符串字符数加两侧边框字符数
        return 1 + display.getColumns() + 1;
    }

    @Override
    protected int getRows() {
        return display.getRows();
    }

    @Override
    protected String getRowText(int row) {
        return borderChar + display.getRowText(row) + borderChar;
    }
}
