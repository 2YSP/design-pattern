package cn.sp.thread_context;


import java.util.stream.IntStream;

/**
 * 线程上下文设计模式
 * Created by 2YSP on 2020/9/26
 */
public class ContextTest2 {


    public static class Context{

        private String name;
        private long id;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }
    }

    public final static class ActionContext{
        private static final ThreadLocal<Context> threadLocal = ThreadLocal.withInitial(()-> new Context());

        public static ActionContext getActionContext(){
            return ContextHolder.ACTION_CONTEXT;
        }

        public Context getContext(){
            return threadLocal.get();
        }

        /**
         * 获取ActionContext单例
         */
        public static class ContextHolder{
            private final static ActionContext ACTION_CONTEXT = new ActionContext();
        }
    }

    /**
     * 设置上下文名字
     */
    public class QueryNameAction{
        public void execute(){
            try {
                Thread.sleep(1000L);
                String name = Thread.currentThread().getName();
                ActionContext.getActionContext().getContext().setName(name);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 设置上下文ID
     */
    public class QueryIdAction{
        public void execute(){
            try {
                Thread.sleep(1000L);
                long id = Thread.currentThread().getId();
                ActionContext.getActionContext().getContext().setId(id);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public class ExecutionTask implements Runnable{

        private QueryNameAction queryNameAction = new QueryNameAction();

        private QueryIdAction queryIdAction = new QueryIdAction();

        @Override
        public void run() {
            queryNameAction.execute();
            System.out.println("the name query successful");
            queryIdAction.execute();
            System.out.println("the id query successful");
            System.out.println("The Name is "+ActionContext.getActionContext().getContext().getName()+" and id "+
                    ActionContext.getActionContext().getContext().getId());
        }
    }

    public static void main(String[] args) {
        IntStream.range(1,5).forEach(i-> new Thread(new ContextTest2().new ExecutionTask()).start());
    }
}
