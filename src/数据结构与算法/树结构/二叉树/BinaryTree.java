package 数据结构与算法.树结构.二叉树;

public class BinaryTree {
TreeNode root;

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public TreeNode getRoot() {
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
    public TreeNode frontSearch(int i){
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
