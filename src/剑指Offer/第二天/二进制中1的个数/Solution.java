package 剑指Offer.第二天.二进制中1的个数;

public class Solution {
    public int numberOf1(int n){
        char[] chars=Integer.toBinaryString(n).toCharArray();
        int count=0;
        for (int i = 0; i <chars.length ; i++) {
            if (chars[i]=='1'){
                count++;
            }
        }
        return count;
    }
}
