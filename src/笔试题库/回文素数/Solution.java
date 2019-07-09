package 笔试题库.回文素数;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args)throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////        String[] strs = br.readLine().split(" ");
////        int L = Integer.parseInt(strs[0]);
//////        int R = Integer.parseInt(strs[1]);
           int L = 1;
        int R = 9;
        int sum = 0;
        for(int i=L;i<=R;i++){
            if(isPalin(i) && isSuShu(i))
            {
                sum++;
            }
        }
        System.out.println(sum);
    }
    //判断是否是回文
    public static boolean isPalin(int num){
        if(num<10) return true;
        String str = String.valueOf(num);
        int n = str.length();
        if(n%2 == 0){
            StringBuffer sb1 = new StringBuffer();
            StringBuffer sb2 = new StringBuffer();
            sb1.append(str.substring(0,n/2));
            sb2.append(str.substring(n/2,n));
            sb2 = sb2.reverse();
            if(sb1.toString().equals(sb2.toString())){
                //System.out.println(str);
                return true;
            }
            else return false;
        }else{
            StringBuffer sb1 = new StringBuffer();
            StringBuffer sb2 = new StringBuffer();
            sb1.append(str.substring(0,n/2));
            sb2.append(str.substring(n/2+1,n));
            sb2 = sb2.reverse();
            if(sb1.toString().equals(sb2.toString())){
                //System.out.println(str);
                return true;
            }
            else return false;
        }

    }
    //判断是否是素数
    public static boolean isSuShu(int a){
        if (a < 2) {
        return false;
        }
        boolean ean = true;

        for(int i = 2 ; i <= Math.sqrt(a) ; i++){ //Math.sqrt 是调用Math类中的sqrt方法，求一个数的平方根
            if(a%i == 0){
                ean = false;
                break;
            }
        }
        return ean;

    }

}
