package 并发编程.多种创建线程方式.Runnable;
/*runnable接口作为线程任务存在而非线程*/
public class Demo2 implements Runnable {

    @Override
    public void run() {
        while (true){
            System.out.println("线程运行了。。。。。。");

        }
    }

    public static void main(String[] args) {

        Thread thread=new Thread(new Demo2());
        thread.start();

    }
}
