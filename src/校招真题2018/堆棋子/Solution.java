package 校招真题2018.堆棋子;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*求，让棋盘上出现有一个格子上有k个棋子所需要的最少次数

这个函数是这道题的关键。由于计算曼哈顿距离时可以通过对x和y分别计算再求和来得到，
所以使dist_sum最小的格子的x坐标一定是X中的一个，y坐标一定是Y中的一个。
最终汇聚棋子的x坐标只要在棋子初始的x个坐标中考虑
1. 遍历每一个备选格子(X[i], Y[j])，并分别计算dist_sum
2. 求得它们的最小值*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String len1=br.readLine();
        String[] xStr=br.readLine().split(" ");
        String[] yStr=br.readLine().split(" ");
        int len = Integer.parseInt(len1);
        int[] xs = new int[len];
        int[] ys = new int[len];
        int[] distance = new int[len];
        int[] result = new int[len];
        for(int i = 0;i < len;i++){
            xs[i] = Integer.parseInt(xStr[i]);
            ys[i] = Integer.parseInt(yStr[i]);
            result[i] = Integer.MAX_VALUE;
        }
        for (int i = 0; i <len ; i++) {
            for (int j = 0; j < len; j++) {
                for (int k = 0; k <len ; k++) {
                    distance[k]=Math.abs(xs[k] - xs[i]) + Math.abs(ys[k] - ys[j]);
                }
                Arrays.sort(distance);
                int temp = 0;
                for (int m = 0; m <len ; m++) {
                    temp += distance[m];
                    result[m] = Math.min(result[m], temp);
                }
            }
        }
        for (int i = 0; i < len-1; i++) {
            System.out.print(result[i]+" ");
        }
        System.out.print(result[len-1]);
    }
}
