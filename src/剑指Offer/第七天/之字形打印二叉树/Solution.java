package 剑指Offer.第七天.之字形打印二叉树;
///用栈，先进后出，但是注意要用两个栈，因为如果用一个的话，本层的节点会压在最底下，此节点的子节点会放在最上边
import java.util.ArrayList;
import java.util.Stack;

public class Solution
{
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList list=new ArrayList<ArrayList<Integer>>();
        if(pRoot==null)
            return list;
        Stack s1=new Stack();//从左到右输出，所以添加时先加右，再加左
        Stack s2=new Stack();//从右到左输出，所以添加时先加左，再加右
        s1.push(pRoot);
        ArrayList arr=new ArrayList<Integer>();
        while(true){//遍历s1然后往s2里添加元素
            while(s1.size()!=0){
                TreeNode node=(TreeNode)s1.pop();
                arr.add(node.val);
                if(node.left!=null)
                    s2.push(node.left);
                if(node.right!=null)
                    s2.push(node.right);
            }
            list.add(arr);
            arr=new ArrayList<Integer>();
            if(s1.size()==0&&s2.size()==0)
                break;
            while(s2.size()!=0){//遍历s2然后往s1里添加元素顺序相反
                TreeNode node1=(TreeNode)s2.pop();
                arr.add(node1.val);
                if(node1.right!=null)
                    s1.push(node1.right);
                if(node1.left!=null)
                    s1.push(node1.left);
            }
            list.add(arr);
            arr=new ArrayList<Integer>();

            if(s1.size()==0&&s2.size()==0)
                break;
        }

        return list;
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