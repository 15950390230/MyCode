package 并发编程.多种创建线程方式.线程池;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/*线程池的实现*/
public class Demo6 {
    public static void main(String[] args) {
//        创建固定容量的的线程池
//        ExecutorService threadPool= Executors.newFixedThreadPool(10);
//        非固定容量的线程池
        ExecutorService threadPool= Executors.newCachedThreadPool();
        for (int i = 0; i < 100 ; i++) {
        threadPool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        });
    }
         threadPool.shutdown();
 }
}