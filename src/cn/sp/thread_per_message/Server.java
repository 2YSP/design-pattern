package cn.sp.thread_per_message;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * thread-Per-Message模式即每个消息一个线程
 * 一个线程监听 I/O 事件，每当监听到一个 I/O 事件，则交给另一个处理线程执行 I/O 操作
 * Created by 2YSP on 2020/9/26
 */
public class Server {

    private static int DEFAULT_PORT = 12345;
    private static ServerSocket serverSocket;

    public static void start() throws IOException {
        start(DEFAULT_PORT);
    }

    private static void start(int port) throws IOException {
        if (serverSocket != null){
            return;
        }
        try {
            // 启动服务
            serverSocket = new ServerSocket(port);
            // 通过无限循环监听客户端连接
            while (true){
                Socket socket = serverSocket.accept();
                // 当有新的客户端接入时，会执行下面的代码
                long start = System.currentTimeMillis();
                new Thread(new ServerHandler(socket)).start();
                long end = System.currentTimeMillis();
                System.out.println("Spend time is "+ (end - start));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (serverSocket != null){
                System.out.println("服务器已经关闭");
                serverSocket.close();
            }
        }

    }


    public static void main(String[] args) {
        // 运行服务端
        new Thread(()->{
            try {
                Server.start();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
