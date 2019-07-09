package 数据结构与算法.树结构.二叉树;

//import sun.security.mscapi.KeyStore;

public class TreeNode {
    TreeNode right;
    int value;
    TreeNode left;

    public TreeNode(int value) {
        this.value = value;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }
//    前序遍历
    public  void  frontShow(){
//        先遍历当前节点
        System.out.println(value);
        if (left!=null){
            left.frontShow();
        }
        if (right!=null){
            right.frontShow();
        }
    }
    public  void  midShow(){
//        先遍历当前节点
        if (left!=null){
            left.midShow();
        }
        System.out.println(value);

        if (right!=null){
            right.midShow();
        }
    }
    public  void  afterShow(){
//        先遍历当前节点
        if (left!=null){
            left.afterShow();
        }
        if (right!=null){
            right.afterShow();
        }
        System.out.println(value);
    }
//    前序查找
    public  TreeNode  frontSearch(int i){
        TreeNode target=null;
//        先遍历当前节点
        if (this.value==i){
            return this;
        }
//        当前节点不是要查找的节点
        else{
//            查找左儿子
        if (left!=null){
            target= left.frontSearch(i);
        }
//        如果不为空则说明在左儿子中
        if (target!=null){
            return target;
        }
//        左面没有查找又儿子
        if (right!=null){
            target= right.frontSearch(i);
        }
        }
        return null;

}
public void delete(int i){
//        if (roo)
    TreeNode parent=this;
//    判断左儿子
    if (parent.left!=null&&parent.left.value==i){
        parent.left=null;
        return;
    }
//    判断右儿子
    if (parent.right!=null&&parent.right.value==i){
        parent.right=null;
        return;
    }
    //递归检查并删除左儿子

    parent=left;
    if (parent!=null){
        parent.delete(i);
    }
//递归检查并删除右儿子
    parent=right;
    if (parent!=null){
        parent.delete(i);
    }

}
}
