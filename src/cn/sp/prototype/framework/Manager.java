package cn.sp.prototype.framework;

import java.util.HashMap;

/**
 * @author Ship
 * @date 2020-06-09 10:20
 */
public class Manager {

    private HashMap showcase = new HashMap();

    public void register(String name, Product product) {
        showcase.put(name, product);
    }

    public Product create(String protoname) {
        Product product = (Product) showcase.get(protoname);
        return product;
    }
}
