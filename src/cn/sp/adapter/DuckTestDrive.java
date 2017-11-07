package cn.sp.adapter;
/**
 * 适配器模式
 * @author 2YSP
 *
 */
public class DuckTestDrive {
	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();
		
		WildTurkey turkey = new WildTurkey();
		
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		System.out.println("The Turkey says ...");
		turkey.gobble();
		turkey.fly();
		
		System.out.println("\nThe Duck says ...");
		duck.quack();
		duck.fly();
		
		System.out.println("\nThe turkeyAdapter says ...");
		turkeyAdapter.quack();
		turkeyAdapter.fly();
	}
	
}
