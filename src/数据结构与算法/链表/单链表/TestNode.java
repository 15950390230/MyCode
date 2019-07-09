package 数据结构与算法.链表.单链表;

public class TestNode {
    public static void main(String[] args) {
//创建节点
        Node node1=new Node(1);
        Node node2=new Node(2);
        Node node3=new Node(3);
        node1.append(node2);
        node2.append(node3);
        System.out.println(node1.Next().getData());
        System.out.println(node2.Next().getData());
//        System.out.println(node3.Next().getData());
    }
}
