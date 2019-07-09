package 剑指Offer.第一天.重建二叉树;
/**
 * 输入某二叉树的前序遍历和中序遍历的结果，
 * 请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}
 * 和中序遍历序列{4,7,2,1,5,3,8,6}，
 * 则重建二叉树并返回。*/
public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        TreeNode root=reConstructBTree(pre,0,pre.length-1,in,0,in.length-1);
        return root;
    }
    private TreeNode reConstructBTree(int [] pre,int startPre,int endPre,
                                      int [] in,int startIn,int endIn){

        if(startPre>endPre||startIn>endIn)
            return null;
//        确定根节点
        TreeNode root=new TreeNode(pre[startPre]);
//        根据前序找中序左右子树
        for(int i=startIn;i<=endIn;i++)
            if(in[i]==pre[startPre]){
//                确定左子树参数   包括左子树的前序遍历开始到结束  后序遍历的开始到结束位置
                root.left=reConstructBTree(pre,startPre+1,startPre+i-startIn,in,startIn,i-1);
                root.right=reConstructBTree(pre,i-startIn+startPre+1,endPre,in,i+1,endIn);
            }

        return root;

    }
}

  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
