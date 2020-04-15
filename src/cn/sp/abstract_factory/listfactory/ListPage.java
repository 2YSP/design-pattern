package cn.sp.abstract_factory.listfactory;

import cn.sp.abstract_factory.factory.Item;
import cn.sp.abstract_factory.factory.Page;

import java.util.Iterator;

/**
 * Created by 2YSP on 2020/4/12.
 */
public class ListPage extends Page {

    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHtml() {
        StringBuilder builder = new StringBuilder();
        builder.append("<html><head><title>" + title + "</head></title>\n");
        builder.append("<body>\n");
        builder.append("<h1>" + title + "</h1>");
        builder.append("<ul>\n");
        Iterator it = content.iterator();
        while (it.hasNext()) {
            Item item = (Item) it.next();
            builder.append(item.makeHtml());
        }
        builder.append("</ul>\n");
        builder.append("<hr><address>" + author + "</address></hr>");
        builder.append("</body></html>\n");
        return builder.toString();
    }
}
