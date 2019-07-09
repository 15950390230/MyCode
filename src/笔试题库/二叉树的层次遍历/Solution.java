package 笔试题库.二叉树的层次遍历;

import com.sun.org.apache.bcel.internal.generic.NEWARRAY;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        if (root==null){
            return null;
        }
        ArrayList<Integer> list= new ArrayList<>();
        Deque<TreeNode> deque = new LinkedList<TreeNode>();
         deque.add(root);
         while (!deque.isEmpty()){
             TreeNode treeNode=deque.pop();
             list.add(treeNode.val);
             if (treeNode.left!=null){ deque.add(treeNode.left);}
             if (treeNode.right!=null){ deque.add(treeNode.right);}
         }
         return list;
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