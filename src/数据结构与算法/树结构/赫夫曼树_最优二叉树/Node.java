package 数据结构与算法.树结构.赫夫曼树_最优二叉树;

public class Node implements Comparable<Node>{
    Node right;
    int value;
    Node left;
    public Node(int value) {
        this.value = value;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    @Override
    public int compareTo(Node o) {
        return -(this.value-o.value);
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }
}
