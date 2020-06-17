package cn.sp.decorator.two;

/**
 * @author 2YSP
 * @date 2020/6/16 21:07
 */
public abstract class Display {

  /**
   * 获取横向字符数
   *
   * @return
   */
  protected abstract int getColumns();

  /**
   * 获取纵向行数
   *
   * @return
   */
  protected abstract int getRows();

  /**
   * 获取第row行的字符串
   *
   * @param row
   * @return
   */
  protected abstract String getRowText(int row);

  /**
   * 显示全部（用到了模板方法）
   */
  public final void show() {
    for (int i = 0; i < getRows(); i++) {
      System.out.println(getRowText(i));
    }
  }
}
