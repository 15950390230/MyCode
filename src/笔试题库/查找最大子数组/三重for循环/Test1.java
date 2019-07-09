package 笔试题库.查找最大子数组.三重for循环;
//嵌套三重for循环/
/*时间复杂度为O(n^3)*/
public class Test1 {
    public static int getMaxSubArray(int[] arr){
        int len=arr.length;
        int max=0;
        int mid=0;
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                mid=0;
                for (int k = i; k <=j ; k++) {
                    mid+=arr[k];
                }
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
