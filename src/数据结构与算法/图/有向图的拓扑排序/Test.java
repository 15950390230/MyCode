package 数据结构与算法.图.有向图的拓扑排序;
/**
 *
 *拓扑排序方法的实现
 * 该算法借助队列来实现时，感觉与 二叉树的 层序遍历算法很相似啊。说明这里面有广度优先的思想。
 * 第一步：遍历图中所有的顶点，将入度为0的顶点 入队列。
 * 第二步：从队列中出一个顶点，打印顶点，更新该顶点的邻接点的入度(减1)，如果邻接点的入度减1之后变成了0，则将该邻接点入队列。
 * 第三步：一直执行上面 第二步，直到队列为空。
*/
public class Test {
    public static void main(String[] args) {
        String graphFilePath;
        if(args.length == 0)
            graphFilePath = "F:\\xxx";
        else
            graphFilePath = args[0];

        String graphContent = FileUtil.read(graphFilePath, null);//从文件中读取图的数据
        DirectedGraph directedGraph = new DirectedGraph(graphContent);
        try{
            directedGraph.topoSort();
        }catch(Exception e){
            System.out.println("graph has circle");
            e.printStackTrace();
        }
    }
}

