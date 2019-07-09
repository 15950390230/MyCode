package 数据结构与算法.树结构.平衡二叉树.双旋转;

public class SequenceTree {
    Node root;

    public void add(Node node){
        if (root==null){
            root=node;
        }else{
            root.add(node);
        }
    }
    public void frontShow(){
        if(root!=null){
            root.frontShow(root);
        }
    }
    public Node search(int value){
        if (root==null){
            return null;
        }
        else{
           return root.search(value);
        }
    }
//    删除节点
    public void delete(int value){
        if (root==null)
        {
            return;
        }
        else{
//            找到这个节点
            Node target=search(value);
            if (target==null){
                return;
            }
//            找到父节点
            Node parent= searchFather(value);
//            要删除的节点是叶子节点
            if (target.right==null&&target.left==null){
//                    判断要删除的节点是左叶子还是右叶子
                if (parent.left.value==value){
                    parent.left=null;
                }else{
                    parent.right=null;

                }
            }
//            要删除的节点有两个子节点
            else if (target.right!=null&&target.left!=null){
//删除右子树中值最小的节点，获取到该节点的值
                int min=deleteMin(target.right);
//替换目标节点中的值
                target.value=min;
            }
//            只有一个子节点
            else{
//               有左子节点
                if (target.left!=null){
                    //  判断要删除的节点是左叶子还是右叶子
                    if (parent.left.value==value){
                        parent.left=target.left;
                    }else{
                        parent.right=target.left;

                    }
                }
//                有右子节点
                else{
                    if (target.left!=null){
                        //  判断要删除的节点是左叶子还是右叶子
                        if (parent.left.value==value){
                            parent.left=target.right;
                        }else{
                            parent.right=target.right;

                        }
                    }
                }

            }
        }
    }
//删除一颗树中最小的节点并获取到其值
    private int deleteMin(Node node) {
        Node target=node;
//        循环找最左子节点
        while (target.left!=null){
            target=target.left;
        }
//        最左子节点即右面最小节点
//        删除最小节点
            delete(target.value);
        return target.value;
    }

    //    找到父节点
    public Node searchFather(int value){
        if (root==null){
            return null;
        }
        else{
            return root.searchFather(value);
        }
    }
}
