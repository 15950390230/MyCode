package 数据结构与算法.排序.插入;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] arr=new int[]{3,4,6,7,2,7,2,8,0};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }


    protected static void insertSort(int[] arr){
//        遍历所有数字
        for (int i = 1; i <arr.length ; i++) {
//            如果当前数字比前一个小
            if (arr[i]<arr[i-1]){
//                把当前数字存起来
                int temp=arr[i];
//                遍历当前数字前面所有数字
                int j;
                for (j = i-1; j>=0&&temp<arr[j]; j--) {
                    arr[j+1]=arr[j];
                }
                arr[j+1]=temp;
            }
        }

    }
}
