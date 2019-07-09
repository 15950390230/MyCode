package 校招真题2018.删除重复字符;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String str=bf.readLine();
//        String str="banana";
        char[] arr=str.toCharArray();
        StringBuffer res=new StringBuffer();
        Hashtable table=new Hashtable();
        for (int i = 0; i < arr.length; i++) {
            if (table.containsKey(arr[i])){
                continue;
            }
            else {
                table.put(arr[i],1);
                res.append(arr[i]);
            }
        }
        System.out.println(res.toString());
    }
}
