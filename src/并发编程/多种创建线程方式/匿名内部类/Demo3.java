package 并发编程.多种创建线程方式.匿名内部类;

public class Demo3 {
    public static void main(String[] args) {

/*方法1匿名子类*/
        /*new Thread(){
            public void run(){
                while (true) {
                    System.out.println("线程运行了///////");
                }
    };
        }.start();*/
        /*方法2*/
//        匿名内部类
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("线程运行了///////");
                }
            }
        })//为什么执行子类而不执行runnable任务
//            动态绑定 （多态）
        {
            public void run(){
                while (true) {
                    System.out.println("线程运行了。。。。。。");
                }
            };
        }.start();
    }
}
