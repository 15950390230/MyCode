package 数据结构与算法.栈;

public class TestMyStack {
    public static void main(String[] args) {
        MyStack myStack=new MyStack();
        //存储元素
        myStack.push(9);
        myStack.push(8);
        myStack.push(7);
        int pop =myStack.pop();
        System.out.println(pop);
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
    }


}
