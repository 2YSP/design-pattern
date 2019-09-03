package cn.sp.chain._02;

/**
 * Created by 2YSP on 2019/9/3.
 */
public class ErrorLoggerFilter extends AbstractLoggerFilter {

  private LoggerInfo loggerInfo;

  public ErrorLoggerFilter(LoggerInfo loggerInfo){
    this.loggerInfo = loggerInfo;
  }

  @Override
  void doFilter(int level, FilterChain filterChain) {
    if (loggerInfo.getLevel() <= level){
      System.out.println("Error Console::Logger: " + loggerInfo.getMessage());
    }
    filterChain.doFilter(level,filterChain);
  }
}
