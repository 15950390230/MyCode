package 数据结构与算法.栈;

public class MyStack {
    //栈的底层使用数组来存储数据
    int[] elements;
     public MyStack(){
         elements=new int[0];

     }
     //加入元素
    public void push(int element) {
        int[] arr1 =new int[elements.length+1];
        //把原数组的元素复制到新的数组中
        for (int i=0;i<elements.length;i++){
            arr1[i]=elements[i];
        }
        arr1[elements.length]=element;
        elements=arr1;
    }
    //取出栈顶元素

    public int pop() {
         if (elements.length==0){
             throw new RuntimeException("数组长度不能为0");
         }
         //取出最后一个元素
        int element=elements[elements.length-1];
        //创建一个新的数组
        int[] newarr=new int[elements.length-1];
        //原数组除了最后一个元素其他的都放入新数组中
        for (int i = 0; i <elements.length-1 ; i++) {
            newarr[i]=elements[i];
        }
        //替换数组
        elements=newarr;
        return element;
    }
    //查看栈顶元素

    public int peek() {

        return elements[elements.length-1];
    }
}
