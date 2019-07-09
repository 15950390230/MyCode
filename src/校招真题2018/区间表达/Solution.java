package 校招真题2018.区间表达;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(bf.readLine());
        String[] strArr=bf.readLine().split(" ");
        int[] arr=new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            arr[i]=Integer.parseInt(strArr[i]);
        }
        int sum=1;
        for(int i=0;i<arr.length-1;i++){
            if((arr[i] + 1) == arr[i+1]){
                continue;
            }
            sum ++;
        }
        System.out.println(sum);
    }
}
