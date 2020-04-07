package cn.sp.iterator.iter;

import java.util.Iterator;

/**
 * Created by 2YSP on 2020/4/2.
 * 书架
 *
 */
public class BookSelf implements Aggregate {

    private Book[] books;
    /**
     * 书架上书的数量
     */
    private int last = 0;

    public BookSelf(int maxSize){
        books = new Book[maxSize];
    }

    public Book getBookAt(int index){
        return books[index];
    }

    public int getLength(){
        return last;
    }

    public void appendBook(Book book){
        this.books[last] = book;
        last++;
    }

    @Override
    public Iterator iterator() {
        return new BookSelfIterator(this);
    }
}
