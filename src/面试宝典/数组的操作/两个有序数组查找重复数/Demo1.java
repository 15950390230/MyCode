package 面试宝典.数组的操作.两个有序数组查找重复数;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        int[] arr1=new int[]{5,8,6,4,1};
        int[] arr2=new int[]{4,7,3,5,8};
        System.out.println(Arrays.toString(findRepeat(arr1,arr2)));
    }
    public static  int[] findRepeat(int[] arr1,int[] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        ArrayList<Integer> list=new ArrayList<>();
        int i=0;
        int j=0;
        int len1=arr1.length;
        int len2=arr2.length;
        while (i<len1&&j<len2){
            if (arr1[i]==arr2[j]){
                list.add(arr1[i]);
                i++;j++;
                }
                else if(arr1[i]<arr2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        int[] temp=new int[list.size()];
        for (int k = 0; k <list.size() ; k++) {
            temp[k]=list.get(k);
        }
        return temp;
    }
}
