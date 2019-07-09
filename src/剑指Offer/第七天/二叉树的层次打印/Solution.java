package 剑指Offer.第七天.二叉树的层次打印;

import java.util.ArrayList;

public class Solution {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        depth(pRoot, 1, list);
        return list;
    }
//定义一个变量来记录遍历到那一行
    private void depth(TreeNode pRoot, int i, ArrayList<ArrayList<Integer>> list) {
        if(pRoot == null) return;
        if(i > list.size())
            list.add(new ArrayList<Integer>());
        list.get(i -1).add(pRoot.val);

        depth(pRoot.left, i + 1, list);
        depth(pRoot.right, i + 1, list);
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