package 剑指Offer.第七天.删除链表中的重复节点;
/*
* 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，
* 重复的结点不保留，返回链表头指针。 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
* */
public class Solution {
    public ListNode deleteDuplication(ListNode pHead)
    {
        if(pHead==null){
            return  null;
        }
        ListNode p=pHead;
        ListNode n=new ListNode(0);
        n.next= pHead;
        ListNode last=n;
        while (p!=null&&p.next!=null){
            if(p.val==p.next.val){
                int val=p.val;
                while (p!=null&&p.val==val){
                    p=p.next;
                }
                last.next=p;
            }else {
                last=p;
                p=p.next;
            }
        }
        return  n.next;
    }
}
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}