package cn.sp.thread_context;

import java.util.stream.IntStream;

/**
 *
 * Created by 2YSP on 2020/9/26
 */
public class ContextTest {

    public class Context{

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

    /**
     * 设置上下文名字
     */
    public class QueryNameAction{
        public void execute(Context context){
            try {
                Thread.sleep(1000L);
                String name = Thread.currentThread().getName();
                context.setName(name);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 设置上下文ID
     */
    public class QueryIdAction{
        public void execute(Context context){
            try {
                Thread.sleep(1000L);
                long id = Thread.currentThread().getId();
                context.setId(id);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public class ExecutionTask implements Runnable{

        private QueryIdAction queryIdAction = new QueryIdAction();
        private QueryNameAction queryNameAction = new QueryNameAction();


        @Override
        public void run() {
            final Context context = new Context();
            queryNameAction.execute(context);
            System.out.println("the name query successful");
            queryIdAction.execute(context);
            System.out.println("the id query successful");

            System.out.println("The Name is "+context.getName()+" and id " + context.getId());
        }
    }

    public static void main(String[] args) {
        IntStream.range(1,5).forEach(i->new Thread(new ContextTest().new ExecutionTask()).start());
    }
}
