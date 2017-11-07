package cn.sp.singleton;
/**
 * 单例模式  --  使用懒加载  -- 多线程版
 * @author 2YSP
 *
 */
public class Singleton2 {
	
	private static Singleton2 singleton;
	
	private Singleton2(){
		
	}
	
	public synchronized static Singleton2 getInstance(){//使用同步，但是执行效率降低
		if(singleton == null){
			singleton = new Singleton2();
		}
		
		return singleton;
	}
}
