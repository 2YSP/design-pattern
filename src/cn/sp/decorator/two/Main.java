package cn.sp.decorator.two;

/**
 * @author 2YSP
 * @date 2020/6/16 21:33
 */
public class Main {

    public static void main(String[] args) {
        Display b1 = new StringDisplay("Hello World.");
        Display b2 = new SideBorder(b1, '#');
        Display b3 = new FullBorder(b2);
        b1.show();
        b2.show();
        b3.show();

        Display b4 = new SideBorder(new FullBorder(new FullBorder(
                new SideBorder(new FullBorder(new StringDisplay(" 你好，世界。")), '*')
        )), '/');
        b4.show();
    }
}
