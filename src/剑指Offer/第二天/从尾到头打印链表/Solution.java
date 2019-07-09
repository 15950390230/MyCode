package 剑指Offer.第二天.从尾到头打印链表;

import 面试宝典.值与引用参数传递.Inc;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 输入一个链表按数值从尾到头的顺序返回一个Arraylist*/
public class Solution
{
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
        Stack<Integer> temp=new Stack<>();
        ArrayList<Integer> newList=new ArrayList<>();
        ListNode t=listNode;
        while (listNode!=null){
            temp.push( listNode.val);
            listNode=listNode.next;
        }
        while (temp.isEmpty()){
            newList.add(temp.pop());
        }
        return newList;
    }
}
 class ListNode {
    int val;
    ListNode next = null;
    ListNode(int val) {
    this.val = val;
     }
    }