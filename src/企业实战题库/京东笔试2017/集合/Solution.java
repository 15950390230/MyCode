package 企业实战题库.京东笔试2017.集合;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

//给出A、B两个集合求A+B集合
//注意A+B不能有重复
public class Solution {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        while(sc.hasNext()){
//            int numa=sc.nextInt();
//            int numb=sc.nextInt();
//            sc.nextLine();
////            String[] arra=sc.nextLine().split(" ");
////            String[] arrb=sc.nextLine().split(" ");
//
//        }
        String[] arra={"1"};
        String[] arrb={"2","3"};
        Set set=getNewCollection(arra,arrb);
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            Integer str = it.next();
            System.out.print(str+" ");
        }
//        System.out.println(set.toArray().toString());
    }

    private static Set getNewCollection(String[] arra, String[] arrb) {
        Set se=new HashSet();
        for (int i = 0; i < arra.length; i++) {
            se.add(Integer.parseInt(arra[i]));
        }
        for (int i = 0; i < arrb.length; i++) {
            se.add(Integer.parseInt(arrb[i]));
        }
        return se;
    }
}
