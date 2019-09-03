package cn.sp.chain._02;

/**
 * Created by 2YSP on 2019/9/3.
 */
public class LoggerFilterDemo {

  public static int INFO = 1;
  public static int DEBUG = 2;
  public static int ERROR = 3;

  public static void main(String[] args) {
    ConsoleLoggerFilter consoleLoggerFilter = new ConsoleLoggerFilter(
        new LoggerInfo(INFO, "This is an information."));
    ErrorLoggerFilter errorLoggerFilter = new ErrorLoggerFilter(
        new LoggerInfo(ERROR, "This is an error information."));
    FileLoggerFilter fileLoggerFilter = new FileLoggerFilter(
        new LoggerInfo(DEBUG, "This is an debug level information."));
    FilterChain filterChain = new FilterChain();
    filterChain.addFilter(consoleLoggerFilter);
    filterChain.addFilter(errorLoggerFilter);
    filterChain.addFilter(fileLoggerFilter);

    filterChain.doFilter(ERROR, filterChain);
  }

}
