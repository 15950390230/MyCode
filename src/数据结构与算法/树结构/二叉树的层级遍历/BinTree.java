package 数据结构与算法.树结构.二叉树的层级遍历;

import 数据结构与算法.树结构.二叉树.BinaryTree;

import java.util.ArrayDeque;
import java.util.Queue;

public class BinTree {
    private char date;
    private BinTree lchild;   //左孩子
    private BinTree rchild;   //右孩子

    private BinTree(char c ){
        date = c;
    }
//二叉树的层级遍历
    public static void BFSOrderI(BinTree binTree){
        if (binTree==null){
            return;
        }
        Queue<BinTree> queue=new ArrayDeque<>();
        queue.offer(binTree);
        while (!queue.isEmpty()){
            binTree=queue.poll();
            System.out.println(binTree.date);
            if (binTree.lchild!=null){
                queue.offer(binTree.lchild);
            }
            if (binTree.rchild!=null){
                queue.offer(binTree.rchild);
            }
        }
    }
        /* *   a
        *    /   \
        *   b     c
        *  / \   / \
      *  d    e f   g
      */
    public static void main(String[] args) {
        BinTree b1=new BinTree('a');
        BinTree b2=new BinTree('b');
        BinTree b3=new BinTree('c');
        BinTree b4=new BinTree('d');
        BinTree b5=new BinTree('e');
        BinTree b6=new BinTree('f');
        BinTree b7=new BinTree('g');
        b1.lchild=b2;
        b1.rchild=b3;
        b2.lchild=b4;
        b2.rchild=b5;
        b3.lchild=b6;
        b3.rchild=b7;
        BFSOrderI(b1);


    }
//
}
