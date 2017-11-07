package cn.sp.singleton;
/**
 * 单例模式  --  使用懒加载  -- 只适合单线程
 * @author 2YSP
 *
 */
public class Singleton {
	
	private static Singleton singleton;
	
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){//但是如果是多线程的话，会产生不同的实例，而不是一个独一无二的对象
		if(singleton == null){
			singleton = new Singleton();
		}
		
		return singleton;
	}
}
