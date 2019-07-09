package 网易题库.篮球队;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

//说明小Q是篮球训练队的教练，篮球队新加入了N名队员，第i名队员的篮球水平值为ai。
//小Q现在要把他们按照以下的要求分为A队和B队进行训练:
//1、A队的队员水平值之和严格大于B队的队员水平值之和
//2、对于A队中的任意一名队员，如果把他分配到B队，A队的水平值之和就会严格小于B队的水平值之和。
//3、每个队员必须要加入一个队伍
//小Q现在想知道有多少种方案可以按照以上要求完成分队。
public class Solution {
    public static void main(String[] args) {
        int[] array = null;
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        ArrayList<Integer> player = new ArrayList<Integer>();
        int sum = 0;
        for(int i = 0; i < num; i++) {
            player.add(in.nextInt());
            sum += player.get(i);
        }
         /*array数组保存从0-sum值的组成方法种数，例如array[11]就是从n个队员
            中选出任意个能组成水平值为11的方案数，例如案例中的5 4 6 7就有两种组成11
            的方法，5 6和4 7，所以array[11]=2
             */
        array = new int[sum+1];
        array[0] = 1;
        //倒叙排列
        player.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 > o2? -1 : 1;
            }
        } );

        int min;
        if(sum % 2 == 0) {
            min = sum/2;
        }else {
            min = sum/2 + 1;
        }
        int midle = sum/2 + 1;/*min是A<B的临界值，middle是A>B的临界值*/
        long answer = 0;
        for(int i = 0; i < num; i++) {
                /*减掉一个player.get(i)就是把第i个人放到A组里面
                这个循环就是为了符合A队的水平值严格比B队大，然后把A队的任意一个人
                放到B队又比A队大的条件。就样例来说，例如player.get(i)=4，那么
                m=12-4=8，在小于min=11的情况下就是m可以为8 9 10，这个m可以理解
                为选人，在剩下的n-1个人里面选出总值为m的方案有多少
                */
            for(int m = midle - player.get(i); m < min; m++) {
                if(m < 0) m = 0;
                answer += array[m];
            }
                /*算每个人的水平加起来的值的方案数，一定要从后面往前面算才能防止
                重复*/
            for(int j = min; j >= 0; j--) {
                if(array[j] != 0) {
                    array[j + player.get(i)] += array[j];
                }
            }
        }
            /*for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]+" ");
                if (i%9==0&&i!=0) {
                    System.out.println();
                }
            }*/
        System.out.print(answer);
        in.close();
    }
}
