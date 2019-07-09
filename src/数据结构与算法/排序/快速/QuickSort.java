package 数据结构与算法.排序.快速;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr=new int[]{3,4,6,7,2,7,2,8,0};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
//    递归算法排序
    public static void quickSort(int[] arr,int start, int end){
        if(start<end){
//    数组中的第0个元素作为标准数据
        int stand=arr[start];
        int low=start;
        int high=end;
//        循环找出比标准数字大的和比标准数字小的数
        while(low<high){
//右边的数比标准数字大
            while(low<high&&stand<=arr[high]){
                high--;
            }
//            右边的数替换左边的数
            arr[low]=arr[high];
//            如果左边的数比标准数小
            while(low<high&&arr[low]<=stand){
                low++;
            }
            arr[high]=arr[low];
        }
        arr[low]=stand;
            System.out.println(Arrays.toString(arr));
//        左边数组继续排序
        quickSort(arr,start,low);
//右边数组继续排序
        quickSort(arr,low+1,end);
    }
}
}
