package 数据结构与算法.数组的使用;

import java.util.Arrays;

public class DeleteArray {
    public static void main(String[] args) {
        int[] arr=new int[]{9,8,7,6,5,4};
        System.out.println(Arrays.toString(arr));

        //假设想要删除第3个元素
        int n=3;
        int[] arr1=new int[arr.length-1];
        for (int i=0;i<arr1.length;i++){
            if (i<n){
              arr1[i]=arr[i];
            }
            else{
                arr1[i]=arr[i+1];
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}
