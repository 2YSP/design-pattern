package cn.sp.proxy.dynamic.jdk;

/**
 * Created by 2YSP on 2019/10/24.
 */
public class UserServiceImpl implements UserService {

  @Override
  public void add() {
    System.out.println("-------- add -------");
  }
}
