package cn.sp.abstract_factory.factory;

/**
 * Created by 2YSP on 2020/4/12.
 * Link类和Tray类的父类
 *
 */
public abstract class Item {
    /**
     * 标题
     */
    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    /**
     * 子类来实现
     * @return
     */
    public abstract String makeHtml();
}
