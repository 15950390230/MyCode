package 校招真题2018.独立的小易;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        while((line=br.readLine())!=null){
            String[] str = line.split(" ");
            long x = Integer.parseInt(str[0]);
            long f = Integer.parseInt(str[1]);
            long d = Integer.parseInt(str[2]);
            long p = Integer.parseInt(str[3]);
            System.out.println(survive(x, f, d, p));
        }
    }
    public static long survive(long x,long f,long d ,long p){
        if(f>d/x){
            return d/x;
        }
        return (d+f*p)/(x+p);
    }
}
