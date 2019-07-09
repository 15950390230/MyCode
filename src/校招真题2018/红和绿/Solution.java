package 校招真题2018.红和绿;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int gcount = 0;
        int count = 0;//动态规划算法的意思
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'R'){
                count = Math.min(count + 1, gcount);
            }else{
                gcount += 1;//G的数量
            }
        }
        System.out.println(count);
    }
}