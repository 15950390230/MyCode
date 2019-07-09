package 面试宝典.数组的操作.求绝对值最小的数;

import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        int[] arr1=new int[]{-10,-5,-2,7,8,9,-1};
        int[] arr2=new int[]{14,2,5,48,-5,8,-6,7};
        int value=findMaxAbs(arr1);
        System.out.println(value);
        System.out.println(findMaxAbs(arr2));

    }
    public static int findMaxAbs(int[] arr){
        if (arr.length!=0||arr!=null){
            Arrays.sort(arr);
        }
        int n=arr.length;
        int begin=0;
        int mid=0;
        int end=n-1;
        int result;
        if (arr[n-1]<0){
            return Math.abs(arr[n-1]);
            }
        else if(arr[0]>0){
            return arr[0];
        }
        else{
            while(true){
                mid=(begin+end)/2;
                if (arr[mid]==0){return arr[mid];}
                else if(arr[mid]>0){
                    if (arr[mid-1]==0){return 0;}
                    else if(arr[mid-1]>0){
                        end=mid-1;
                    }
                    else{//找到正负的分界点
                        break;
                    }

                }
                else{
                    if (arr[mid+1]==0){return 0;}
                    else if(arr[mid+1]<0){
                        begin=mid+1;
                    }
                    else{//找到正负的分界点
                        break;
                    }
                }

            }
            if(arr[mid]<0){
                if (Math.abs(arr[mid])<arr[mid+1]){
                    result=arr[mid];
                }
                else{
                    result=arr[mid+1];
                }
            }
            else{
                if (arr[mid]>Math.abs(arr[mid-1])){
                    result=arr[mid-1];
                }
                else{
                    result=arr[mid];
                }
            }
            return result;
        }
    }
}
