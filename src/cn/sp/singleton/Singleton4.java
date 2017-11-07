package cn.sp.singleton;
/**
 * 单例模式  --  加锁  -- 多线程版
 * @author 2YSP
 *
 */
public class Singleton4 {
	
	private volatile static Singleton4 singleton ;//volatile 关键字保证变量的可见性
	
	private Singleton4(){
		
	}
	//使用“双重检查加锁”,在getInstance()中减少使用同步，提示效率
	public  static Singleton4 getInstance(){
		if(singleton == null){
			synchronized (Singleton4.class) {
				if(singleton == null){
					singleton = new Singleton4();
				}
			}
		}
		return singleton;
	}
}
