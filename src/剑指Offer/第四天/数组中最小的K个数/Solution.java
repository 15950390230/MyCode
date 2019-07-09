package 剑指Offer.第四天.数组中最小的K个数;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    //方法1
    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        if(k>input.length){
            return al;
        }
        else{

            Arrays.sort(input);
            for (int i = 0; i <k ; i++) {
                al.add(input[i]);
            }
            return al;
        }
    }
//    方法二
public static  ArrayList<Integer> GetLeastNumbers(int [] input, int k){
    ArrayList<Integer> al = new ArrayList<Integer>();
    if(k>input.length){
        return al;
    }
//冒泡排序
    else{
        int len=input.length;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j <len-i-1 ; j++) {
                if (input[j]<input[j+1]){
                    int temp=input[j];
                    input[j]=input[j+1];
                    input[j+1]=temp;
                }
            }
            al.add(input[input.length - i - 1]);
        }
        return al;
    }
}

    public static void main(String[] args) {
        int[] arr=new int[]{4,5,1,6,2,7,3,8};
        int k=4;
        ArrayList<Integer> a=GetLeastNumbers_Solution(arr,k);
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
    }
}
