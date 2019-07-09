package 校招真题2018.排序之最小移动次数;

import java.util.Arrays;
import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int[] numssort = new int[n];
        numssort=arr.clone();
        Arrays.sort(numssort);
        int count=0;
        for(int j = 0;j<n;j++){
            if(arr[j]!=numssort[j])
                count++;
        }
        System.out.println(count);

    }

}
