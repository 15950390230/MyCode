package 笔试题库.Double的n次方;

public class Solution {
    public double Power(double base, int exponent) {
        double temp=1;
        if (exponent>0){
            for(int i=1;i<=exponent;i++){
                temp=temp*base;
                if(temp>1.7976931348623157E308){
                    System.out.println("已经超出double类型的取值范围。");
                    return -1;
                }
                }
                return temp;
        }
        else if (exponent<0){
        exponent=-exponent;
        for(int i=1;i<=exponent;i++){
            temp=temp*base;
            if(temp>1.7976931348623157E308){
                System.out.println("已经超出double类型的取值范围。");
                return -1;
            }
        }
        temp=1.0/temp;
        return temp;
        }
        else{
                return 1;
        }
    }
}
