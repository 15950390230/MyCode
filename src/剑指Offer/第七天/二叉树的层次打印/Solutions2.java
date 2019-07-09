package 剑指Offer.第七天.二叉树的层次打印;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
//层次遍历用队列
public class Solutions2 {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(pRoot == null){
            return result;
        }
        //使用队列，先进先出
        Queue<TreeNode> layer = new LinkedList<TreeNode>();
        ArrayList<Integer> layerList = new ArrayList<Integer>();
        layer.add(pRoot);
        int start = 0, end = 1;//start记录本层打印了多少个，end记录下一层要打印多少个
        while(!layer.isEmpty()){
            //判断队列中有元素
            TreeNode cur = layer.remove();
            layerList.add(cur.val);//添加本行打印的List里
            start++;
            //每打印一个节点，就把此节点的下一层的左右节点加入队列，并记录下一层要打印的个数
            if(cur.left!=null){
                layer.add(cur.left);
            }
            if(cur.right!=null){
                layer.add(cur.right);
            }
            //本层打印完毕
            if(start == end){
                //此时的layer中存储的都是下一层的节点，则end即为layer大小
                end = layer.size();
                //重置start
                start = 0;
                //将layerList加入结果列表result中
                result.add(layerList);
                //重置layerList
                layerList = new ArrayList<Integer>();
            }
        }
        return result;
        }
    }

