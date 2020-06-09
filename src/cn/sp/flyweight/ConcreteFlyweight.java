package cn.sp.flyweight;

/**
 * @author 2YSP
 * @date 2020/6/9 21:09
 */
public class ConcreteFlyweight implements Flyweight {

    private String type;


    public ConcreteFlyweight(String type) {
        this.type = type;
    }

    @Override
    public void operation(String name) {
        System.out.printf("[类型(内在状态)] - [%s] - [名字(外在状态)] - [%s]\n", type, name);
    }

    @Override
    public String getType() {
        return type;
    }
}
