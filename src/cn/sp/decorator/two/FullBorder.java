package cn.sp.decorator.two;

/**
 * @author 2YSP
 * @date 2020/6/16 21:26
 */
public class FullBorder extends Border {


    protected FullBorder(Display display) {
        super(display);
    }

    @Override
    protected int getColumns() {
        return 1 + display.getColumns() + 1;
    }

    @Override
    protected int getRows() {
        // 行数为被装饰物的行数加上上下边框的行数
        return 1 + display.getRows() + 1;
    }

    @Override
    protected String getRowText(int row) {
        if (row == 0) {
            // 下边框
            return "+" + makeLine('-', display.getColumns()) + "+";
        } else if (row == display.getRows() + 1) {
            // 上边框
            return "+" + makeLine('-', display.getColumns()) + "+";
        } else {
            // 其他边框
            return "|" + display.getRowText(row - 1) + "|";
        }
    }

    private String makeLine(char ch, int count) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            builder.append(ch);
        }
        return builder.toString();
    }
}
