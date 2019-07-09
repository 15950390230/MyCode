package 剑指Offer.第七天.二叉树的下一个节点;
//中序遍历的下一个节点
public class Solution {
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if (pNode==null){
            return null;
        }
        TreeLinkNode next=null;
        if (pNode.right!=null){
            next=pNode.right;
            while(next.left!=null) {
                next=next.left;
            }
            return next;
        }
        next=pNode;
        while(next.next!=null) {
            if(next.next.left==next)
                return next.next;
            next=next.next;
        }
        return null;
    }
}
class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}