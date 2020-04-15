package cn.sp.abstract_factory;

import cn.sp.abstract_factory.factory.Factory;
import cn.sp.abstract_factory.factory.Link;
import cn.sp.abstract_factory.factory.Page;
import cn.sp.abstract_factory.factory.Tray;

/**
 * Created by 2YSP on 2020/4/12.
 */
public class Main {
    public static void main(String[] args) {

        Factory factory = Factory.getFactory("cn.sp.abstract_factory.listfactory.ListFactory");

        Link people = factory.createLink("http://www.people.com.cn", "人民日报");
        Link gmw = factory.createLink("http://www.gmw.cn", "光明日报");


        Link us_yahoo = factory.createLink("http://www.yahoo.com/", "Yahoo!");
        Link jp_yahoo = factory.createLink("http://www.yahoo.jp/","Yahoo!Japan");
        Link excite = factory.createLink("http://www.excite.com/","Excite");
        Link google = factory.createLink("http://www.google.com/","Google");

        Tray trayNews = factory.createTray("日报");
        trayNews.add(people);
        trayNews.add(gmw);

        Tray trayYahoo = factory.createTray("Yahoo!");
        trayYahoo.add(us_yahoo);
        trayYahoo.add(jp_yahoo);

        Tray search = factory.createTray("检索引擎");
        search.add(trayYahoo);
        search.add(excite);
        search.add(google);

        Page page = factory.createPage("LinkPage","杨文轩");

        page.add(trayNews);
        page.add(search);

        page.output();



    }
}
