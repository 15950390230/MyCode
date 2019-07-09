package 数据结构与算法.链表.从尾到头打印每个节点值;

public class Node {
     int data;
     Node next;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public  Node (int data){
        this.data=data;
        this.next=null;
    }

}
