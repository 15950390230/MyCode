package 企业实战题库.京东笔试2017.异或;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
        int n=4;
//        sc.nextLine();
//        char[] num1=sc.nextLine().toCharArray();
//        char[] num2=sc.nextLine().toCharArray();
        char[] num1="1100".toCharArray();
        char[] num2="0100".toCharArray();
        StringBuffer sb=new StringBuffer();
        for (int i = 0; i <n ; i++) {
            if (num1[i]=='1'){
                if (num2[i]=='0'){
                    sb.append('1');
                }
                else sb.append('0');
            }
            else {
                if (num2[i]=='1'){
                    sb.append('1');
                }
                else sb.append('0');
            }
        }
        String s1=sb.toString();
        BigInteger bi = new BigInteger(s1, 2);
        int res=Integer.parseInt(bi.toString());
        System.out.println(res);
    }
}
