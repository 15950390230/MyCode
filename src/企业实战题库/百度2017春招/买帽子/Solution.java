package 企业实战题库.百度2017春招.买帽子;

import java.util.Arrays;
import java.util.Scanner;
//输出第三便宜的帽子
public class Solution {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[arr.length-3]);
    }
}
