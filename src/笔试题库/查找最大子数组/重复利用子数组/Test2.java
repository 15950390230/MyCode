package 笔试题库.查找最大子数组.重复利用子数组;

public class Test2 {
    public static int getMaxSubArray(int[] arr){
        int len=arr.length;
        int max=0;
        int mid=0;
        for (int i = 0; i < len; i++) {
            mid=0;
            for (int j = i; j < len; j++) {
                mid+=arr[j];
                if (max<mid){
                    max=mid;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{1,-4,9,-8,-7,3,6,-3,4};
        int hh=getMaxSubArray(arr);
        System.out.println(hh);
    }
}
