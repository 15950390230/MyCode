package 校招真题2018.长串相乘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader dada=new BufferedReader(new InputStreamReader(System.in));
        String[] arr=dada.readLine().split(" ");

        char[] char1=arr[0].toCharArray();
        char[] char2=arr[1].toCharArray();
        int[] num1=new int[char1.length];
        int[] num2=new int[char2.length];
        int[] res=new int[char1.length+char2.length];
        for (int i = 0; i < num1.length; i++) {
            num1[i]=char1[char1.length-1-i]-'0';
        }
        for (int i = 0; i <num2.length ; i++) {
            num2[i]=char2[char2.length-1-i]-'0';
        }
        for(int i = 0; i < num1.length; i++){
             for(int j = 0; j < num2.length; j++){
                res[i+j] += num1[i]*num2[j];
                if(res[i+j]>=10){//进位处理
                    res[i+j+1] += res[i+j]/10;
                    res[i+j] %= 10;
                }
            }
        }
//        将乘积转换为字符串
        StringBuffer result = new StringBuffer();
        for(int i = res.length-1;i >= 0; i--){
            if(i==res.length-1&&res[res.length-1]==0){//处理最高位是0的情况，其不应该显示
                continue;
            }
            result.append(res[i]);
        }
        System.out.println(result.toString());

    }
}
