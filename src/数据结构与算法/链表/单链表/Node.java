package 数据结构与算法.链表.单链表;

//一个节点
public class Node {
//    节点内容
    int data;
//    下一个节点
    Node next;
    public  Node (int data){
        this.data=data;
    }
//    为节点追加节点

    public void append(Node node) {
        this.next=node;
    }
//    /    为节点追加节点

    public void appendTail(Node node) {
        Node node0=this;
        while(true){
            Node nextnode=node0.next;
//            如果没有下一个节点
            if (nextnode==null){
                break;
            }
            else
            {
                node0=nextnode;
            }
        }
        node0.next=node;

    }
//    删除下一个节点

    public void removeNext() {
//        取出下下个节点
//        Node next=Next().Next();
        Node newnext=next.next;
//        把下下个节点设置为当前节点的下一个节点
        this.next=newnext;
    }

    //获取下一个节点
    public Node Next(){
        return  this.next;
    }
//    获取节点中的元素
    public  int getData(){
        return this.data;
    }
}
