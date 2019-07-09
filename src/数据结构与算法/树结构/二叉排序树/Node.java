package 数据结构与算法.树结构.二叉排序树;

public class Node {
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
    }
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
