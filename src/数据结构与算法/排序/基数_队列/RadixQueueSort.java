package 数据结构与算法.排序.基数_队列;

import 数据结构与算法.队列.MyQueue;

import java.util.Arrays;

// 用队列实现基数排序
public class RadixQueueSort {
    public static void main(String[] args) {
        int[] arr = new int[]{24,6,489,75,9,287,56,1,798,34,65,652,5};
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void radixSort(int[] arr) {
//         获取数组中的最大数字
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
//        System.out.println(max);
//       计算最大位数的位数
        int maxlength=(max+"").length();
//          用队列替换
        MyQueue[] temp=new MyQueue[10];
//        为队列数组赋值
        for (int i = 0; i < temp.length; i++) {
            temp[i]=new MyQueue();
        }
//        根据最大位数确定比较次数
        for (int i = 0,n=1; i < maxlength; i++,n*=10) {
//            把每一个数分别计算余数
            for (int j = 0; j < arr.length; j++) {
//                计算余数
                int ys=arr[j]/n%10;
//用于临时存储数据的队列
                temp[ys].add(arr[j]);
            }
//把所有队列中的数据取出来
            int index=0;
            for (int k = 0; k <temp.length;k++)
                if (!temp[k].isEmpty()) {
                    while (!temp[k].isEmpty()) {
                        arr[index] = temp[k].poll();
//                       记录下一个位置
                        index++;
                    }

                }
        }

    }
}
