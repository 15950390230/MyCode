package 校招真题2018.青草游戏;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        for (int i = 0; i < t; ++i) {
            int n = Integer.parseInt(bf.readLine());
            if (n % 5 == 0 || n % 5 == 2) {
                System.out.println("yang");
            } else {
                System.out.println("niu");
            }
        }
    }
}
