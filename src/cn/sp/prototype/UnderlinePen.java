package cn.sp.prototype;

import cn.sp.prototype.framework.Product;

/**
 * @author Ship
 * @date 2020-06-09 10:27
 */
public class UnderlinePen implements Product {

    private char ulchar;

    public UnderlinePen(char unchar) {
        this.ulchar = unchar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        System.out.println("\"" + s + "\"");
        System.out.print(" ");
        for (int i = 0; i < length; i++) {
            System.out.print(ulchar);
        }

        System.out.println("");
    }

    @Override
    public Product createClone() {
        Product product = null;
        try {
            product = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return product;
    }


}
