package cn.sp.singleton;
/**
 * 单例模式  --  立即创建  -- 多线程版
 * @author 2YSP
 *
 */
public class Singleton3 {
	
	private static Singleton3 singleton = new Singleton3();
	
	private Singleton3(){
		
	}
	//如果应用程序总是创建并使用单件实例，或者在创建和运行方面的负担不太繁重，可使用此方法
	public  static Singleton3 getInstance(){
		
		return singleton;
	}
}
