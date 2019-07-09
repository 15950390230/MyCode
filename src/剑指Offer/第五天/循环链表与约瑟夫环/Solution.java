package 剑指Offer.第五天.循环链表与约瑟夫环;

public class Solution {
    public int LastRemaining_Solution(int n, int m) {
        if(n==0||m==0){
            return -1;
        }
        Node head = new Node();
        head.value = 0;
        head.next = head;
        Node nn = head;
        Node e = head;
        for(int i = 1;i<=n-1;i++){
            while(nn.next!=head){
                nn = nn.next;
            }
            Node node = new Node();
            node.value = i;
            nn.next = node;
            node.next = head;
        }
        for(int k = 1;k<=n-1;k++){
            for(int i=1;i<=m-2;i++){
                e = e.next;
            }
            Node d = e.next;
            e.next = d.next;
            e = d.next;
        }
        return e.value;
    }
}
class Node {
    public int value;
    public Node next = null;
}