package 面试宝典.数组的操作.两个子有序数组的排序;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[] arr=new int[]{1,3,5,7,9,2,4,6,8,10};
        sortArr(arr,5);
        System.out.println(Arrays.toString(arr));
    }
    public static void SortRight(int[] arr,int mid){
        int len=arr.length;
        int temp;
//        对于mid右面的数进行重排序；
        for (int i = mid; i <len-2 ; i++) {
            if (arr[i]>arr[i+1]){
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
    }
    public static  void sortArr(int[] arr,int mid){
        int len=arr.length;
        int temp;
        for (int i = 0; i < mid; i++) {
            if(arr[i]>arr[mid]){
                temp=arr[i];
                arr[i]=arr[mid];
                arr[mid]=temp;
                SortRight(arr,mid);
            }
        }
    }
}
