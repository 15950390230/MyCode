package 数据结构与算法.数组的使用.查找二维数组中的数;

public class Demo1 {
    public static void main(String[] args) {
        int[][] arr=new int[][]{{1,2,8,9},{2,4,9,2},{4,7,10,13},{6,8,11,15}};
        find(arr,4);

    }
    public static void find(int[][] Arr,int num){
        int n=0;
        int m=Arr[0].length-1;
        while (n<Arr.length && m>=0){
                if (Arr[n][m] == num) {
                    System.out.println("找到了");
                    System.out.println("所在位置为Arr["+n+"]["+m+"]");
                    return;
                }
                if (Arr[n][m] > num) {
                    m--;
                }
                else{ n++; }

        }
        if (m<0||n>=Arr.length){
            System.out.println("没找到");
        }
    }
}
