package 剑指Offer.第四天.￥数组中的逆序对;

import java.util.Arrays;

/**
 * 在数组中的两个数字，如果前面一个数字大于后面的数字，
 * 则这两个数字组成一个逆序对。输入一个数组,
 * 求出这个数组中的逆序对的总数P。
 * 并将P对1000000007取模的结果输出。
 * 即输出P%1000000007*/
public class Solution2 {
    /*归并排序的改进，把数据分成前后两个数组(递归分到每个数组仅有一个数据项)，
    合并数组，合并时，出现前面的数组值array[i]大于后面数组值array[j]时；则前面
    数组array[i]~array[mid]都是大于array[j]的，count += mid+1 - i
    参考剑指Offer，但是感觉剑指Offer归并过程少了一步拷贝过程。
    还有就是测试用例输出结果比较大，对每次返回的count mod(1000000007)求余
    */
    //递归方法归并数组
    private  static Integer count;
    public static void mergeSort(int[] arr,int low,int high) {
        int middle = (low + high) / 2;
        if (low < high) {
//        处理左边
            mergeSort(arr, low, middle);
//        处理右边
            mergeSort(arr, middle + 1, high);
//        归并
          count+= merge(arr, low, middle, high);
        }
    }

    public static int merge(int[] arr,int low,int middle, int high) {
        int count = 0;
//        用于存储归并后的临时数组
        int temp[]=new int[high-low+1];
//记录第一个数组中需要遍历的下表
        int i=middle;
//        记录第二个数组中需要遍历的下标
        int j=high;
//用于临时数组中存放的下标
        int index=high;
//        循环遍历两个数组取出小的字，放入临时数组中
        while(i>=low&&j>middle){
            //第一个数组中的数据更小则替换临时数组中的index的索引位置并让下标后移
            if (arr[i]>arr[j]){
                count += j-middle;
                temp[index]=arr[i];
                i--;
                if(count>=1000000007)//数值过大求余
                {
                    count%=1000000007;
                }

            }
            else{
                temp[index]=arr[j];
                j--;
            }
            index--;

        }
//        处理多余的数据
        while(j>middle){
            temp[index]=arr[j];
            j--;
            index--;

        }
        while(i>low){
            temp[index]=arr[i];
            i--;
            index--;

        }
//        把临时数组中的数据还回去重新存入原数组
        for (int k = 0; k < temp.length; k++) {
            arr[k+low]=temp[k];
        }
        String sizeof="";
        return count;
    }
}
