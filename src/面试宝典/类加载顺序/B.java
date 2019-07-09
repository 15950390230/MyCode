package 面试宝典.类加载顺序;

public class B {
//    链接：https://www.nowcoder.com/questionTerminal/ab6eb06face84c4e81ab5bc6f0f7f258?orderByHotValue=1&questionTypes=100000&mutiTagIds=570_639&page=1&onlyReference=false
//    来源：牛客网
//    总的来说，初始化顺序依次是：（静态变量、静态初始化块）–>（变量、初始化块）–> 构造器；
// 如果有父类，则顺序是：父类static方法 –> 子类static方法 –> 父类构造方法- -> 子类构造方法

    public static B t1 = new B();
    public static B t2 = new B();
    {
        System.out.println("构造块");
    }
    static
    {
        System.out.println("静态块");
    }
    public static void main(String[] args)
    {
        B t = new B();
    }
}
/*链接：https://www.nowcoder.com/questionTerminal/ab6eb06face84c4e81ab5bc6f0f7f258?orderByHotValue=1&questionTypes=100000&mutiTagIds=570_639&page=1&onlyReference=false
来源：牛客网

开始时JVM加载B.class，对所有的静态成员进行声明，t1  t2被初始化为默认值，为null，
又因为t1  t2需要被显式初始化，所以对t1进行显式初始化，初始化代码块→构造函数（
没有就是调用默认的构造函数），咦！静态代码块咋不初始化？
因为在开始时已经对static部分进行了初始化，虽然只对static变量进行了初始化，
但在初始化t1时也不会再执行static块了，因为JVM认为这是第二次加载类B了，
所以static会在t1初始化时被忽略掉，所以直接初始化非static部分，
也就是构造块部分（输出''构造块''）接着构造函数（无输出）。
接着对t2进行初始化过程同t1相同（输出'构造块'），
此时就对所有的static变量都完成了初始化，接着就执行static块部分
（输出'静态块'），接着执行，main方法，同样也，new了对象，
调用构造函数输出（'构造块'）*/
