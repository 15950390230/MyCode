package 笔试题库.动态规划.找不相邻数组元素的和最大_for;

public class Test {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,4,1,7,8,3};

        System.out.println(findMax(arr));
    }
    public static int findMax(int[] arr){
        int n=arr.length;
        int[] havei=new int[arr.length];
        int[] result=new int[arr.length];
        havei[0]=arr[0];
        result[0]=arr[0];
        if (n==2){
            havei[1]=arr[1];
            result[1]=max(arr[1],arr[0]);
        }
       else if (n>2) {
            for (int i = 2; i < arr.length; i++) {
                havei[i] = arr[i] + result[i - 2];
                result[i]=max(havei[i],result[i-1]);
            }

        }
        return result[n-1];
    }
    public static int max(int a,int b){
        return a>b?a:b;
    }
}
