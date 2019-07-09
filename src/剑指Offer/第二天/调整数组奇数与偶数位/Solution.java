package 剑指Offer.第二天.调整数组奇数与偶数位;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static int[] reOrderArray(int[] array){
        List<Integer>ls1=new ArrayList<>();
        List<Integer>ls2=new ArrayList<>();
        for (int i = 0; i <array.length ; i++) {
            if (array[i]%2==1){
                ls1.add(array[i]);

            }
            else {
                ls2.add(array[i]);
            }
        }
        ls1.addAll(ls2);
        for (int i = 0; i <array.length ; i++) {
            array[i]=ls1.get(i);
        }
        return array;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(reOrderArray(arr)));
    }
}
