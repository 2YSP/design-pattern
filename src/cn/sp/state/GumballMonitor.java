package cn.sp.state;

/**
 * 监视器
 * Created by 2YSP on 2017/7/18.
 */
public class GumballMonitor {
    GumballMachine machine;
    public  GumballMonitor(GumballMachine machine){
        this.machine = machine;
    }

    public void report(){
        System.out.println("Gumball Machine: "+machine.getLocation());
        System.out.println("Current inventory: "+machine.getCount()+" gumballs");
        System.out.println("Current state : "+machine.getState());
    }
}
