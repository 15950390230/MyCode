package 校招真题2018.等差数列;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//都有S[i + 1] = S[i] + d, 这里的d也可以是负数和零,我们就称数列S为等差数列。
public class Solution {
//思路
//    先排序
//    求等差
//    遍历所有元素看是否满足等差情况
public final static String Possible="Possible";
    public final static String imPossible="Impossible";
    boolean decha(int[] sun) {
    if (sun.length<=2)return true;
    Arrays.sort(sun);
    int d=sun[1]-sun[0];
    for(int i=0;i<sun.length-1;i++) {
        if (sun[i+1]-sun[i]==d) {
            continue;
        }else {
            return false;
        }
    }
    if ((sun[sun.length-1]-sun[sun.length-2])==d) {
        return true;
    }
    else {
        return false;
    }
}
    String out(int[] num) {
        if(decha(num)) {
            return Possible;
        }else {
            return imPossible;
        }
    }
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.valueOf(bufferedReader.readLine().toString());
        String[] strings=bufferedReader.readLine().split(" ");
        int[] num=new int[n];
        for(int i=0;i<strings.length;i++) {
            num[i]=Integer.valueOf(strings[i]);
        }
        Solution deng=new Solution();
        System.out.println(deng.out(num));
    }
}
