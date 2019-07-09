package 校招真题2018.拼凑正方形;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String[] strArr=bf.readLine().split(" ");
        int[] arr=new int[strArr.length];
        for (int i = 0; i <strArr.length ; i++) {
            arr[i]=Integer.parseInt(strArr[i]);
        }
        Arrays.sort(arr);
        System.out.println(arr[3]-arr[0]+arr[2]-arr[1]);
    }
}
