package 数据结构与算法.树结构.二叉树先序遍历的非递归实现方式;

import java.util.Stack;

public class Solution {
    public void preOrder1(BinaryNode Node)
    {
        Stack stack = new Stack();
        while(Node != null || !stack.empty())
        {
            while(Node != null)
            {
                System.out.print(Node.element + "   ");
                stack.push(Node);
                Node = Node.left;
            }
            if(!stack.empty())
            {
                Node = (BinaryNode) stack.pop();
                Node = Node.right;
            }
        }
    }
}
class BinaryNode {
    public BinaryNode left;
    public BinaryNode right;
    public int element;
    BinaryNode(int newData) {
        left = null;
        right = null;
        element = newData;
    }
}