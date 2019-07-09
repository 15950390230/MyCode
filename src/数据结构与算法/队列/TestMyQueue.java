package 数据结构与算法.队列;

public class TestMyQueue {
    public static void main(String[] args) {
        MyQueue myQueue=new MyQueue();
//入队
        myQueue.add(9);
        myQueue.add(8);
        myQueue.add(7);
        System.out.println(myQueue.poll());
    }
}
