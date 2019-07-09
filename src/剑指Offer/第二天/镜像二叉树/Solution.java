package 剑指Offer.第二天.镜像二叉树;

public class Solution {
    public void Mirror(TreeNode root) {
        TreeNode temp =null;
        if(root!=null){
            temp=root.left;
            root.left=root.right;
            root.right=temp;
        }
        if (root.right!=null){
            Mirror(root.right);
        }
        if (root.left!=null){
            Mirror(root.left);
        }
    }
}
