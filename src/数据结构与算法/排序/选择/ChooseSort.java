package 数据结构与算法.排序.选择;

import java.util.Arrays;

public class ChooseSort {
    public static void main(String[] args) {
        int[] arr =new int[]{5,2,1,6,3,4,8,9,5};
        chooseSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void chooseSort(int[] arr) {
//        遍历所有的数
        for (int i = 0; i <arr.length ; i++) {
            int minIndex=i;
            //                把当前遍历的数和后面所有的数依次进行比较，并记录最下的下标
            for (int j = i; j <arr.length ; j++) {
//
                if (arr[minIndex]>arr[j]){
//                    记录最下的那个书的下标
                    minIndex=j;
                }
            }
//            如果最小的数和当前遍历的数的下标不一致，说明后面的数更小，换位
            if (i!=minIndex){
                int temp=arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=temp;
            }
        }
    }
}
