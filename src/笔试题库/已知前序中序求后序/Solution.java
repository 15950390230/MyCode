package 笔试题库.已知前序中序求后序;

/*作者：Monotone
链接：https://www.nowcoder.com/questionTerminal/8a19cbe657394eeaac2f6ea9b0f6fcf6
来源：牛客网

递归思想，每次将左右两颗子树当成新的子树进行处理，
中序的左右子树索引很好找，
前序的开始结束索引通过计算中序中左右子树的大小来计算，
然后递归求解，
直到startPre>endPre||startIn>endIn说明子树整理完到。
方法每次返回左子树活右子树的根节点*/
public class Solution {

    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        TreeNode root=reConstructBTree(pre,0,pre.length-1,in,0,in.length-1);
        return root;
    }
    private TreeNode reConstructBTree(int [] pre,int startPre,int endPre,
                                      int [] in,int startIn,int endIn) {

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

