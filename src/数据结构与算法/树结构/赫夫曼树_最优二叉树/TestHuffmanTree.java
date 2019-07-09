package 数据结构与算法.树结构.赫夫曼树_最优二叉树;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestHuffmanTree {
    public static void main(String[] args) {
        int[] arr=new int[]{3,5,7,8,11,14,23,29};
        Node node= creatHuffmanTree(arr);
                System.out.println(node);

    }
//创建赫夫曼树
    public static Node creatHuffmanTree(int[] arr) {
        //        先使用数组中的所有元素创建若干个二叉树，（只有一个节点）

        List<Node> nodes =new ArrayList<>();
        for (int value:arr) {
            nodes.add(new Node(value));
        }
//        循环处理
        while(nodes.size()>1)
        {
//数据结构与算法.排序
            Collections.sort(nodes);
//            取出权值最小的二叉树
            Node left=nodes.get(nodes.size()-1);
//            次小的
            Node right=nodes.get(nodes.size()-2);
//        创建新的二叉树
            Node parent =new Node(left.value+right.value);
//        取出的二叉树移除
            nodes.remove(left);
            nodes.remove(right);
//        放入原有的二叉树集合中
            nodes.add(parent);
}
        return nodes.get(0);
    }
}
