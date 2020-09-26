package cn.sp.worker_thread;

/**
 * Created by 2YSP on 2020/9/26
 *
 *
 */
public class Test {

    public static void main(String[] args) {
        // 新建8个工人
        PackageChannel channel = new PackageChannel(8);
        // 开始工作
        channel.startWorker();

        // 为流水线添加包裹
        for (int i = 0; i < 100; i++) {
            Package req = new Package();
            req.setAddress("test");
            req.setName("test");
            channel.put(req);
        }

    }
}
