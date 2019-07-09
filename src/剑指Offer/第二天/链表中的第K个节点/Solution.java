package 剑指Offer.第二天.链表中的第K个节点;

import java.time.chrono.IsoChronology;

public class Solution {
    public static ListNode FindKthToTail(ListNode head, int k) {
        if (k<=0){
            return null;
        }
        ListNode l1=head;
        ListNode l2=head;
        for (int i = 0; i < k; i++) {
            if (l2==null)
            {
                return null;
            }
            else {
                l2=l2.next;
            }
        }
        if (l2==null){
            return head;
        }

        while (l2!=null){
            l1=l1.next;
            l2=l2.next;

    }return l1;
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
        ListNode res=FindKthToTail(node1,11);
        if (res==null){
            System.out.println("没有这个点");
        }
        else{
            System.out.println(res.val);
        }
    }
}
