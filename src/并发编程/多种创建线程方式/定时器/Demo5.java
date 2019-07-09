package 并发编程.多种创建线程方式.定时器;

/*quartz框架*/
import java.util.Timer;
import java.util.TimerTask;

public class Demo5 {
    public static void main(String[] args) {
        Timer timer=new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
//                实现定时任务
                System.out.println("timertask is Run");
            }
        },0, 1000);
    }
}
