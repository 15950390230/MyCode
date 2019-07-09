package 数据结构与算法.查找算法;

public class ErFenSearch {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4,5,6,7,8,9};
        int tar=10;
        int left=0;
        int right=arr.length-1;
        int mid=(left+right)/2;
        int index=-1;
       while(true){
           if(left<right) {
               if (arr[mid] == tar) {
                   index = mid;
                   break;
               } else {
                   if (arr[mid] > tar) {
                       right = mid - 1;

                   } else {
                       left = mid + 1;
                   }
                   mid = (left + right) / 2;
               }
           }
           else {
               System.out.println("找不到");
               break;
           }
       }

        System.out.println("index="+index);
    }
}
