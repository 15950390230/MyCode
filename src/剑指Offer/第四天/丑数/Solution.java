package 剑指Offer.第四天.丑数;

public class Solution {
    public int GetUglyNumber_Solution(int index) {
       if (index<7){
           return index;
       }
       int[] res=new int[index];
       int l1=0,l2=0,l3=0;
       res[0]=1;
       int count=0;
       while (count<index-1){
           int temp=min(res[l1]*2,min(res[l2]*3,res[l3]*5));
           if (temp==res[l1]*2){l1++;}
           if (temp==res[l2]*3){l2++;}
           if (temp==res[l3]*5){l3++;}
           res[++count]=temp;
       }
       return res[index-1];
    }
    public static int min(int l1,int l2){
        return l1<l2?l1:l2;

    }
}
