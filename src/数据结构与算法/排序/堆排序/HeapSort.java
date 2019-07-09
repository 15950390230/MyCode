package 数据结构与算法.排序.堆排序;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr=new int[]{9,6,8,7,0,1,10,4,2};
//        开始位置为最后一个非叶子节点，最后一个节点的父节点
        System.out.println(Arrays.toString(arr));

    }

    public static void heapSort(int[] arr) {
        int start= (arr.length-1)/2;
//        调整为大顶堆
        for (int i = start; i >=0 ; i--) {
            maxHeap(arr,arr.length,i);
        }
//        把数组中的第0个和堆中的最后一个交换位置在把前面的进行排序变为大顶堆
        for (int i = arr.length; i >0 ; i--) {
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            maxHeap(arr,i,0);
        }
    }
    /* index最后一个节点的父节点*/
    public static void maxHeap(int[] arr ,int size,int index){
//左子节点
        int leftnode = 2*index+1;
//        右边子节点
        int rightnode=2*index+2;
//        首先记录最大节点
        int max=index;
//        和两个子节点分别对比找出最大的节点
        if (leftnode<size&&arr[leftnode]>arr[max]){
            max=leftnode;
        }
        if (leftnode<size&&arr[rightnode]>arr[max]){
            max=rightnode;
        }
//        交换位置
        if(max!=index){
            int temp=arr[index];
            arr[index]=arr[max];
            arr[max]=temp;
            //        交换位置可能会破坏之前的堆
            maxHeap(arr,size,max);
        }

    }
}
