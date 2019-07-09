package 面试宝典.数组的操作.动态规划求数对之差的最大值;
//利用动态规划查找数组中数对之差的最大值
public class Demo1 {
    public static void main(String[] args) {
        int[] arr=new int[]{1,17,3,7,6,2,1,3,6,9,4};
        int max=findMaxCha(arr);
        System.out.println(max);
    }
    public static int max(int a,int b){
        return a>b?a:b;
    }
    public  static int  findMaxCha(int[] arr){
        if(arr.length<=0||arr==null){
            return Integer.MIN_VALUE;
        }
            int diff;
            int maxn;
            diff=Integer.MIN_VALUE;//最优策略
            maxn=arr[0];//寻优决策中间量
            for (int i = 1; i <arr.length ; i++) {
                diff=max(diff,maxn-arr[i]);
                maxn=max(maxn,arr[i]);
            }
        return diff;
    }
}
