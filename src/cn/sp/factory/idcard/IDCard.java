package cn.sp.factory.idcard;

import cn.sp.factory.framework.Product;

/**
 * Created by 2YSP on 2020/4/10.
 */
public class IDCard extends Product {

    private String owner;

    /**
     * 不用public修饰防止被new
     * @param owner
     */
    IDCard(String owner){
        System.out.println("制作"+ owner + "的ID卡");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("使用"+ owner + "的ID卡");
    }

    public String getOwner() {
        return owner;
    }


}
