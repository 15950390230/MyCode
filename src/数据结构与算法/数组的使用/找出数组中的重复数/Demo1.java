package 数据结构与算法.数组的使用.找出数组中的重复数;

import java.util.Hashtable;
import java.util.Iterator;

public class Demo1 {
    public static void main(String[] args) {
        int[] arr=new int[]{4,8,6,4,8,5,2,7,8,1};
        dublicate(arr);
    }
    public static void dublicate(int[] args){
        Hashtable<Integer,Integer> hashTable=new Hashtable<>();
        hashTable.put(args[0],1);
        for (int i = 0; i <args.length ; i++) {
            if (hashTable.containsKey(args[i])){
                int n=Integer.parseInt(hashTable.get(args[i]).toString());
                hashTable.put(args[i],++n);
            }
            else{
                hashTable.put(args[i],1);
            }
        }
        for(Iterator<Integer> iterator = hashTable.keySet().iterator(); iterator.hasNext();)
        {
            Integer key=iterator.next();
        System.out.println(key+"出现的次数为"+hashTable.get(key));

        }

    }
}
