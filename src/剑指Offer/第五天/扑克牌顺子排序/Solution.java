package 剑指Offer.第五天.扑克牌顺子排序;

import java.util.Arrays;

public class Solution {
    public static boolean isContinuous(int [] numbers) {
        if(numbers == null||numbers.length==0)
        {return false;}
        Arrays.sort(numbers);  //先排序
        int indes=0;
        for (int i = 0; i <numbers.length ; i++) {
            if (numbers[i]==0){
                indes++;
            }
        }
        for (int i = indes; i < numbers.length-1; i++) {
            if (numbers[i]==numbers[i+1]){
                return false;
            }
        }
        if (numbers[numbers.length-1]-numbers[indes]<5){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        int[] arr=new int[]{0,0,1,3,5};
        isContinuous(arr);
    }
}
