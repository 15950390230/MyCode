package 剑指Offer.第三天.从上往下打印二叉树;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
/**
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。*/
public class Solution {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list= new ArrayList<>();
        if(root == null) return list;
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
