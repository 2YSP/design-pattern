package cn.sp.chain;

/**
 * Created by 2YSP on 2019/9/1.
 */
public class ErrorLogger extends AbstractLogger {

  public ErrorLogger(int level){
    this.level = level;
  }

  @Override
  protected void write(String message) {
    System.out.println("Error Console::Logger: " + message);
  }
}
