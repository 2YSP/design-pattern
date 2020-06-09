package cn.sp.flyweight;

/**
 * 抽象享元类
 * @author 2YSP
 * @date 2020/6/9 21:07
 */
public interface Flyweight {
    // 对外状态对象
    void operation(String name);
    // 对内对象
    String getType();
}
