package cn.sp.test2;

import java.util.Iterator;
import java.util.Stack;

/**
 * Created by 2YSP on 2017/7/17.
 */
public class CompsiteIterator implements Iterator {
   Stack stack =  new Stack();

   public CompsiteIterator(Iterator iterator){
       stack.push(iterator);//入栈
   }

   public Object next(){
        if (hasNext()){
            Iterator iterator = (Iterator) stack.peek();
            MenuComponent component = (MenuComponent) iterator.next();
            if (component instanceof  Menu){
                stack.push(component.createIterator());
            }
            return component;
        }else{
            return  null;
        }

   }

   public boolean hasNext(){
       if (stack.isEmpty()){//先判断堆栈是否被清空
           return  false;
       }else {
           //否则，就从栈顶取出迭代器
           Iterator iterator = (Iterator) stack.peek();
           if (! iterator.hasNext()){
               //如果没有，就将它弹出栈，然后递归调用hasNext()
               stack.pop();
               return hasNext();
           }else {//有
               return  true;
           }
       }
   }

   public void remove(){
       throw  new UnsupportedOperationException();
   }
}
