package cn.sp.iterator.iter;

import java.util.Iterator;

/**
 * Created by 2YSP on 2020/4/2.
 */
public class Main {
    public static void main(String[] args) {
        BookSelf bookSelf = new BookSelf(4);
        bookSelf.appendBook(new Book("数学"));
        bookSelf.appendBook(new Book("Java编程思想"));
        bookSelf.appendBook(new Book("语文"));
        bookSelf.appendBook(new Book("化学"));

        Iterator iterator = bookSelf.iterator();
        while (iterator.hasNext()){
            Book book = (Book) iterator.next();
            System.out.println(book.getName());
        }
    }
}
