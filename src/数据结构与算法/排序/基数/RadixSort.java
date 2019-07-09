package 数据结构与算法.排序.基数;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int[] arr = new int[]{24,6,489,75,9,287,56,1,798,34,65,652,5};
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void radixSort(int[] arr) {
//        获取数组中的最大数字
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
//        System.out.println(max);
//       计算最大位数的位数
        int maxlength=(max+"").length();
//        用于临时存储数据的数组
        int[][] temp=new int[10][arr.length];
//        用于记录在相应的数组中存放数字的数量
        int[] counts=new int[10];
//        System.out.println(maxlength);
//        根据最大位数确定比较次数
        for (int i = 0,n=1; i < maxlength; i++,n*=10) {
//            把每一个数分别计算余数
            for (int j = 0; j < arr.length; j++) {
//                计算余数
                    int ys=arr[j]/n%10;
//                    根据余数放入指定位置
                     temp[ys][counts[ys]] =arr[j];
//                     记录数量
                     counts[ys]++;
            }

            int index=0;
            for (int k = 0; k <counts.length ; k++) {
                if (counts[k]!=0){
                    for (int l = 0; l <counts[k] ; l++) {
                        arr[index]=temp[k][l];
                        index++;
                    }
//                    把数量改为零
                    counts[k]=0;
                }
            }
        }

    }
}
