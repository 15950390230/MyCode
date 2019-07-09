package 笔试题库.二进制表示中1的个数;

public class Solution {
    public int NumberOf1(int n) {
        int t=0;
        char[]ch=Integer.toBinaryString(n).toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='1'){
                t++;
            }
        }
        return t;
    }
}
