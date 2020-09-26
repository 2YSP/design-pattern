package cn.sp.worker_thread;

/**
 * 包裹类
 * Created by 2YSP on 2020/9/26
 */
public class Package {

    private String name;

    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void execute(){
        System.out.println(Thread.currentThread().getName()+" executed "+this);
    }
}
