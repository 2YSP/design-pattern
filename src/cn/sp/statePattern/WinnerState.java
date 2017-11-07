package cn.sp.statePattern;

/**
 * Created by 2YSP on 2017/7/18.
 */
public class WinnerState implements State {
    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }
    @Override
    public void insertQuarter() {
        System.out.println("错误信息");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("错误信息");
    }

    @Override
    public void turnCrank() {
        System.out.println("错误信息");
    }

    @Override
    public void dispense() {
        System.out.println("You are a winner!You get two gumballs for your quarter");
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0){
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }else {//数量足够时赢家可以发两次糖果
            gumballMachine.releaseBall();
            if (gumballMachine.getCount() > 0){
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            }else{
                System.out.println("Oops,out of gumballs");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }
}
