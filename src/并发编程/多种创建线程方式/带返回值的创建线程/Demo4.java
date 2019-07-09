package 并发编程.多种创建线程方式.带返回值的创建线程;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
/*（1）第一步：创建Callable子类的实例化对象
（2）第二步：创建FutureTask对象，并将Callable对象传入FutureTask的构造方法中
（注意：FutureTask实现了Runnable接口和Future接口）
 (3)第三步：实例化Thread对象，并在构造方法中传入FurureTask对象
 (4)第四步：启动线程*/
public class Demo4 implements Callable {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Demo4 demo4=new Demo4();
        FutureTask<Integer> task=new FutureTask<Integer>(demo4);
        Thread thread=new Thread(task);
        thread.start();
        System.out.println("我先干点别的。。。。。");
        Integer result=(Integer) task.get();
        System.out.println(result);
    }
    @Override
    public Integer call() throws Exception {
        System.out.println("这个线程执行了");
        Thread.sleep(1000);
        return 1;
    }
}
