package 数据结构与算法.树结构.平衡二叉树.单旋转;

public class Node {
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
    }
//    向树中添加节点
    public void add(Node node){
        if (node==null){
            return;
        }
//        判断传入的节点的值比当前子树的根结点的值大还是小
//        添加的节点比当前节点的值更小
        if (node.value<this.value){
//如果左节点不为空
            if(this.left==null){
                this.left=node;
//                如果不为空
            }
            else{
                this.left.add(node);
            }
        }else{
          if(this.right==null){
              this.right=node;
          }else{
              this.right.add(node);
          }
        }
//        查询是否平衡
//        如果左子树的高度大于右子树+2则进行右旋转
        if (LeftHeight()-rightHeight()>=2)
        {
            rightRotate();
        }
        else if(rightHeight()-LeftHeight()>=2){
            leftRotate();
        }
    }
//右旋转
    private void leftRotate() {
        //创建一个新的节点值为当前节点的值
        Node newleft= new Node(value);
//        把新节点的左子树为当前结点的左子树
        newleft.left=left;
//把新节点的左子树设置为当前结点右子树的左子树
        newleft.right=right.left;
//        把当前节点的值变为左子节点的值
        value=right.value;
//        把当前节点的左子树设置为左子树的左子树
        right=right.right;
//        把当前节点的右子树设置为新节点
        left=newleft;
    }

    //进行右旋转
    private void rightRotate() {
//创建一个新的节点值为当前节点的值
        Node newRight= new Node(value);
//        把新节点的右子树为当前结点的右子树
        newRight.right=right;
//把新节点的左子树设置为当前结点右子树的左子树
        newRight.left=left.right;
//        把当前节点的值变为左子节点的值
        value=left.value;
//        把当前节点的左子树设置为左子树的左子树
        left=left.left;
//        把当前节点的右子树设置为新节点
        right=newRight;
    }

    //    返回当前节点的高度
    public int height(){

        return Math.max(left==null?0:left.height(),right==null?0:right.height())+1;
    }
//    获取左子树的高度
    public int LeftHeight(){
        if (left==null )
        { return 0;}
        else
        {
            return left.height();
        }
    }
/**
 * 获取右子树的高度*
 *  *
 */

    public int rightHeight(){
        if (right==null )
        { return 0;}
        else
        {
            return right.height();
        }
    }
//中序遍历
    public void frontShow(Node node) {
        if (node==null){
            return;
        }
        frontShow(node.left);
        System.out.println(node.value);
        frontShow(node.right);
    }

    public Node search(int value) {
       if (this.value==value){
           return this;
       }
       else if(value<this.value){
           if (left==null){
               return null;
           }
           return left.search(value);
       }
       else {
           if (right==null){
               return null;
           }
           return right.search(value);
       }

    }

    public Node searchFather(int value) {
        Node node;
        if (this.left!=null&&this.left.value==value||this.right!=null&&this.right.value==value)
        {
            return this;
        }
        else{
            if (this.value>value&&this.left!=null){
                return this.left.searchFather(value);
            }
            else if (this.value<value&&this.right!=null){
                return this.right.searchFather(value);
            }
            else{
                return null;
            }
        }
    }
}
