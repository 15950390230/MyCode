package 笔试题库.两个链表的合并;

public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode p = list1,q = list2;
        ListNode head = new ListNode(-1);
        ListNode tail = head;

        while(p != null && q != null) {
            if(p.val < q.val) {
                tail.next = p;
                tail = p;
                p = p.next;
            }else {
                tail.next = q;
                tail = q;
                q = q.next;
            }
        }

        if(p != null) {
            tail.next = p;
        }

        if(q != null) {
            tail.next = q;
        }

        return head.next;
    }
}
 class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}