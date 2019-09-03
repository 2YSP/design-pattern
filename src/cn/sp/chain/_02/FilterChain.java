package cn.sp.chain._02;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 2YSP on 2019/9/3.
 */
public class FilterChain extends AbstractLoggerFilter {

  private int pos;

  private List<AbstractLoggerFilter> loggerFilterList;


  public void addFilter(AbstractLoggerFilter loggerFilter) {
    if (loggerFilterList == null) {
      loggerFilterList = new ArrayList<>();
    }
    loggerFilterList.add(loggerFilter);
  }

  @Override
  void doFilter(int level, FilterChain filterChain) {
    if (pos == loggerFilterList.size()) {
      return;
    }
    filterChain.loggerFilterList.get(pos++).doFilter(level, filterChain);
  }


}
