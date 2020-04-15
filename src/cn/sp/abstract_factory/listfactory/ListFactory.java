package cn.sp.abstract_factory.listfactory;

import cn.sp.abstract_factory.factory.Factory;
import cn.sp.abstract_factory.factory.Link;
import cn.sp.abstract_factory.factory.Page;
import cn.sp.abstract_factory.factory.Tray;

/**
 * Created by 2YSP on 2020/4/12.
 */
public class ListFactory extends Factory {

    @Override
    public Link createLink(String url, String caption) {
        return new ListLink(url, caption);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
