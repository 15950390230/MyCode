package 剑指Offer.第三天.二叉搜索树转双向链表;

import java.util.Stack;

public class Solution {
    /*
    * 解题思路：
1.核心是中序遍历的非递归算法。
2.修改当前遍历节点与前一遍历节点的指针指向。*/
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree==null){
            return null;
        }
        Stack<TreeNode> stack=new Stack<>();
        TreeNode root=pRootOfTree;
        TreeNode pPre =null;// 用于保存中序遍历序列的上一节点
        TreeNode rou =null;
        Boolean fir=true;
        while (root!=null||!stack.isEmpty()){
            while (root!=null){
                stack.push(root);
                root=root.left;
            }
            root=stack.pop();
            if (fir){
                rou=root;// 将中序遍历序列中的第一个节点记为rou
                pPre = root;
                fir=false;
            }
            else{
                pPre.right=root;
                root.left=pPre;
                pPre=root;
            }
            root=root.right;
        }
        return rou;
    }
}
