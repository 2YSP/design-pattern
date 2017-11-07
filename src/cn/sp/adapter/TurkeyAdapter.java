package cn.sp.adapter;
/**
 * 适配器，火鸡冒充鸭子
 * @author 2YSP
 *
 */
public class TurkeyAdapter implements Duck {
	Turkey turkey;
	
	public TurkeyAdapter(Turkey turkey){
		this.turkey = turkey;
	}
	@Override
	public void quack() {//其实调用的是火鸡的行为
		turkey.gobble();
	}

	@Override
	public void fly() {
		for(int i = 0 ; i<5 ; i++){
			turkey.fly();
		}
	}

	

}
