package cn.sp.iterator.iter;

import java.util.Iterator;

/**
 * Created by 2YSP on 2020/4/2.
 */
public class BookSelfIterator implements Iterator {

    private BookSelf bookSelf;
    private int index;

    public BookSelfIterator(BookSelf bookSelf){
        this.bookSelf = bookSelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if (index < bookSelf.getLength()){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Object next() {
        Book book = bookSelf.getBookAt(index);
        index++;
        return book;
    }
}
