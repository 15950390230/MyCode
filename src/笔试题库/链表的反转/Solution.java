package 笔试题库.链表的反转;
 class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Solution {
    public ListNode ReverseList(ListNode head) {
        if(head==null)
            return null;
        ListNode newHead = null;
        ListNode pNode = head;
        ListNode pPrev = null;
        while (pNode!=null){
            ListNode pNext = pNode.next;
            if (pNext==null){
                newHead = pNode;
            }
            pNode.next=pPrev;
            pPrev=pNode;//每次记录
            pNode=pNext;
        }
        return newHead;
    }
}
