package cn.sp.abstract_factory.factory;

/**
 * Created by 2YSP on 2020/4/12.
 * 抽象零件
 * 抽象的表示HTML超链接的类
 */
public abstract class Link extends Item {

    protected String url;

    public Link(String url, String caption) {
        super(caption);
        this.url = url;
    }

}
