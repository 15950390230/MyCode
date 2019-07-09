package 笔试题库.动态规划.找不相邻数组元素的和最大_递归;

public class Test {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,4,1,7,8,3};

        System.out.println(findMax(arr,6));
    }
    public static int findMax(int[] arr , int i){
        if (i==0){
            return arr[0];
        }
        if (i==1){
            return max(arr[0],arr[1]);
        }else{
            //带arr[i]的
            int A=arr[i]+findMax(arr,i-2);
//            不带arr[i]
            int B=findMax(arr,i-1);
            return max(A,B);
        }


    }
    public static int max(int a,int b){
        return a>b?a:b;
    }
}
