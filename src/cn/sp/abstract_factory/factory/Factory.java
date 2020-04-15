package cn.sp.abstract_factory.factory;

/**
 * Created by 2YSP on 2020/4/12.
 *
 * 抽象工厂
 */
public abstract class Factory {

    public static Factory getFactory(String className) {
        Factory factory = null;
        try {
            // 通过反射生成实例
            factory = (Factory) Class.forName(className).newInstance();
        } catch (ClassNotFoundException e) {
            System.out.println("没有找到 " + className + " 类");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return factory;
    }


    public abstract Link createLink(String url, String caption);

    public abstract Tray createTray(String caption);

    public abstract Page createPage(String title, String author);
}
