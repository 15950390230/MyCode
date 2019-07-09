package 剑指Offer.第五天.平衡二叉树的判断;
/*输入一棵二叉树，判断该二叉树是否是平衡二叉树。*/
public class Solution {
    public boolean IsBalanced_Solution(TreeNode root) {
        if (root == null)
            return true;

        if (Math.abs(getHeight(root.left) - getHeight(root.right)) > 1)
            return false;


        return IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
    }
    public int getHeight(TreeNode root) {
        if (root == null)
            return 0;
        return max(getHeight(root.left), getHeight(root.right)) + 1;
    }
    private int max(int a, int b) {
        return (a > b) ? a : b;
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
