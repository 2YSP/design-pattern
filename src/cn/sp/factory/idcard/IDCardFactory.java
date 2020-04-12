package cn.sp.factory.idcard;

import cn.sp.factory.framework.Factory;
import cn.sp.factory.framework.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 2YSP on 2020/4/10.
 */
public class IDCardFactory extends Factory {

    private List<String> owners = new ArrayList<>();

    /**
     * 通过生成IDCard实例来生产产品
     * @param owner
     * @return
     */
    @Override
    protected Product createProduct(String owner) {

        return new IDCard(owner);
    }

    /**
     * 通过将IDCard的owner保存到owners来注册产品
     * @param product
     */
    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard) product).getOwner());
    }
}
