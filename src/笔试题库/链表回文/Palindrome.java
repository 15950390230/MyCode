package 笔试题库.链表回文;

import java.util.Stack;

public class Palindrome {
    public boolean isPalindrome(ListNode pHead) {
        // write code here
        ListNode fast = pHead;
        ListNode slow = pHead;
        Stack<Integer> stack = new Stack<Integer>();
        while (fast!=null&&fast.next!=null){
            stack.push(slow.val);
            slow=slow.next;
            fast=fast.next.next;
        }
        if (fast!=null){
            slow=slow.next;
        }
        while (slow!=null){
            if (stack.pop()!=slow.val){
                return false;
            }
            slow=slow.next;
        }
                return true;
    }
}
