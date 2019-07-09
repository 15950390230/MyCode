package 剑指Offer.第四天.数组中出现次数超过一半的数字;

import java.util.Hashtable;
import java.util.Map;

public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        int len=array.length;
        if(len<1){
            return 0;
        }
        Hashtable<Integer,Integer> temp=new Hashtable();
        for (int i = 0; i <len ; i++) {
            if (temp.containsKey(array[i])){
                temp.put(array[i],temp.get(array[i])+1);
            }
            else{
                temp.put(array[i],1);
            }
        }
        int num=len/2;
        for(Map.Entry<Integer, Integer> kvs:temp.entrySet()){
            if (kvs.getValue()>num){
                return kvs.getKey();
            }
        }
        return 0;

    }
}
