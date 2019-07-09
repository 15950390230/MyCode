package 并发编程.多种创建线程方式.Thread;
//创建线程方法1
//实现runnable接口
//重写Run方法
/*
* 创建线程的多种方式
* 继承Thread类
* 实现runnable接口
* */
public class NewThread implements Runnable {

    @Override
    public synchronized void run() {
//        线程执行代码体
        while (true){

            try {
//                Thread.sleep(100);//进入超时等待时间到了开始进入到就绪状态与其他线程抢占CPU资源
                wait();        //  等待状态是一个对象的方法并非静态方法

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("自定义线程启动了");

        }
    }

    public static void main(String[] args) {
       NewThread newThread= new NewThread();
        Thread thread=new Thread(newThread);//创建线程
        thread.start();
        while (true){
//            同步代码块
            synchronized (newThread){

                System.out.println("主线程启动了");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                newThread.notifyAll();
            }


        }
    }
}
