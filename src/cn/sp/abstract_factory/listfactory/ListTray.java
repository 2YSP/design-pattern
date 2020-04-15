package cn.sp.abstract_factory.listfactory;

import cn.sp.abstract_factory.factory.Item;
import cn.sp.abstract_factory.factory.Tray;

import java.util.Iterator;

/**
 * Created by 2YSP on 2020/4/12.
 */
public class ListTray extends Tray {

    public ListTray(String caption){
        super(caption);
    }

    @Override
    public String makeHtml() {
        StringBuilder builder = new StringBuilder();
        builder.append("<li>\n");
        builder.append(caption +"\n");
        builder.append("<ul>\n");
        Iterator it = tray.iterator();
        while (it.hasNext()){
            Item item = (Item) it.next();
            builder.append(item.makeHtml());
        }
        builder.append("</ul>\n");
        builder.append("</li>\n");
        return builder.toString();
    }
}
