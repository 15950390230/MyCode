package 笔试题库.链表返回Arraylist;

import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> temp = new Stack<>(); //建立一个栈
        ArrayList<Integer> newList = new ArrayList<>();
        ListNode t = listNode;
        //将数据都先存入栈中
        while( t != null ){
//往栈里面放数据
            temp.push(t.val);
            t = t.next;
        }
        //遍历栈
        while( !temp.empty() ){
//            栈取数据
            newList.add(temp.pop());
        }
        return newList;
    }
}
