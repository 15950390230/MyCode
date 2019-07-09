package 校招真题2018.判断题;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String[] arr=bf.readLine().split(" ");
        Integer[] intArr=new Integer[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            intArr[i]=Integer.parseInt(arr[i]);
//        }
        Integer n=Integer.parseInt(arr[0]);
        Integer t=Integer.parseInt(arr[1]);
        Integer a=Integer.parseInt(arr[2]);
if (t>=a){
    System.out.println(n-t+a);
}
else{
    System.out.println(n-a+t);
}

    }
}
