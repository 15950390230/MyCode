package 剑指Offer.第五天.两个链表的第一个公共节点;

public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1==null||pHead2==null){
            return null;
        }
        int l1=0;
        int l2=0;
        ListNode temp1=pHead1;
        ListNode temp2=pHead2;
        while (temp1!=null){
            l1++;
            temp1=temp1.next;
        }
        while (temp2!=null){
            l2++;
            temp2=temp2.next;
        }
        if (l1>=l2){
            int cha=l1-l2;
            for (int i = 0; i <cha ; i++) {
                pHead1=pHead1.next;
            }
            while (pHead1 != pHead2){
                pHead2 = pHead2.next;
                pHead1 = pHead1.next;
            }
            return pHead1;
        }
        else {
            int cha=l1-l2;
            for (int i = 0; i < cha; i++) {
                pHead2=pHead2.next;
            }
            while (pHead1 != pHead2){
                pHead2 = pHead2.next;
                pHead1 = pHead1.next;
            }
            return pHead1;
        }

//        return null;
    }
}
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}