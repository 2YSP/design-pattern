package cn.sp.test2;

import java.util.Iterator;

/**
 * Created by 2YSP on 2017/7/17.
 */
public class NullIterator implements Iterator{
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
