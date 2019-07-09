package 校招真题2018.字符串的价值;
/*有一种有趣的字符串价值计算方式:统计字符串中每种字符出现的次数,然后求所有字符次数的平方和作为字符串的价值*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args)throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String str=bf.readLine();
        int k = Integer.parseInt(bf.readLine());
        int[] z = new int[26];
        for(int j = 0;j<str.length();j++){
            z[str.charAt(j)-'a']++;
        }
        for(int i = 0;i<k;i++){
            int maxId = 0;
            for(int j = 0;j<26;j++){
                if(z[j]>z[maxId])
                    maxId = j;
            }
            z[maxId]--;
        }
        int res = 0;
        for(int i =0;i<26;i++){
            res+=Math.pow(z[i],2);
        }
        System.out.println(res);
    }
}
