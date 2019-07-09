package 校招真题2018.缺失的括号;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        char[] arr=bf.readLine().toCharArray();
        int countL = 0,countR = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]=='('){
                countL++;
            }
            else {
                if (countL!=0){
                    countL--;
                }
                else {
                    countR++;
                }
            }
        }
        System.out.println(countL+countR);
    }
}
