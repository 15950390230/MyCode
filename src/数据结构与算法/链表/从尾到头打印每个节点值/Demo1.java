package 数据结构与算法.链表.从尾到头打印每个节点值;

import java.util.Stack;

public class Demo1 {
    public static void main(String[] args) {
        Node node1=new Node(1);
        Node node2=new Node(2);
        Node node3=new Node(3);
        Node node4=new Node(4);
        Node node5=new Node(5);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
//        System.out.println(node5.getNext().getData());

        printTailToHead(node1);
    }
    public static void printTailToHead(Node head){
        Stack stack=new Stack();
        Node pnode=head;
        while (pnode!=null){
            stack.push(pnode.getData());
            pnode=pnode.getNext();
        }
        while (!stack.empty()){
            System.out.println(stack.pop());
        }
    }
}
