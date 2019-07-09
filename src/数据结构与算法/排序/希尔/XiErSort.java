package 数据结构与算法.排序.希尔;

import java.util.Arrays;

public class XiErSort
{
    public static void main(String[] args) {
        int[] arr=new int[]{3,4,6,7,2,7,2,8,0};
        System.out.println("第0次排序结果："+Arrays.toString(arr));

        shellSorrt(arr);
        System.out.println(Arrays.toString(arr));
    }


    protected static void shellSorrt(int[] arr) {
//遍历所有的步长
        int k=1;
        for (int d = arr.length/2; d >0 ; d/=2) {
//           遍历所有的元素
            for (int i = d; i < arr.length; i++) {
//                遍历本组中所有的元素
                for (int j = i-d; j >= 0; j-=d) {
//                    如果当前元素大于加上步长后的那个元素
                    if (arr[j]>arr[j+d]){
                        int temp=arr[j];
                        arr[j]=arr[j+d];
                        arr[j+d]=temp;
                    }
                }
            }
            System.out.println("第"+k+"次排序结果："+Arrays.toString(arr));
            k++;
        }
    }
}
