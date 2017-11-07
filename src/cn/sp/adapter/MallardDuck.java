package cn.sp.adapter;
/**
 * 绿头鸭是鸭子的子类
 * @author 2YSP
 *
 */
public class MallardDuck implements Duck{

	@Override
	public void quack() {
		System.out.println("Quack quack ");
		
	}

	@Override
	public void fly() {
		System.out.println("I am flying .. .");
		
	}

}
