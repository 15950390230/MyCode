package 剑指Offer.第六天.找出数组中只出现了一次的数;

public class Solution {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if(array.length < 2) return ;
        int myxor = 0;
        int flag = 1;
//        获取亦或结果
        for(int i = 0 ; i < array.length; ++ i )
            myxor ^= array[i];

        while((myxor & flag) == 0) flag <<= 1;
        // num1[0] = myxor;
        //num2[0] = myxor;
        for(int i = 0; i < array.length; ++ i ){
            if((flag & array[i]) == 0) num2[0]^= array[i];
            else num1[0]^= array[i];
        }
    }
}
