package cn.sp.chain._02;

/**
 * Created by 2YSP on 2019/9/3.
 */
public class LoggerInfo {

  private int level;

  private String message;

  public LoggerInfo(int level, String message) {
    this.level = level;
    this.message = message;
  }

  public int getLevel() {
    return level;
  }

  public void setLevel(int level) {
    this.level = level;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
