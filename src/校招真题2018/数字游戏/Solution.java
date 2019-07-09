package 校招真题2018.数字游戏;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(bf.readLine());
        String[] strArr=bf.readLine().split(" ");
        int res=Integer.MIN_VALUE;
        for (int i = 0; i < strArr.length; i++) {
            char[] nums=strArr[i].toCharArray();
            Arrays.sort(nums);
            res=Math.max(res,Integer.parseInt(new String(nums)));
        }
        System.out.println(res);
    }
}
