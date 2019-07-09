package 剑指Offer.第二天.单调链表的合并;
/**
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 * */
public class Solution {
    public static ListNode Merge(ListNode list1,ListNode list2) {
        ListNode node1=list1;
        ListNode node2=list2;
        if (node1==null){
            return node2;
        }
        if (node2==null){
            return node1;
        }
        ListNode headb=new ListNode(-1);
        ListNode heada=headb;
        while (node1!=null&&node2!=null){
            if (node1.val<node2.val){
                headb.next=node1;
                headb=node1;
                node1=node1.next;
            }
            else{
                headb.next=node2;
                headb=node2;
                node2=node2.next;
            }
        }
        if (node2!=null){
            headb.next=node2;
        }
        if (node1!=null){
            headb.next=node1;
        }
        return heada.next;
    }

    public static void main(String[] args) {
        ListNode head1=new ListNode(1);
        ListNode head2=new ListNode(2);
        ListNode node1=new ListNode(3);
        ListNode node2=new ListNode(5);
        ListNode node3=new ListNode(7);
        ListNode node4=new ListNode(9);
        ListNode node5=new ListNode(11);
        ListNode bNode1=new ListNode(4);
        ListNode bNode2=new ListNode(6);
        ListNode bNode3=new ListNode(8);
        ListNode bNode4=new ListNode(10);
        ListNode bNode5=new ListNode(12);
        head1.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
        head2.setNext(bNode1);
        bNode1.setNext(bNode2);
        bNode2.setNext(bNode3);
        bNode3.setNext(bNode4);
        bNode4.setNext(bNode5);
        printListNode(head1);
        System.out.println("---------");
        printListNode(head2);
        System.out.println("---------");
        ListNode newhead=Merge(head1,head2);

        printListNode(newhead);
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
}
