package 数据结构与算法.树结构.顺序存储的二叉树;

public class TestArrayBinaryTree {
    public static void main(String[] args) {
        int[] data=new int[]{4,5,2,7,8,3,1};
        SequenceBinaryTree sequenceBinaryTree=new SequenceBinaryTree(data);
        sequenceBinaryTree.frontShow();
    }

}
