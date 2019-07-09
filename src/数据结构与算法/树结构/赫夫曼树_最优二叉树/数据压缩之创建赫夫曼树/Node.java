package 数据结构与算法.树结构.赫夫曼树_最优二叉树.数据压缩之创建赫夫曼树;

public class Node implements Comparable<Node> {
    Byte data;
    int weight;
    Node left;
    Node right;
    public Node( Byte data,int weight){
        this.weight=weight;
        this.data=data;
    }

    @Override
    public int compareTo(Node o) {
        return o.weight-this.weight;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", weight=" + weight +
                '}';
    }
}
