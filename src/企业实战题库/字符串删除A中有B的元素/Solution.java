package 企业实战题库.字符串删除A中有B的元素;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
//        char[] str1=bf.readLine().toCharArray();
//        char[] str2=bf.readLine().toCharArray();
        char[] str1="abcdea".toCharArray();
        char[] str2="ac".toCharArray();
        StringBuffer sb=new StringBuffer();
        for (int i = 0; i <str1.length ; i++) {
            boolean state=true;
            for (int j = 0; j <str2.length; j++) {
                if (str1[i]==str2[j]){
                    state=false;
                    break;
                }
            }
            if (state){
                sb.append(str1[i]);
            }
        }
        System.out.println(sb.toString());
    }

}
