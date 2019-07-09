package 剑指Offer.第三天.￥二叉树中和为某一值的路径;

import java.util.ArrayList;
/*输入一颗二叉树的跟节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
(注意: 在返回值的list中，数组长度大的数组靠前)*/
public class Solution {
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> arr=new ArrayList<ArrayList<Integer>>();
        if(root==null)
            return arr;
        ArrayList<Integer> a1=new ArrayList<>();
        int sum=0;
        pa(root,target,arr,a1,sum);
        return arr;
    }

    private void pa(TreeNode root, int target, ArrayList<ArrayList<Integer>> arr, ArrayList<Integer> a1, int sum) {
        if(root==null)
            return ;
        sum+=root.val;

        if(root.left==null&&root.right==null){//判断是叶子节点
            if(sum==target)//满足条件
            { a1.add(root.val);
                arr.add(new ArrayList<Integer>(a1));
                a1.remove(a1.size()-1);

            }
            return ;//无论满不满足条件；

        }
//        非叶子节点
        a1.add(root.val);
        pa(root.left,target,arr,a1,sum);//不行移除换右面
        pa(root.right,target,arr,a1,sum);//右面的子树等待左子树遍历完毕
        a1.remove(a1.size()-1);//左右都不通移除最后递归添加的元素
    }
}
