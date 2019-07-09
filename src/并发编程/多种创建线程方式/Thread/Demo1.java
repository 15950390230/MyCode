package 并发编程.多种创建线程方式.Thread;

public class Demo1 extends Thread {


    @Override
    public void run() {
        while (!interrupted()){
            System.out.println(getName()+"线程执行了========");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public Demo1(String name) {
        super(name);
    }

    public static void main(String[] args) throws InterruptedException {
        Demo1 demo11=new Demo1("first-thread");
        Demo1 demol2=new Demo1("second-thread");

      /*  demo11.setDaemon(true);//守护线程//支持型线程
//        主线程退出后支持型线程跟着退出
        demol2.setDaemon(true);*/
        demo11.start();
        demol2.start();
   demo11.interrupt();//终止线程
    }
}
