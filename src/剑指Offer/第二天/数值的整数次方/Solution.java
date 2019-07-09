package 剑指Offer.第二天.数值的整数次方;

/**
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。*/
public class Solution {
    public double Power(double base, int exponent) {
        double temp=1;
        if (exponent>0){
            for (int i = 0; i < exponent; i++) {
                temp=temp*base;
                if (temp>Double.MAX_VALUE){
                    System.out.println("超出范围");
                    return -1;
                }
            }
            return temp;
        }
        else if (exponent<0){
            int m=Math.abs(exponent);
            for (int i = 0; i <m ; i++) {
                temp=temp*base;
                if (temp>Double.MAX_VALUE){
                    System.out.println("超出范围");
                    return -1;
                }
            }
            return 1.0/temp;
        }
        else{
            return 1;
        }
    }
}
