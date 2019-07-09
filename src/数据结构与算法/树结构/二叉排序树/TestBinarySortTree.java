package 数据结构与算法.树结构.二叉排序树;

public class TestBinarySortTree {
    public static void main(String[] args) {
        int[] arr=new int[]{7,3,10,12,5,1,9};
        SequenceTree bst=new SequenceTree();
//        循环添加
        for (int i:arr ) {
            bst.add(new Node(i));
        }
////      查看树的
//        bst.frontShow();
//        System.out.println("----------------");
////        查找树
//        Node node=  bst.search(10);
//        System.out.println(node.value);
//        Node node2 =  bst.search(13);
//        System.out.println(node2);
//        查找父节点
//       Node res= bst.searchFather(9);
//        System.out.println(res.value);
        //        删除叶子节点

//        bst.delete(12);
////        bst.frontShow();
////                System.out.println("----------------");
////
//////        删除只有一个叶子的节点
////        bst.delete(10);
////        bst.frontShow();
        bst.frontShow();
        System.out.println("----------------");
        bst.delete(7);
        bst.frontShow();
    }
}
