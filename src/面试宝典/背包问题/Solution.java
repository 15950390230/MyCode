package 面试宝典.背包问题;

import java.util.Arrays;

/**
 * 贪心法求解
 * @author xuexiaolei
 * @version 2017年12月07日
 */
public class Solution {
    /**
     * 普通背包问题，可以将物品的一部分放入背包，比如黄金喽
     *      简单贪心：将物品的单位价值降序排列

     * @param weights     物品重量
     * @param values     物品价值
     * @param MAX_WEIGHT     背包大小
     * @return      返回最大价值
     */
    private int MAX_WEIGHT = 150;
    private int[] weights = new int[]{35,30,60,50,40,10,25};
    private int[] values = new int[]{10,40,30,50,35,40,30};
    private void packageGreedy(int capacity,int[] weights,int[] values){
        int n = weights.length;
        double[] r = new double[n]; //性价比数组
        int[] index = new int[n];   //按性价比排序物品的下标
        for(int i = 0;i < n;i++){
            r[i] = (double) values[i] / weights[i];
            index[i] = i;//默认排序
        }
        double temp = 0;
          //对性价比进行排序
          for(int i = 0;i < n - 1;i++){
              for(int j = i + 1;j < n;j++){
                  if(r[i] < r[j]){
                      temp = r[i];
                      r[i] = r[j];
                      r[j] = temp;
                      int x = index[i];
                      index[i] = index[j];
                      index[j] = x;
                  }
              }
          }
          //将排序好的重量和价值分别存到数组中
           int[] w1 = new int[n];
          int[] value1 = new int[n];
          for(int i = 0;i < n;i++){
              w1[i] = weights[index[i]];
              value1[i] = values[index[i]];
          }
          int[] x = new int[n];
          int maxValue = 0;
          for(int i = 0;i < n;i++){
              if(w1[i] <= capacity){
                  //表明还可以装得下
                  x[i] = 1;   //表示该物品被装了
                  capacity = capacity - w1[i];
                  maxValue += value1[i];
              }
          }
          System.out.println("总共放下的物品数量:" + Arrays.toString(x));
          System.out.println("最大价值为:" + maxValue);    }
    public static void main(String[] args){
        Solution g = new Solution();
        g.packageGreedy(g.MAX_WEIGHT,g.weights,g.values);
    }

}
