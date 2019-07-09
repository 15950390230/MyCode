package 企业实战题库.京东笔试2017.拍卖产品;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int m=sc.nextInt();
//        sc.nextLine();
//        int[] arr=new int[m];
//        String[] sb=sc.nextLine().split(" ");
//        for (int i = 0; i < m; i++) {
//            arr[i]=Integer.parseInt(sb[i]);
//        }
        int n=5;
        int m=4;
        int[] arr={2,8,10,7};
        Arrays.sort(arr);
        int res=0;
        int index=0;
        for (int i = 0; i < m; i++) {
            if (res<arr[i]*Math.min(n,m-i)){
                res=arr[i]*Math.min(n,m-i);
                index=arr[i];
            }
        }
        System.out.println(index);
    }
}
