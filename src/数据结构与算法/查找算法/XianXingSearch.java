package 数据结构与算法.查找算法;

public class XianXingSearch {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4,5,6,7,8,9};
        int tar=8;
        int indexi=-1;
        for (int i=0;i<arr.length;i++){
            if(arr[i]==tar) {
                indexi=i;
                break;
            }
        }
        System.out.println(indexi);
    }
}
