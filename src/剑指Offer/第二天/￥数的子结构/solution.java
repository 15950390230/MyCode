package 剑指Offer.第二天.￥数的子结构;

public class solution {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        boolean result = false;
        if (root1 == null || root2 == null) {
            return false;
        }
        if (root1.val == root2.val) {
            result = Isconbtain(root1,root2);
        }
        if (!result) {
            result = HasSubtree(root1.left, root2);
        }
        if (!result) {
            result = HasSubtree(root1.right, root2);
        }
        return result;
    }
    public boolean Isconbtain(TreeNode root1, TreeNode root2){
        if(root2==null){
            return true;
        }
        if(root1==null){
            return false;
        }
        if(root1.val!=root2.val){
            return false;
        }
        return Isconbtain(root1.left,root2.left)&&Isconbtain(root1.right,root2.right);
    }
}
