package 笔试题库.最大乘积;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
/*给定一个无序数组，包含正数、负数和0，
要求从中找出3个数的乘积，使得乘积最大，
要求时间复杂度：O(n)，空间复杂度：O(1)*/
public class chengji {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(System.in));
       int n= Integer.parseInt(bufferedReader.readLine());
//        System.out.println(n);
        String[] str=bufferedReader.readLine().split(" ");
        int[] num=new int[str.length];
        int i=0;
        for (String st:str){
            num[i++]=Integer.parseInt(st);
        }
//        System.out.println(Arrays.toString(num));
        System.out.println(func(num));
    }

    private static long func(int[] nums) {
        int max1 = Integer.MIN_VALUE,max2 = Integer.MIN_VALUE,max3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE,  min2 = Integer.MAX_VALUE;
        for(int num : nums){
            if(num>max1)
            {
                max3 = max2;
                max2 = max1;
                max1 = num;
            }else if(num>max2)
            {
                max3 = max2;
                max2 = num;
            }
            else if(num>max3)
                max3 = num;

            if(num<min1)
            {
                min2 = min1;
                min1 = num;
            }else if(num<min2)
                min2 = num;
        }
//        System.out.println("max1="+max1+"..."+"max2="+max2+"..."+"max3="+max3+"..."+"min1="+min1+"..."+"min2="+min2+"...");
        return (long)max1*max2*max3>(long)max1*min1*min2?(long)max1*max2*max3:(long)max1*min1*min2;
    }


}
