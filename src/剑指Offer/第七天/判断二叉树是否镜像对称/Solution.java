package 剑指Offer.第七天.判断二叉树是否镜像对称;

public class Solution {
    boolean isSymmetrical(TreeNode pRoot)
    {
        if(pRoot==null) return true;
        return isSymmetrical(pRoot.left,pRoot.right);
    }

    private boolean isSymmetrical(TreeNode left, TreeNode right) {
        if (left==null&&right==null){
            return true;
        }
        if (left==null||right==null){
            return false;
        }
        if (left.val==right.val){
            return isSymmetrical(left.left,right.right)&&isSymmetrical(left.right,right.left);
        }
        return false;
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