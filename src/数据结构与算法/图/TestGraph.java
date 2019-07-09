package 数据结构与算法.图;

import java.util.Arrays;

public class TestGraph {
    public static void main(String[] args) {
        VerTex v1=new VerTex("A");
        VerTex v2=new VerTex("B");
        VerTex v3=new VerTex("C");
        VerTex v4=new VerTex("D");
        VerTex v5=new VerTex("E");
        Graph g=new Graph(5);
//        增加顶点
        g.addVertex(v1);
        g.addVertex(v2);
        g.addVertex(v3);
        g.addVertex(v4);
        g.addVertex(v5);
//        增加边
        g.addEdge("A","B");
        g.addEdge("A","C");
        g.addEdge("B","C");
        g.addEdge("B","D");
        g.addEdge("B","E");

        for (int [] a:g.addjMat) {
            System.out.println(Arrays.toString(a));
        }
    }
}
