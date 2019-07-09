package 数据结构与算法.图;



/*
数据结构与算法.图
* */
public class Graph {
    private VerTex[] vertex;

    private int currentSize;

    public int[][] addjMat;

    public Graph (int size){

        vertex=new VerTex[size];
        addjMat=new int[size][size];
    }
    public void addVertex(VerTex v){
        vertex[currentSize++]=v;
    }
//    传入图的两个顶点确定二阶矩阵的值
    public void addEdge(String v1,String  v2){
        int index1 = 0;
        for (int i = 0; i <vertex.length ; i++) {
            if (vertex[i].getValue().equals(v1)) {
                index1 = i;
                break;
            }
        }
        int index2=0;

        for (int i = 0; i <vertex.length ; i++) {
            if (vertex[i].getValue().equals(v2)) {
                index2 = i;
                break;
            }
        }
        addjMat[index1][index2]=1;
        addjMat[index2][index1]=1;
    }

}
