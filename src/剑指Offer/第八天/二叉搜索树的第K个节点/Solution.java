package 剑指Offer.第八天.二叉搜索树的第K个节点;

import java.util.Stack;

//
//给定一棵二叉搜索树，请找出其中的第k小的结点。
// 例如， （5，3，7，2，4，6，8）    中，按结点数值大小顺序第三小结点的值为4。
//思路中序遍历第K个节点
public class Solution {
    TreeNode KthNode(TreeNode pRoot, int k)
    {
        if(pRoot==null||k==0) return null;
        int count=0;
        TreeNode tempNode=pRoot;
        Stack<TreeNode> stack=new Stack<TreeNode>();
        stack.push(pRoot);
        while (!stack.isEmpty()){
            if (tempNode!=null){
                while (tempNode.left!=null){
                    stack.push(tempNode.left);
                    tempNode=tempNode.left;
                }
            }
            tempNode=stack.pop();
            if (count++==k){
               return tempNode;
            }
            tempNode=tempNode.right;
            if (tempNode!=null){
               stack.push(tempNode);
             }

        }
        return tempNode;
    }
}
    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }