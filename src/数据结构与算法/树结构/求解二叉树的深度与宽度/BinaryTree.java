package 数据结构与算法.树结构.求解二叉树的深度与宽度;

import java.util.ArrayDeque;
import java.util.Queue;

public class BinaryTree {
    char val;
    BinaryTree left = null;
    BinaryTree right = null;

    BinaryTree(char _val) {
        this.val = _val;
    }

//    二叉树的深度
//    采用递归的方法
    public static int getMaxDepth(BinaryTree root){
        if (root==null){
            return 0;
        }
        else{
            int left=getMaxDepth(root.left);
            int right=getMaxDepth(root.right);
            return 1+Math.max(left,right);
        }
    }
//    二叉树的宽度
    public static int getMaxWidth(BinaryTree root){
        if (root == null){
            return 0;
        }
        Queue<BinaryTree> queue = new ArrayDeque<BinaryTree>();
        int maxWitdth = 1; // 最大宽度
        queue.add(root); // 入队
        while (true){
            int len=queue.size();
            if (len==0){
                break;
            }
            while (len > 0) {// 如果当前层，还有节点
                BinaryTree t = queue.poll();
                len--;
                if (t.left != null)
                    queue.add(t.left); // 下一层节点入队
                if (t.right != null)
                    queue.add(t.right);// 下一层节点入队
            }
            maxWitdth=Math.max(maxWitdth,queue.size());
        }
        return maxWitdth;
    }

    /* *   a
     *    /   \
     *   b     c
     *  / \   / \
     *  d    e f   g
     */
    public static void main(String[] args) {
        BinaryTree b1=new BinaryTree('a');
        BinaryTree b2=new BinaryTree('b');
        BinaryTree b3=new BinaryTree('c');
        BinaryTree b4=new BinaryTree('d');
        BinaryTree b5=new BinaryTree('e');
        BinaryTree b6=new BinaryTree('f');
        BinaryTree b7=new BinaryTree('g');
        b1.left=b2;
        b1.right=b3;
        b2.left=b4;
        b2.right=b5;
        b3.left=b6;
        b3.right=b7;

        System.out.println("二叉树的深度为"+getMaxDepth(b1));
        System.out.println("二叉树的宽度为"+getMaxWidth(b1));

    }
}
