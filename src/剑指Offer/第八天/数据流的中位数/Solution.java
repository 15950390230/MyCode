package 剑指Offer.第八天.数据流的中位数;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public ArrayList<Integer> arrayList=new ArrayList<>();
    public void Insert(Integer num) {
        arrayList.add(num);
    }

    public Double GetMedian() {
        if (arrayList.size()<1)
            return 0.0;
        Collections.sort(arrayList);
        if (arrayList.size()%2==1){
            return  Double.valueOf(arrayList.get(arrayList.size()/2));
        }
        else{
            Double num1=Double.valueOf(arrayList.get(arrayList.size()/2));
            Double num2=Double.valueOf(arrayList.get(arrayList.size()/2-1));
            return (num1+num2)/2;
        }
    }
}
