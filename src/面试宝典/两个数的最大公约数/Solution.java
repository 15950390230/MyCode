package 面试宝典.两个数的最大公约数;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个正整数：");
        int a=sc.nextInt();
        System.out.println("请输入第二个正整数：");
        int b=sc.nextInt();
        System.out.println(a+"和"+b+"的最大公约数为："+getGCD(a,b));
    }

    private static int getGCD(int x , int y) {
        int num=1;
        // 定义一个变量num,来保存最大公约数
         for (int i = 1; i <=x; i++) {
             // 遍历1到x的所有整数
              	if (x%i==0 && y%i==0) {                   //  如果有一个数同时满足被x,y整除
              	     num=i;                                     //  将这个数保存到num变量
                     }
         }
         return num;
    }
//求最大公约数
    private static int getGCD2(int x , int y) {
        if (y == 0)
            return x;
        else
            return getGCD2(y, x % y);
    }
    }


