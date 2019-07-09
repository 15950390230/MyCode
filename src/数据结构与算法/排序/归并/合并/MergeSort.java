package 数据结构与算法.排序.归并.合并;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr=new int[]{1,4,5,2,3,6,8,10};
        System.out.println(Arrays.toString(arr));
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
//递归方法归并数组
    public static void mergeSort(int[] arr,int low,int high) {
        int middle = (low + high) / 2;
        if (low < high) {
//        处理左边
            mergeSort(arr, low, middle);
//        处理右边
            mergeSort(arr, middle + 1, high);
//        归并
            merge(arr, low, middle, high);

        }
    }

    public static void merge(int[] arr,int low,int middle, int high) {

//        用于存储归并后的临时数组
        int temp[]=new int[high-low+1];
//记录第一个数组中需要遍历的下表
        int i=low;
//        记录第二个数组中需要遍历的下标
        int j=middle+1;
//用于临时数组中存放的下标
        int index=0;
//        循环遍历两个数组取出小的字，放入临时数组中
        while(i<=middle&&j<=high){
            //第一个数组中的数据更小则替换临时数组中的index的索引位置并让下标后移
            if (arr[i]<=arr[j]){
                temp[index]=arr[i];
                i++;

            }
            else{
                temp[index]=arr[j];
                j++;
            }
            index++;

        }
//        处理多余的数据
        while(j<=high){
            temp[index]=arr[j];
            j++;
            index++;

        }
        while(i<=middle){
            temp[index]=arr[i];
            i++;
            index++;

        }
//        把临时数组中的数据还回去重新存入原数组
        for (int k = 0; k < temp.length; k++) {
            arr[k+low]=temp[k];
        }
        String sizeof="";
    }
}
