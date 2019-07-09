package 面试宝典.二进制左移右移.找出出现的次数为K的数;

public class Demo1 {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,1,2,4,2,4,4,1,3};
        int num=findKTimes(arr,3);
        System.out.println(num);
    }
    public static int findKTimes(int[] arr,int k){
        int n=arr.length;
        int[] bitCount=new int[32];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <32 ; j++) {
                bitCount[j]+=((arr[i]>>j)&1);
            }
        }
        int appearOne=0;
        for (int i = 0; i <32 ; i++) {
            if (bitCount[i]%k!=0){
                appearOne += (1<<i);
            }
        }
        return appearOne;
    }
}
