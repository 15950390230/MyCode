package 剑指Offer.第五天.和为S的两个数字;

import java.util.ArrayList;

/*
* 输入一个递增排序的数组和一个数字S，
* 在数组中查找两个数，使得他们的和正好是S，
* 如果有多对数字的和等于S，输出两个数的乘积最小的。*/
public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
            int len=array.length;
            int i=0;
            int j=len-1;
            ArrayList<Integer> res=new ArrayList<>();
            if (len<2){
                return res;
            }
            while (i<j){
                if (array[i]+array[j]<sum){
                    i++;
                }
                else if (array[i]+array[j]>sum){
                    j--;
                }
                else {
                    res.add(array[i]);
                    res.add(array[j]);
                    break;
                }
            }
            return res;
    }
}
