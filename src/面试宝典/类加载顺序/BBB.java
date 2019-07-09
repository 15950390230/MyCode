package 面试宝典.类加载顺序;

public class BBB extends Object{
    static {
        System.out.println("Load BBB");//1
    }
    public BBB(){
        System.out.println("Create BBB");//4
    }
    static {
        System.out.println("Load BBB");//2
    }

}

class AAA extends BBB{
    static {
        System.out.println("Load AAA");//3
    }
    public AAA(){
        System.out.println("Create AAA");//5
    }
}
 class TestClass{
    public static void main(String[] args) {
        new AAA();
    }
}
