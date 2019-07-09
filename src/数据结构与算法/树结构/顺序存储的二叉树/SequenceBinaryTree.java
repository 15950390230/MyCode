package 数据结构与算法.树结构.顺序存储的二叉树;
//将二叉树的数据顺序存储到数组中去；
//顺序存储的二叉树子节点与父节点的关系是父节点的索引为root左节点的索引为left右节点的索引为right则
//left=2*root+1
//right=2*root+2
//root=（left-1）/2
//root=（right-1）/2
//前序遍历
public class SequenceBinaryTree {
    int[] data;
    public SequenceBinaryTree(int[] data){
        this.data=data;
    }
    public void frontShow(){
        frontShow(0);
    }

//    顺序存储的二叉树的遍历
    public  void  frontShow(int start){
        if (data==null||data.length==0){
            return;
        }
        //        先遍历当前节点
        System.out.println(data[start]);
//        遍历左节点
        if (2*start+1<data.length){
            frontShow(2*start+1);
        }
//        遍历右节点
        if (2*start+2<data.length){
            frontShow(2*start+2);
        }
    }
}
