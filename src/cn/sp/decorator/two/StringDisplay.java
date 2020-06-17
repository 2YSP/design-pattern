package cn.sp.decorator.two;

/**
 * @author 2YSP
 * @date 2020/6/16 21:16
 */
public class StringDisplay extends Display {

    private String string;

    public StringDisplay(String string){
        this.string = string;
    }


    @Override
    protected int getColumns() {
        return string.getBytes().length;
    }

    @Override
    protected int getRows() {
        return 1;
    }

    @Override
    protected String getRowText(int row) {
        if (row == 0){
            return string;
        }else {
            return null;
        }
    }
}
