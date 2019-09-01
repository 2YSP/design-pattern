package cn.sp.chain;

/**
 * Created by 2YSP on 2019/9/1.
 */
public class ChainPatternDemo {

  public static void main(String[] args) {
    AbstractLogger loggerChain = getChainOfLoggers();
    loggerChain.logMessage(AbstractLogger.INFO,
        "This is an information.");

    loggerChain.logMessage(AbstractLogger.DEBUG,
        "This is an debug level information.");

    loggerChain.logMessage(AbstractLogger.ERROR,
        "This is an error information.");

  }

  private static AbstractLogger getChainOfLoggers(){
    ErrorLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
    FileLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
    ConsoleLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

    errorLogger.setNextLogger(fileLogger);
    fileLogger.setNextLogger(consoleLogger);
    return errorLogger;
  }

  

}
