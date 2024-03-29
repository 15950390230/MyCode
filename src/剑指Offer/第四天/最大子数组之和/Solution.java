package 剑指Offer.第四天.最大子数组之和;
/**
 * HZ偶尔会拿些专业问题来忽悠那些非计算机专业的同学。
 * 今天测试组开完会后,他又发话了:在古老的一维模式识别中,
 * 常常需要计算连续子向量的最大和,当向量全为正数的时候,
 * 问题很好解决。但是,如果向量中包含负数,是否应该包含某个负数,
 * 并期望旁边的正数会弥补它呢？
 * 例如:{6,-3,-2,7,-15,1,2,2},
 * 连续子向量的最大和为8(从第0个开始,到第3个为止)。
 * 给一个数组，返回它的最大连续子序列的和，
 * 你会不会被他忽悠住？(子向量的长度至少是1) */
public class Solution {
    //使用动态规划
    public  int FindGreatestSumOfSubArray(int[] array) {
        if (array.length==0 || array==null) {
            return 0;
        }
        int[] res=new int[array.length];
         res[0] = array[0]; //记录当前所有子数组的和的最大值
        int[] max=new int[array.length];

        max[0]=array[0];   //包含array[i]的连续数组最大值
        for (int i = 1; i < array.length; i++) {
            max[i]=Math.max(max[i-1]+array[i], array[i]);//包含末尾元素的数组
            res[i]=Math.max(max[i], res[i-1]);
        }
        return res[array.length-1];
    }
}
