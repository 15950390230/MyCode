package 笔试题库.树_子树的判断;

public class Solution {
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
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

  class TreeNode { int val = 0; TreeNode left = null; TreeNode right =
  null;

  public TreeNode(int val) { this.val = val;

  }

  }
