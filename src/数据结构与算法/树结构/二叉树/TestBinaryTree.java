package 数据结构与算法.树结构.二叉树;

public class TestBinaryTree {
    public static void main(String[] args) {
//        创建一棵树
        BinaryTree binaryTree=new BinaryTree();
//        创建根节点
        TreeNode root=new TreeNode(1);
//    把根节点赋值给树
        binaryTree.setRoot(root);
//        在创建俩个子节点
        TreeNode node1=new TreeNode(2);
        TreeNode node2=new TreeNode(3);
//把新创建的节点作为跟节点的子节点
        root.setLeft(node1);
        root.setRight(node2);
//        创建其他节点
//        为第二层的左边创建两个子节点
        node1.setLeft(new TreeNode(4));
        node1.setRight(new TreeNode(5));
        node2.setLeft(new TreeNode(6));
        node2.setRight(new TreeNode(7));
//        遍历树
//        前序遍历
//        binaryTree.frontShow();
//        中序遍历
        binaryTree.midShow();
   //    后续遍历
    binaryTree.afterShow();
//    前序查找
       binaryTree.frontSearch(5);
//删除一个子树
        binaryTree.delete(5);
        System.out.println("=============");
        binaryTree.afterShow();

    }
}

