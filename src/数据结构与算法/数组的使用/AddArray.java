package 数据结构与算法.数组的使用;

import java.util.Arrays;

public class AddArray {
    public static void main(String[] args) {
        //解决数组长度不可变的问题
        int[] arr=new int[]{9,8,7};
        System.out.println(Arrays.toString(arr));
        //要加入的目标元素
        int dst=6;
        //创建一个新的数组，长度是原数组长度加一
        int[] arr1 =new int[arr.length+1];
        //把原数组的元素复制到新的数组中
        for (int i=0;i<arr.length;i++){
            arr1[i]=arr[i];
        }
        arr1[arr.length]=dst;
        System.out.println(Arrays.toString(arr1));
    }
}
