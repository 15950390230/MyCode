package 剑指Offer.第二天.链表的反转;

public class Solution {
    public static ListNode ReverseList(ListNode head) {
        if (head==null)
        {
            return null;
        }
        else{
            ListNode pre=null;
            ListNode pNode=head;
            ListNode newHead=null;
            while (pNode!=null){
                ListNode pNext=null;
                pNext=pNode.next;
                if (pNext==null){
                    newHead=pNode;
                }
                pNode.next=pre;
                pre=pNode;
                pNode=pNext;
            }
            return newHead;
        }
    }
    public static void printListNode(ListNode head){
        if (head==null){
            System.out.println("无任何元素");
        }
        while (head!=null){
            System.out.println(head.val);
            head=head.next;
        }
    }

    public static void main(String[] args) {
        ListNode node1=new ListNode(1);
        ListNode node2=new ListNode(2);
        ListNode node3=new ListNode(3);
        ListNode node4=new ListNode(4);
        ListNode node5=new ListNode(5);
        ListNode node6=new ListNode(6);
        ListNode node7=new ListNode(7);
        ListNode node8=new ListNode(8);
        ListNode node9=new ListNode(9);
        ListNode node10=new ListNode(10);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
        node5.setNext(node6);
        node6.setNext(node7);
        node7.setNext(node8);
        node8.setNext(node9);
        node9.setNext(node10);
        printListNode(node1);
        System.out.println("--------");
        ListNode newhead=ReverseList(node1);
        printListNode(newhead);

    }
}
