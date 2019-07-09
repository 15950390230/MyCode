package 校招真题2018.无聊的牛羊;

import java.util.Scanner;

//牛牛和羊羊非常无聊.他们有n + m个共同朋友,他们中有n个是无聊的,m个是不无聊的。
//        每个小时牛牛和羊羊随机选择两个不同的朋友A和B.
//        (如果存在多种可能的pair(A, B),任意一个被选到的概率相同。),
//        然后牛牛会和朋友A进行交谈,羊羊会和朋友B进行交谈。在交谈之后,
//        如果被选择的朋友之前不是无聊会变得无聊。
//        现在你需要计算让所有朋友变得无聊所需要的时间的期望值。

//本题考察递推公式，设总共有s个0,1(s >= 2)，每次从其中随机选出2个，将这两个数中的1变成0，试求平均多少次操作后，s个数全部变成0.
//        当s个数中有k个1时，设平均需要f(k)次操作使得s个数全部变成0.一次操作后有3种可能性，即k --> k, k --> k - 1, k --> k - 2.分别表示取出了00， 01或10,11.这三种情况的概率分别为C(s - k, 2)/C(s, 2), (s - k) * k / C(s, 2), C(k, 2)/C(s, 2). 由此可以得到f(k)的递推公式.
//        f(k) = 1 + C(s - k, 2) / C(s, 2) f(k) + (s - k) k / C(s, 2) f(k - 1) + C(k, 2) / C(s, 2) f(k - 2)
//        化简此递推公式，即得到k到k-1，k-2的递推公式。当k=1时，是特殊情况，由分析可以得到f(1) = f(0) + s / 2, f(0) = 0.综上得解.
public class Solution {
    private static double[] f;
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        f = new double[m+1];
        for(int i=0;i<=m;i++){
            getTime(n+m-i,i);
        }
        System.out.println(String.format("%.1f",f[m]));
    }

    private static void getTime(int n, int m) {
        if(m==0) f[m] = 0.0;
        else if(m==1) f[m] = (n+m)/2.0;
        else{
            double p1 = n*(n-1.0)/(n+m)/(n+m-1.0);
            double p2 = 2.0*n*m/(n+m)/(n+m-1.0);
            double p3 = m*(m-1.0)/(n+m)/(n+m-1.0);
            f[m] = p2/(1-p1)*(1+f[m-1])+p3/(1-p1)*(1+f[m-2])+p1/(1-p1);
        }
    }
}
