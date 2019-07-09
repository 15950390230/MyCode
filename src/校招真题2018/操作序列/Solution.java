package 校招真题2018.操作序列;

import java.util.Scanner;
//规律题
//n = 1,b = 1    n = 1直接输出
//n = 2,b = 2,1
//n = 3,b = 3,1,2
//n = 4,b = 4,2,1,3
//n = 5,b = 5,3,1,2,4
//n = 6,b = 6,4,2,1,3,5
//由上述可推，当n 为奇数时，
//先从后向前输出奇数位置的数字，再从前向后输出偶数位置的数字
//当n 为偶数时
//先从后向前输出偶数位置的数字，再从前向后输出奇数位置的数字

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//将输入的一个字符串变为int型返回
        int [] array = new int [n];
        for(int i = 0;i < n;i++){
            array[i] = sc.nextInt();
        }
        if(n == 1){
            System.out.println(array[0]);
        }
        if(n == 1){
            System.out.println(array[0]);
        }
        if(n % 2 == 0){
            for(int i = n-1;i >= 0;i -= 2){
                System.out.print(array[i] + " ");
            }
            for(int i = 0;i < n - 2;i += 2){
                System.out.print(array[i] + " ");

            }
            System.out.print(array[n-2]);
        }
        else { //n % 2 == 1
            for(int i = n-1;i >= 0;i -= 2){
                System.out.print(array[i] + " ");
            }
            for(int i = 1;i < n - 2;i += 2){
                System.out.print(array[i] + " ");
            }
            System.out.print(array[n-2]);
        }
    }
}
