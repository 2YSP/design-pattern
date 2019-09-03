package cn.sp.chain._02;

/**
 * Created by 2YSP on 2019/9/3.
 */
public abstract class AbstractLoggerFilter {

  abstract void doFilter(int level,FilterChain filterChain);
}
