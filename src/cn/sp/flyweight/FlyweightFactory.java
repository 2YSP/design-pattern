package cn.sp.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂类
 *
 * @author 2YSP
 * @date 2020/6/9 21:13
 */
public class FlyweightFactory {

    private static final Map<String, Flyweight> FLYWEIGHT_MAP = new HashMap<>();

    public static Flyweight getFlyweight(String type) {
        if (FLYWEIGHT_MAP.containsKey(type)) {
            // 如果享元池中存在对象则直接获取
            return FLYWEIGHT_MAP.get(type);
        } else {
            // 不存在则创建
            ConcreteFlyweight flyweight = new ConcreteFlyweight(type);
            FLYWEIGHT_MAP.put(type, flyweight);
            return flyweight;
        }
    }
}
