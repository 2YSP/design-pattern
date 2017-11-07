package cn.sp.proxy;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by 2YSP on 2017/10/9.
 */
public class MyArrayList<AnyType> implements Iterable<AnyType> {

    private static  final  int DEFAULT_CAPACITY = 10;

    private int theSize;
    private AnyType[] theItems;

    public MyArrayList(){
        doClear();
    }

    private void doClear() {
        theSize = 0;
        ensureCapacity(DEFAULT_CAPACITY);
    }

    public int size(){
        return theSize;
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    public void trimToSize(){
        ensureCapacity(size());
    }

    /**
     * 获取角标处的值
     * @param idx
     * @return
     */
    public AnyType get(int idx){
        if (idx < 0 || idx >= size()){
            //角标越界异常
            throw new ArrayIndexOutOfBoundsException();
        }

        return theItems[idx];
    }

    /**
     * 替换目标位置的值，并返回旧值
     * @param idx
     * @param newVal
     * @return
     */
    public AnyType set(int idx , AnyType newVal){
        if (idx < 0 || idx >= size()){
            //角标越界异常
            throw new ArrayIndexOutOfBoundsException();
        }

        AnyType old = theItems[idx];
        theItems[idx] = newVal;
        return old;
    }

    public void ensureCapacity(int newCapacity) {
        if (newCapacity < theSize){
            return;
        }

        AnyType[] old = theItems;
        theItems = (AnyType[]) new Object[newCapacity];
        for(int i = 0 ;i < old.length ; i++){
            theItems[i] = old[i];
        }
    }

    public boolean add(AnyType x){
        add(size(),x);
        return true;
    }

    public void add(int idx,AnyType x){
        if (theItems.length == size()){
            //如果已满则扩容为之前的两倍
            ensureCapacity(size()*2 + 1);
        }

        for (int i = theSize ; i > idx ; i--){
            theItems[i] = theItems[i-1];//依次后挪
        }

        theItems[idx] = x;
        theSize++;
    }

    public AnyType remove(int idx){
        AnyType removedItem = theItems[idx];
        for(int i = idx ; i <size()-1;i++){//依次前移
            theItems[i] = theItems[i+1];
        }
        theSize--;
        return removedItem;
    }

    @Override
    public Iterator<AnyType> iterator() {
        return new ArrayListIterator();
    }

    private class ArrayListIterator<AnyType> implements Iterator<AnyType>{

        private int current = 0;

        @Override
        public boolean hasNext() {
            return current < size();
        }

        @Override
        public AnyType next() {
            if (!hasNext()){
                throw new NoSuchElementException();
            }

            return (AnyType) theItems[ current++ ];
        }

        @Override
        public void remove() {
            MyArrayList.this.remove(current--);
        }
    }
}
