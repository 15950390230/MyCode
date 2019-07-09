package 数据结构与算法.树结构.平衡二叉树.单旋转;

public class TestBinarySortTree {
    public static void main(String[] args) {
//        int[] arr=new int[]{8,9,6,7,5,4};
        int[] arr=new int[]{2,1,4,3,5,6};
        SequenceTree bst=new SequenceTree();
//        循环添加
        for (int i:arr ) {
            bst.add(new Node(i));
        }
////
        System.out.println(bst.root.height());
        System.out.println(bst.root.value);
    }
}
