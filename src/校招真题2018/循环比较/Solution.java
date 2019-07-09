package 校招真题2018.循环比较;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//对于任意两个正整数x和k,我们定义repeat(x, k)为将x重复写k次形成的数,例如repeat(1234, 3) = 123412341234,repeat(20,2) = 2020.
//        牛牛现在给出4个整数x1, k1, x2, k2, 其中v1 = (x1, k1), v2 = (x2, k2),请你来比较v1和v2的大小。
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = bufferedReader.readLine().split(" ");
        String s1 = str[0];
        String s2 = str[2];
        int x1 = Integer.parseInt(str[1]);
        int x2 = Integer.parseInt(str[3]);
        System.out.println(repeat(s1,x1,s2,x2));
    }

    private static String  repeat(String s1, int x1, String s2, int x2) {
        StringBuffer stringBuffer1 = new StringBuffer(s1);
        StringBuffer stringBuffer2 = new StringBuffer(s2);
        for(int i=1;i<x1;i++){
            stringBuffer1.append(s1);
        }
        for(int i=1;i<x2;i++){
            stringBuffer2.append(s2);
        }
        char[] c1 = stringBuffer1.toString().toCharArray();
        char[] c2 = stringBuffer2.toString().toCharArray();
        if(stringBuffer1.length()>stringBuffer2.length()){
            return "Greater";
        }else if(stringBuffer1.length()<stringBuffer2.length()){
            return "Less";
        }else {
            for (int i=0; i< c1.length; i++){
                if(c1[i] - '0' > c2[i] - '0'){
                    return "Greater";
                }else if (c1[i] - '0' < c2[i] - '0'){
                    return "Less";
                }else{
                    continue;
                }
            }
        }
        return "Equal";
    }

}
