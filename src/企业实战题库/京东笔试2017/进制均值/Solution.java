package 企业实战题库.京东笔试2017.进制均值;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            print(sc.nextInt());
        }

    }

    public static void print(Integer A) {
        int sum=0;
        for (int i = 2; i <=A-1 ; i++) {
            sum+=hexnum(A,i);
        }
//约分显示
        System.out.println(yuefen(sum,A-2));
    }
//sum分子，i分母
    private static String yuefen(int sum, int i) {
        int yueshu=getyue(sum,i);
        int fenzi=sum/yueshu;
        int fenmu=i/yueshu;
        return ""+fenzi+"/"+fenmu;
    }

    private static int getyue(int sum, int i) {
        for (int j = i; j >=1; j--) {
            if (sum%j==0&&i%j==0){
                return j;
            }
        }
        return 1;
    }

    //n数字，a进制
    private static int hexnum(int n,int a){
        int sum=0;
        while (n>0){
            sum+=n%a;
            n=n/a;
        }
        return sum;
    }
}
