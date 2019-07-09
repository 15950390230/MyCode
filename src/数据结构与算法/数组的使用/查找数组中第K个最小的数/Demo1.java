package 数据结构与算法.数组的使用.查找数组中第K个最小的数;

import java.util.Arrays;
//剪树枝法
public class Demo1 {
    public static void main(String[] args) {
        int[] arr=new int[]{1,5,2,6,8,0,6};
        int minK=getMinK(arr,6);
        System.out.println(minK);
    }
//    采用递归的方式
    public static int findTheKNum(int[] arr,int low,int high,int k){
        int i,j;
        int temp;
        if (low>high){
            return Integer.MIN_VALUE;
        }
        i=low;
        j=high;
        temp=arr[i];
        while (i<j){
            while (i<j&&arr[j]>=temp){
                j--;
            }
            if (i<j){
                arr[i]=arr[j];
            }
            while (i<j&&arr[i]<temp){
                i++;
            }
            if (i<j){
                arr[j]=arr[i];
            }
        }
        arr[i]=temp;
        System.out.println(Arrays.toString(arr));

        if (i+1==k){
            return temp;
        }
        else if (i+1>k)
        {
            return findTheKNum(arr,low,i-1,k);
        }
        else {
            return findTheKNum(arr,i+1,high,k);
        }

    }
    public static int getMinK(int[] arr,int k){
        if (arr==null){
            return Integer.MIN_VALUE;
        }
        if (arr.length<k){
            return Integer.MIN_VALUE;

        }
        return findTheKNum(arr,0,arr.length-1,k);

    }
}
