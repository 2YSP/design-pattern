package cn.sp.chain._02;

/**
 * Created by 2YSP on 2019/9/3.
 */
public class FileLoggerFilter extends AbstractLoggerFilter {

  private LoggerInfo loggerInfo;

  public FileLoggerFilter(LoggerInfo loggerInfo){
    this.loggerInfo = loggerInfo;
  }

  @Override
  void doFilter(int level, FilterChain filterChain) {
    if (loggerInfo.getLevel() <= level){
      System.out.println("File::Logger: " + loggerInfo.getMessage());
    }
    filterChain.doFilter(level,filterChain);
  }
}
