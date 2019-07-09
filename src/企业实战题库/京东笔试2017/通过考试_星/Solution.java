package 企业实战题库.京东笔试2017.通过考试_星;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double[] p = new double[n];
        for (int i = 0; i < n; i++) p[i] = (double)in.nextInt() / 100;
        //利用动态规划做
        double[][] dp = new double[n + 1][n + 1];
        dp[0][0] = 1;
        //未作初始化为0；
        for (int i = 1; i < n + 1; i++) {
            dp[i][0] = dp[i - 1][0] * (1 - p[i - 1]);//多做一道题错误的概率代表i道题对j道的概率
            for (int j = 1; j < n + 1; j++){
                //i道题j道题正确的概率为i-1道题j-1道题正确在做一道题正确的概率+i-1道题j道正确在做错一道；
                dp[i][j] = dp[i - 1][j - 1] * p[i - 1] + dp[i - 1][j] * (1 - p[i - 1]);
            }
        }
        double result = 0;
        for (int i = (3 * n + 4) / 5; i <= n; i++) {//(3 * n + 4) / 5意思是大于等于0.6n的最小整数
            result += dp[n][i];
        }
        System.out.println(String.format("%.5f", result));
        in.close();
    }
}