package 笔试题库.动态规划;

import java.util.Scanner;

/**
 * Created by huststl on 2018/3/28 14:24
 * 动态规划题01
 *一个高度为N的由正整数组成的三角形，从上走到下，求经过的数字和的最大值。
 * 每次只能走到下一层相邻的数上，例如从第3层的6向下走，只能走到第4层的2或9上。
 * 该三角形第n层有n个数字，例如：
 * 第一层有一个数字：5
 * 第二层有两个数字：8 4
 * 第三层有三个数字：3 6 9
 * 第四层有四个数字：7 2 9 5
 * 最优方案是：5 + 8 + 6 + 9 = 28
 * 注意:上面应该是排列成一个三角形的样子不是竖向对应的，排版问题没有显示成三角形。
 * 状态定义: Fi，j是第i行j列项最大取数和，求第n行Fn，m（0 < m < n）中最大值。
 * 状态转移方程：Fi，j = max{Fi-1,j-1,Fi-1,j}+Ai,jt
 */
public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        long max = 0;
        int[][] dp = new int[n][n];
        dp[0][0] = scan.nextInt();

        for(int i=1;i<n;i++){
            for(int j=0;j<=i;j++){
                int num = scan.nextInt();
                if(j==0){
                    dp[i][j] = dp[i-1][j] + num;
                }else {
                    dp[i][j] = Math.max(dp[i-1][j-1],dp[i - 1][j])+num;
                }
                max = Math.max(dp[i][j],max);
            }
        }
        System.out.println(max);
    }
}