package cn.sp.abstract_factory.listfactory;

import cn.sp.abstract_factory.factory.Link;

/**
 * Created by 2YSP on 2020/4/12.
 */
public class ListLink extends Link {

    public ListLink(String url, String caption) {
        super(url, caption);
    }

    @Override
    public String makeHtml() {
        return "<li><a href= \"" + url + "\">" + caption + "</a></li>\n";
    }
}
