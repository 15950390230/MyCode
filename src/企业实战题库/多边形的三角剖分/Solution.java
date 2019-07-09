package 企业实战题库.多边形的三角剖分;

public class Solution {
    public static void main(String[] args) {
        minest_weight_val();
        System.out.println(t[1][N-1]);
        back_track(1,5);

    }
    static int  N =6;        //顶点数/边数

    static int weight[][] = {{0,2,2,3,1,4},{2,0,1,5,2,3},{2,1,0,2,1,4},{3,5,2,0,6,2},
            {1,2,1,6,0,1},{4,3,4,2,1,0}};

    static int t[][]=new int[N][N];    //t[i][j]表示多边形{Vi-1VkVj}的最优权值
    static int s[][]=new int[N][N] ;    //s[i][j]记录Vi-1到Vj最优三角剖分的中间点K

    static int get_weight( int a,  int b,  int c)
    {
        return weight[a][b] + weight[b][c] + weight[c][a];
    }

    static void minest_weight_val()
    {
        int i,r,k,j;
        int min;

        for (i = 1; i < N; i++)
        {
            t[i][i] = 0;
        }

        for (r = 2; r < N; r++)
        {
            for (i = 1; i < N-r+1; i++)
            {
                j = i + r -1;
                min = 9999;        //假设最小值
                for (k = i; k < j; k++)
                {
                    t[i][j] = t[i][k] + t[k+1][j] + get_weight(i-1,k,j);
                    if (t[i][j] < min)        //判断是否是最小值
                    {
                        min = t[i][j];
                        s[i][j] = k;
                    }
                }
                t[i][j] = min;        //取得多边形{Vi-1，Vj}的划分三角最小权值
            }
        }
    }

    static void back_track(int a, int b)
    {
        if (a == b) return;
        back_track(a,s[a][b]);
        back_track(s[a][b]+1,b);    //记得这是要加一
        System.out.println("最优三角");
        System.out.println(a-1+","+s[a][b]+","+b);
    }




}


