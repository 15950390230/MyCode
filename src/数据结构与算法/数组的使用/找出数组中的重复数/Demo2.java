package 数据结构与算法.数组的使用.找出数组中的重复数;
//找出数组中的重复数

public class Demo2 {
    public static void main(String[] args) {
        int[] arr=new int[]{5,2,3,4,5,6,7,8 };
        System.out.println(dublicate(arr));
    }
    public static Boolean dublicate(int[] arr){
        if (arr.length==0) {
            return false;

        }
       for (int i = 0; i <arr.length ; i++) {
           for (int j = i+1; j < arr.length; j++) {
               if (arr[i]==arr[j]){
                   return true;
               }
           }
       }

        return false;
    }
}
