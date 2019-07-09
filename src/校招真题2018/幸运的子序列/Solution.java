package 校招真题2018.幸运的子序列;

import java.util.Scanner;

//牛牛得到一个长度为n的整数序列V,
// 牛牛定义一段连续子序列的幸运值为这段子序列中最大值和次大值的异或值(次大值是严格的次大)。
// 牛牛现在需要求出序列V的所有连续子序列中幸运值最大是多少。请你帮帮牛牛吧。
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //本题关键在于，最终最大的异或结果一定是由所有数中，高位最先为1的数（也就是最大的数）参与得到的。
        int res = Integer.MIN_VALUE;
        //向后找满足条件的值
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i]<arr[j]) {
                    res=Math.max(res, arr[i]^arr[j]);
                    break;
                }
            }
        }
        //向前找满足条件的值
        for (int i = n-1; i > 0; i--) {
            for (int j = i-1; j > -1; j--) {
                if(arr[i]<arr[j]) {
                    res=Math.max(res, arr[i]^arr[j]);
                    break;
                }
            }
        }
        System.out.println(res);
    }
}
