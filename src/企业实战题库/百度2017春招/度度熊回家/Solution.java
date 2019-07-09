package 企业实战题库.百度2017春招.度度熊回家;

import java.util.Scanner;

//一个数轴上共有N个点，第一个点的坐标是度度熊的位置，第N-1个点是度度熊的家。
//现在它需要一次从零号坐标走到N-1号坐标，但是除了0号坐标和N-1号坐标，
// 它可以在其余的N-2个坐标中选出一个点，并且将这个点直接忽略掉，
//问度度熊回家至少要走多少距离
public class Solution {
    public static void main(String[] args) {
//分析暴力枚举忽略的点维护答案
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
//        int n=4;
//        int[] arr={1,4,-1,3};
        int res=0;
        int min=Integer.MAX_VALUE;
        for (int j=2;j<n-1;j++){
           for (int i = 1; i < n; i++) {
               if (i==j){
                  continue;
                }
               else{
                   if (i==j+1){
                    res+=Math.abs(arr[i]-arr[i-2]);
               }
               else {
                   res+=Math.abs(arr[i]-arr[i-1]);
               }
               }
           }
           min=Math.min(min,res);
        }
        System.out.println(min);
    }
}
