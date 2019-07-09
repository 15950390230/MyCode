package 数据结构与算法.树结构.线索二叉树;

public class ThreadBinaryTree {

    ThreadTreeNode root;
//临时存一下上一个节点（前驱节点）为下面线索化准备
    ThreadTreeNode pre =null;
//遍历线索二叉树方法
    public void threadIterate(){
//        当前遍历节点
        ThreadTreeNode node =root;
        while  (node!=null){
//            循环找到最开始的节点
            while(node.leftType==0){
                node=node.left;
            }
//            打印当前节点的值
            System.out.println(node.value);
//            如果当前节点的右指针指向的是后继节点，可能后继节点还有后继节点
            while (node.rightType==1){
                node=node.right;
                System.out.println(node.value);
            }

//替换遍历的节点
            node=node.right;
        }
    }

    public void setRoot(ThreadTreeNode root) {
        this.root = root;
    }
//中序线索化二叉树
    public void threadNodes(){
        threadNodes(root);
    }
    public void threadNodes(ThreadTreeNode node){
//        当前节点为null直接返回
        if(node==null){
            return;
        }
//处理左子树
        threadNodes(node.left);
//        处理前驱节点
        if (node.left==null){
//            让当前节点的左指针指向前驱节点
            node.left=pre;
//            改变当前节点的左指针的类型
            node.leftType=1;
        }
//        处理前驱的右指针，如果前驱节点的右指针是null（没有右子树）则赋值为当前节点
        if (pre!=null&&pre.right==null){
            pre.right=node;
//            改变前驱节点的类型
            pre.rightType=1;
        }
//        每处理一个存一下当前节点为下一个节点做准备
        pre=node;
// 处理右子树
        threadNodes(node.right);

    }
    public ThreadTreeNode getRoot() {
        return root;
    }
//    展现树
    public  void  frontShow(){
        root.frontShow();
    }
   public void midShow(){
       root.midShow();
   }
    public void afterShow(){
        root.afterShow();
    }
//    前序查找
    public ThreadTreeNode frontSearch(int i){
      return   root.frontSearch(i);
    }
//    删除一个子树
    public void delete(int i){
        if (root.value==i){
            root=null;
        }
        else{
            root.delete(i);
        }
    }
}
