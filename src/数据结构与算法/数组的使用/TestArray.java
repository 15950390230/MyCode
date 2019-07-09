package 数据结构与算法.数组的使用;

public class TestArray {
    public static void main(String args[]){
//        数组的创建
        int[] arr1=new int[3];
//        计算数组的长度
        int length=arr1.length;
        System.out.println(length);
//        访问数组中的元素
        int element1=arr1[0];
        System.out.println(element1);
//        数组元素的赋值
        arr1[0]=99;
        arr1[1]=98;
        arr1[2]=97;
//        数组的遍历
        for (int i=0;i<arr1.length;i++){
            System.out.println("arr1["+i+"]:"+arr1[i]);
        }
//        创建数组的同时赋值
        int[] arr2=new int[]{98,97,96};
        for (int i=0;i<arr1.length;i++){
            System.out.println("arr2["+i+"]:"+arr2[i]);
        }
    }
}
