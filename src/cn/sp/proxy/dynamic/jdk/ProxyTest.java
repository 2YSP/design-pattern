package cn.sp.proxy.dynamic.jdk;

/**
 * Created by 2YSP on 2019/10/24.
 */
public class ProxyTest {

  public static void main(String[] args) {
    UserService userService = new UserServiceImpl();

    MyInvocationHandler invocationHandler = new MyInvocationHandler(userService);

    UserService proxy = (UserService) invocationHandler.getProxy();

    proxy.add();
  }

}
