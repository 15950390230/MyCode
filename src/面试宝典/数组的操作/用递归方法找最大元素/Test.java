package 面试宝典.数组的操作.用递归方法找最大元素;

public class Test {
    public static int max(int a,int b){
        return a>b?a:b;
    }
    public static int maxNum(int[] a, int begin){
        if (a.length-begin==1){
            return a[begin];
        }
        else{
            return max(a[begin],maxNum(a,begin+1));
        }
    }

    public static void main(String[] args) {
        int[] arr=new int[]{0,16,2,3,4,5,6,10,7,8,9,11};
        System.out.println(maxNum(arr,0));
    }
}
