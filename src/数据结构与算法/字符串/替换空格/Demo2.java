package 数据结构与算法.字符串.替换空格;

import java.util.Arrays;

//数组法
public class Demo2 {
    public static void main(String[] args) {
        String sc="we are happy";
        String cd=replaceKongGe(sc);
        System.out.println(cd);
    }
    public static String replaceKongGe(String str){
        char[] arr=str.toCharArray();
        int num=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==' '){
                num++;
            }
        }
        int newNum=arr.length+2*num;
        char[] newArr=new char[newNum];
        int ind=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==' '){
                newArr[ind]='%';
                newArr[++ind]='2';
                newArr[++ind]='0';
            }
            else{
                newArr[ind]=arr[i];
            }
            ind++;
        }
        System.out.println(Arrays.toString(newArr));
//        return newArr.toString();
        return String.valueOf(newArr);
    }
}
