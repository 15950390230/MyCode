package 校招真题2018.最长交错串01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        int count = 1;
        int maxNum = 0;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i)!=str.charAt(i-1))
            {
                count++;
            }
            else{
                count=1;
            }
            maxNum=Math.max(maxNum,count);
        }
        System.out.println(maxNum);
    }
}
