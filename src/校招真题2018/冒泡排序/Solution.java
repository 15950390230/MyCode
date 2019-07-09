package 校招真题2018.冒泡排序;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 牛牛现在要使用上述算法对一个数组A排序。
// 在排序前牛牛允许执行最多k次特定操作(可以不使用完),
// 每次特定操作选择一个连续子数组,然后对其进行翻转,
// 并且k次特定操作选择的子数组不相交。
// 例如A = {1, 2, 3, 4, 5, 6, 7}, k = 1,
// 如果牛牛选择的子数组是[2,4](注意下标从0开始),
// 那么翻转之后的数组变为A = {1, 2, 5, 4, 3, 6, 7}。
// 牛牛知道冒泡排序的效率一定程度上取决于Swap操作次数,
// 牛牛想知道对于一个数组A在进行k次特定操作之后,
// 再进行上述冒泡排序最少的Swap操作次数是多少?
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = br.readLine().split(" ");
        int n = Integer.parseInt(strs[0]), k = Integer.parseInt(strs[1]);
        strs = br.readLine().split(" ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(strs[i]);
        }

        //dp[i][j]: 表示进行不多于j次操作后与a[i],...,a[len - 1]形成逆序对数的最小值
        int[][] dp = new int[n + 1][k + 1];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= k; j++) {
                dp[i][j] = countReverseOrder(a, i, i) + dp[i + 1][k];
                if (j > 0) {
                    for (int p = i + 1; p < n; p++) {
                        int[] tmp = new int[p + 1];
                        System.arraycopy(a, 0, tmp, 0, p + 1);
                        reverse(tmp, i, p);
                        dp[i][j] = Math.min(dp[i][j], countReverseOrder(tmp, i, tmp.length - 1) + dp[p + 1][j - 1]);
                    }
                }
            }
        }
        System.out.println(dp[0][k]);
    }
    //求元素arr[begin], ... ,arr[end]的逆序数
    private static int countReverseOrder(int[] arr, int begin, int end) {
        int count = 0;
        for (int i = begin; i <= end; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[i]) count++;
            }
        }
        return count;
    }
//反转数组
    private static void reverse(int[] arr, int i, int j) {
        for (; i < j; i++, j--) {
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
    }
}
//答案解析：
//        动态规划
//        dp[i][j]//下标0到n-1，可以换j次，最多可以消除多少逆序数
//        ni[i][j]//下标i到j逆序数
//        shun[i][j]//下标i到j顺序数(相等数字不计)
//        dp[i][j]=max{dp[i+1][j],{ni[i][t]-shun[i][t]+dp[t+1][j-1] | i<t<n}}
//        答案为总逆序数减最多消去的逆序数