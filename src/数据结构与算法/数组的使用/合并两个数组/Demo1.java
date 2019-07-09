package 数据结构与算法.数组的使用.合并两个数组;

import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        int[] arr1=new int[]{3,1,7,6,2,5,9};
        int[] arr2=new int[]{8,1,7,5,8,7,4};
//        int[] newArr=sort(arr1);
        int[] newArr=heBinSort(arr1,arr2);
        System.out.println(Arrays.toString(newArr));
    }

    public static int[] heBinSort(int[] arr1,int[] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int[] temp=new int[arr1.length+arr2.length];
        int j=0;
        int i=0;
        int ind=0;
        while (i<arr1.length&&j<arr2.length){
            if (arr1[i]<=arr2[j]){
                temp[ind++]=arr1[i++];
            }
            else{
                temp[ind++]=arr2[j++];
            }
        }
        //处理多于向
        while (i<arr1.length){
            temp[ind++]=arr1[i++];
        }
        while (j<arr2.length){
            temp[ind++]=arr2[j++];
        }
        return temp;
    }

        //冒泡排序
    public static int[] sort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j <  arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    //交换位置
}
