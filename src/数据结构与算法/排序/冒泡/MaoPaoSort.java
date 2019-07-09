package 数据结构与算法.排序.冒泡;

import java.util.Arrays;

public class MaoPaoSort {
    public static void main(String[] args) {
int[] arr=new int[]{1,8,5,7,3,2,6};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
public static void bubbleSort(int[] arr){
//        第几轮比较
    for (int i = 0; i <arr.length-1 ; i++) {
//        比较的次数
        for (int j = 0; j <arr.length-1-i ; j++) {
            if (arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }

    }
}
}
