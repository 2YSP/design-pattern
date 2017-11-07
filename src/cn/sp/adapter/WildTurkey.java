package cn.sp.adapter;
/**
 * 野生火鸡
 * @author 2YSP
 *
 */
public class WildTurkey implements Turkey{

	@Override
	public void gobble() {
		System.out.println("Gobble gobble");
	}

	@Override
	public void fly() {
		System.out.println("I'm flying a short distance");
		
	}

}
