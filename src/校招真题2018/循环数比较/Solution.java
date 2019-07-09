package 校招真题2018.循环数比较;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int x1 = Integer.parseInt(str[1]);
        int x2 = Integer.parseInt(str[3]);
        int len1 = str[0].length() * x1,len2 = str[2].length() * x2;
        int res = len1 - len2;

        if(len1 == len2){
            StringBuilder s1 = new StringBuilder(),s2 = new StringBuilder();
            for (int i = 0;i < x1;i ++) s1.append(str[0]);
            for (int i = 0;i < x2;i ++) s2.append(str[2]);
            res = s1.toString().compareTo(s2.toString());
        }
        if (res < 0)   System.out.print("Less");
        else if (res > 0)   System.out.print("Greater");
        else System.out.print("Equal");
    }
}
