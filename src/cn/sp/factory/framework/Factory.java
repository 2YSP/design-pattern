package cn.sp.factory.framework;

/**
 * Created by 2YSP on 2020/4/10.
 */
public abstract class Factory {

    /**
     * 这里用到了 模板方法模式
     * 使用final修饰 防止被子类重写
     * @param owner
     * @return
     */
    public final Product create(String owner){
        Product product = createProduct(owner);
        registerProduct(product);

        return product;
    }

    protected abstract Product createProduct(String owner);

    protected abstract void registerProduct(Product product);
}
