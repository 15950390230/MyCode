package 数据结构与算法.树结构.线索二叉树;

public class TestThreadBinaryTree {
    public static void main(String[] args) {
//        创建一棵树
        ThreadBinaryTree binaryTree=new ThreadBinaryTree();
//        创建根节点
        ThreadTreeNode root=new ThreadTreeNode(1);
//    把根节点赋值给树
        binaryTree.setRoot(root);
//        在创建俩个子节点
        ThreadTreeNode node1=new ThreadTreeNode(2);
        ThreadTreeNode node2=new ThreadTreeNode(3);
//把新创建的节点作为跟节点的子节点
        root.setLeft(node1);
        root.setRight(node2);
//        创建其他节点
//        为第二层的左边创建两个子节点
        node1.setLeft(new ThreadTreeNode(4));
       ThreadTreeNode fiveNode= new ThreadTreeNode(5);
        node1.setRight(fiveNode);
        node2.setLeft(new ThreadTreeNode(6));
        node2.setRight(new ThreadTreeNode(7));
//        遍历树
//        前序遍历
        binaryTree.frontShow();
        System.out.println("=============");

//        中序遍历
        binaryTree.midShow();
        System.out.println("=============");

        //    后续遍历
//    binaryTree.afterShow();
////    前序查找
//       binaryTree.frontSearch(5);
////删除一个子树
//        binaryTree.delete(5);
//        binaryTree.afterShow();
// 中序线索化二叉树
    binaryTree.threadNodes();
//    查找5节点
//    获取5节点的后继节点
//        ThreadTreeNode fiveRightNode=fiveNode.right;
//        System.out.println(fiveRightNode.value);
//        遍历
        binaryTree.threadIterate();
 }
}

