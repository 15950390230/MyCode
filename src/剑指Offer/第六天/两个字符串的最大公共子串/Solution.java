package 剑指Offer.第六天.两个字符串的最大公共子串;
//动态规划
public class Solution {
    public static String maxCommonString(String s1, String s2) {
        String res = "";
        if (s1 == null || s1.length() == 0 || s2 == null || s2.length() == 0)
            return res;
        int max = 0, m = s1.length(), n = s2.length();
        int[][] dp = new int[m][n]; // 定义一个二维数组记录最大公共子串的长度
        // 计算到s1的第i个字符和s2的第j个字符为止的最大公共子串长度
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // 如果s1字符串在i处和s2字符串在j处有字符相同，进入if代码块中
                if (s1.charAt(i) == s2.charAt(j)) {
                    if (i == 0 || j == 0)
                        dp[i][j] = 1;// 边界的情况
                    else
                        dp[i][j] = dp[i - 1][j - 1] + 1;// 加上当前长度
                    // 记录最大长度和子串
                    if (dp[i][j] > max) {
                        max = dp[i][j];
                        res = s1.substring(i - dp[i][j] + 1, i + 1);// substring()左闭右开
                    }
                }
            }
        }
        return res;
    }
}
