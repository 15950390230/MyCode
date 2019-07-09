package 并发编程.多种创建线程方式.Lambda表达式;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo7 {
    public int add(List<Integer> values){

        return values.parallelStream().mapToInt(a -> a).sum();
//        values.parallelStream().forEach(System.out :: println);//并行
//        System.out.println("-----------");
//        values.parallelStream().forEachOrdered(System.out :: println);//串行
//        System.out.println("-----------");
//        values.stream().forEach(System.out :: println);//串行
//        return 0;
    }

    public static void main(String[] args) {
        List<Integer> values= Arrays.asList(10,20,30,40);
        int res=new Demo7().add(values);
        System.out.println("计算结果："+res);
    }
    public final static  int letitgou(){
        return 0;
    }
}
