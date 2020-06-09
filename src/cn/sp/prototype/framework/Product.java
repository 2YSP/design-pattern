package cn.sp.prototype.framework;

/**
 * @author Ship
 * @date 2020-06-09 9:49
 */
public interface Product extends Cloneable{

    void use(String s);

    Product createClone();
}
