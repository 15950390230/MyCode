package 面试宝典.数组的操作.求数组中两个元素的最小距离;

public class Demo1 {
    public static void main(String[] args) {
        int[] arr=new int[]{4,5,6,4,7,4,6,4,7,8,5,6,4,3,10,8};
        System.out.println(findMinLength(arr,7,5));
    }
    public static int min(int a,int b){
        return a>b?b:a;
    }
    public static int findMinLength(int[] arr,int num1,int num2){
        int len=arr.length;
        int num1_index=-1;
        int num2_index=-1;
        int min_dist= Integer.MIN_VALUE+1;

        if (arr==null||arr.length<=1){
            return Integer.MIN_VALUE;
        }
        for (int i = 0; i < len; i++) {
            if (arr[i]==num1){
                num1_index=i;
                if (num2_index>=0){
                    min_dist=min(Math.abs(min_dist),Math.abs(num1_index-num2_index));
                }
            }
            if (arr[i]==num2){
                num2_index=i;
                if(num1_index>=0){
                    min_dist=min(Math.abs(min_dist),Math.abs(num1_index-num2_index));

                }
            }
        }
        return min_dist;
    }
}
