package 数据结构与算法.队列;

public class MyQueue {
    int[] elements;
    public MyQueue(){
        elements=new int[0];
    }
//入队
    public void add(int element) {
        int[] arr1 =new int[elements.length+1];
        //把原数组的元素复制到新的数组中
        for (int i=0;i<elements.length;i++){
            arr1[i]=elements[i];
        }
        arr1[elements.length]=element;
        elements=arr1;
    }
    //出队

    public int poll() {
        //取出最后一个元素
        int element=elements[0];
        //创建一个新的数组
        int[] newarr=new int[elements.length-1];
        //原数组除了最后一个元素其他的都放入新数组中
        for (int i = 0; i <elements.length-1 ; i++) {
            newarr[i]=elements[i+1];
        }
        //替换数组
        elements=newarr;
        return element;
    }
//    判断队列是否为空
    public Boolean isEmpty() {
    return elements.length==0;
    }
    }
