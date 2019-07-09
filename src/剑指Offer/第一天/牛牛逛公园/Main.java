package 剑指Offer.第一天.牛牛逛公园;
/**
 * 链接：https://www.nowcoder.com/questionTerminal/64a9bb7cdaa04df9896c7d26192bed63?orderByHotValue=1&page=1&onlyReference=false
 * 来源：牛客网
 *
 * 又是晴朗的一天，牛牛的小伙伴们都跑来找牛牛去公园玩。
 * 但是牛牛想呆在家里看E3展，不想出去逛公园，
 * 可是牛牛又不想鸽掉他的小伙伴们，
 * 于是找来了公园的地图，发现公园是由一个边长为n的正方形构成的，
 * 公园一共有m个入口，但出口只有一个。公园内有一些湖和建筑，
 * 牛牛和他的小伙伴们肯定不能从他们中间穿过，所以只能绕行。
 * 牛牛想知道他需要走的最短距离并输出这个最短距离。
 * 链接：https://www.nowcoder.com/questionTerminal/64a9bb7cdaa04df9896c7d26192bed63?orderByHotValue=1&page=1&onlyReference=false
 * 来源：牛客网
 *
 * 输入描述:
 * 第一行输入一个数字n(1≤n≤1000)表示公园的边长接下来会给你一个n*n的公园地图，
 * 其中 . 表示公园里的道路，@表示公园的入口，*表示公园的出口，#表示公园内的湖和建筑。
 * 牛牛和他的小伙伴们每次只能上下左右移动一格位置。
 * 输入保证公园入口个数m(1≤m≤10000)且所有的入口都能和出口相连。
 * */

///动态规划
 public class Main {
//    public static void main(String[] args)
//    {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        char[][] maps=new char[n][n]; // 构建字符串数组，记录每个位置的符号
//              ArrayList<Point> ins=new ArrayList<>();
//              Point end=null;
//              for(int i=0;i<n;i++){
//                  String temp=sc.next();
//                  for(int j=0;j<n;j++){
//                      maps[i][j]=temp.charAt(j);
//                      if(maps[i][j]=='@')
//                          ins.add(new Point(i,j));//用list记录所有入口的坐标
//                      else if(maps[i][j]=='*')
//                             end=new Point(i,j); //记录出口的坐标
//                   }
//              }
//         int[][] res=new int[n][n];//构建结果集数组，每个点的值为，以(i,j)作为出发点到出口要走的距离
//         boolean[][] flag=new boolean[n][n];
//         find(res,end,maps,flag);//调用find方法，往res数组填数据
//        int result=Integer.MAX_VALUE;//取出之前记录的入口坐标，看看从哪个入口出发，走到出口的距离最近
//            for(int i= 0;i<ins.size();i++){
//                Point point=ins.get(i);
//                if(res[point.x][point.y]<result)
//                    result=res[point.x][point.y];
//            }     System.out.println(result);
//    }
//    public static void find(int[][] res,Point end,char[][] maps, boolean[][] flag){
//        LinkedList<Point> queue=new LinkedList<>(); //bfs思想
//         res[end.x][end.y]=0; //从出口开始，不断向外遍历，记录每个点到出口的距离
//         queue.offer(end);
//         while(!queue.isEmpty()){
//             Point dot=queue.poll();
//             int x=dot.x;
//             int y=dot.y;
//             if(calDistance(res,x+1,y,maps,flag,res[x][y]))queue.offer(new Point(x+1,y));//进行判断，符合条件的点加入queue，下一步可以从该点向别的点走
//              if(calDistance(res,x-1,y,maps,flag,res[x][y]))queue.offer(new Point(x-1,y));
//              if(calDistance(res,x,y+1,maps,flag,res[x][y]))queue.offer(new Point(x,y+1));
//              if(calDistance(res,x,y-1,maps,flag,res[x][y]))queue.offer(new Point(x,y-1));
//         }
//    }
//         private static boolean calDistance(int[][] res, int i, int j, char[][] maps, boolean[][] flag,int val) {
//        if(i<0||i>=res.length||j<0||j>=res.length||flag[i][j]==true||maps[i][j]=='#')
//            return false;     //不超过公园的坐标范围，以及该点没有障碍物，并且没有被走过
//               else{
//                   res[i][j]=val+1; //该点到出口的距离为，前一个点的距离+1
//                flag[i][j]=true;
//                return true;
//               }
//    }
}
