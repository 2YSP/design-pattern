package cn.sp.decorator.two;

/**
 * @author 2YSP
 * @date 2020/6/16 21:19
 */
public abstract class Border extends Display{
    /**
     * 被装饰物
     */
    protected Display display;
    // 在生成实例时通过参数指定被装饰物
    protected Border(Display display){
        this.display = display;
    }
}
