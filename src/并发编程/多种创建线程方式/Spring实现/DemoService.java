package 并发编程.多种创建线程方式.Spring实现;

//@Service
public class DemoService {
//    注解启动异步
//    @Async
    public void a() throws InterruptedException {
        while (true){
            System.out.println("a执行了");
            Thread.sleep(1000);

        }
    }
    //    @Async
    public void b(){
        while (true){
            System.out.println("B执行了");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
