package 笔试题库.删除数组中的重复元素;

import java.util.Arrays;

public class test {
    //需要传入一个Object数组，然后返回去重后的数组
    public static Object[] ifRepeat(Object[] arr){
        //用来记录去除重复之后的数组长度和给临时数组作为下标索引
        int t = 0;
        //临时数组
        Object[] tempArr = new Object[arr.length];
        //遍历原数组
        for(int i = 0; i < arr.length; i++){
            //声明一个标记，并每次重置
            boolean isTrue = true;
            //内层循环将原数组的元素逐个对比
            for(int j=i+1;j<arr.length;j++){
                //如果发现有重复元素，改变标记状态并结束当次内层循环
                if(arr[i]==arr[j]){
                    isTrue = false;
                    break;
                }
            }
            //判断标记是否被改变，如果没被改变就是没有重复元素
            if(isTrue){
                //没有元素就将原数组的元素赋给临时数组
                tempArr[t++] = arr[i];


            }
        }
        System.out.println(Arrays.toString(tempArr));
        //声明需要返回的数组，这个才是去重后的数组
        Object[]  newArr = new Object[t];
        //用arraycopy方法将刚才去重的数组拷贝到新数组并返回
        System.arraycopy(tempArr,0,newArr,0,t);
        return newArr;
    }

    public static void main(String[] args) {
        Object[] ob=new Object[]{1,8,1,2,5,3,2,5,3,6};
        System.out.println(Arrays.toString(ob));
        Object[] bewob=ifRepeat(ob);
        System.out.println(Arrays.toString(bewob));
    }
}
