package 校招真题2018.空中旅行;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
* 输入包括两行,第一行包括两个整数n和s(1 ≤ n ≤ 50, 1 ≤ s ≤ 1000),分别表示计划飞行的次数和飞起初始状态下有的燃油量。
第二行包括n个整数f[i], (1 ≤ f[i] ≤ 1000), 表示每次计划飞行所需要的燃油量。*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String[] twoInt=bf.readLine().split(" ");
        Integer n= Integer.parseInt(twoInt[0]);
        Integer s= Integer.parseInt(twoInt[1]);
        String[] arr=bf.readLine().split(" ");
        Integer[] arrInt=new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrInt[i]= Integer.parseInt(arr[i]);
        }
        Integer times=0;
        Integer allOil=0;
        for (int i = 0; i < arrInt.length; i++) {
            allOil=allOil+arrInt[i];
            if (s>=allOil){
                times++;
            }else {
                break;
            }
        }
        System.out.println(times);

    }
}
