package 数据结构与算法.链表.双链表;

public class DoubleNode {
//    上一个节点
    DoubleNode nodePre=this;
    DoubleNode nodeNext=this;
    int data;

    public DoubleNode(int data) {
        this.data = data;
    }
//增加节点
    public void after(DoubleNode doubleNode) {
//        原来的下一个节点
       DoubleNode nextNode=nodeNext;
//       把新节点作为当前节点的下一个节点
        this.nodeNext=doubleNode;
//        把当前节点作为新节点的前一个节点
        doubleNode.nodePre=this;
//        让原来的下一个节作为新节点的下一个节点
        doubleNode.nodeNext=nextNode;
//        让原来的下一个节点的上一个节点为新节点
        nextNode.nodePre=doubleNode;
           }

//上一个节点
           public DoubleNode next(){
        return this.nodeNext;
           }
//           下一个节点
    public DoubleNode pre(){
        return this.nodePre;
    }
//    获取数据
    public int getData(){
        return this.data;

    }
}
