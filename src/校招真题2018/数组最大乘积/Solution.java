package 校招真题2018.数组最大乘积;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//给定一个无序数组，包含正数、负数和0，要求从中找出3个数的乘积，使得乘积最大，要求时间复杂度：O(n)，空间复杂度：O(1)
public class Solution {
    public static long  maximumProduct(int[] arr){
        int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE,max3=Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE,min2=Integer.MAX_VALUE;
        for (int i : arr) {
            if(i>max1) {
                max3=max2;
                max2=max1;
                max1=i;
            }else if(i>max2) {
                max3=max2;
                max2=i;
            }else if(i>max3) {
                max3=i;
            }

            if(i<min1) {
                min2=min1;
                min1=i;
            }else if(i<min2) {
                min2=i;
            }
        }

        return Math.max((long)max3*max2*max1, (long)max1*min1*min2);
    }
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(ir);
        int n = Integer.parseInt(bf.readLine());
        String[] str = bf.readLine().split(" ");
        int[] nums=new int[str.length];
        for (int i=0;i<str.length;++i){
            nums[i]=Integer.parseInt(str[i]);
        }
        System.out.println(maximumProduct(nums));
    }
}
