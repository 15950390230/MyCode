package 校招真题2018.疯狂的队列;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i <n ; i++) {
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            int min = arr[0];      // 上一次加入疯狂队列的那个最小值
            int max = arr[n - 1];  // 上一次加入疯狂队列的那个最大值
            int diff = max - min;
            int minIndex = 1;       // 未加入疯狂队列的最小值索引
            int maxIndex = n - 2;   // 未加入疯狂队列的最大值索引
            while (minIndex < maxIndex) {
                diff += max - arr[minIndex];
                diff += arr[maxIndex] - min;
                min = arr[minIndex++];
                max = arr[maxIndex--];
            }
            // 原数列中最后一个数 minIndex == maxIndex，将它放到合适的位置上
            diff += Math.max(arr[maxIndex] - min, max - arr[minIndex]);
            System.out.println(diff);
        }
    }
}
