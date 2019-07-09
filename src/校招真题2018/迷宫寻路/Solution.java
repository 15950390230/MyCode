package 校招真题2018.迷宫寻路;

import java.util.*;
// 使用带有计数的层序遍历，求得最短根叶长度
// 带有附加钥匙限制的情况下，用更高维的数组记录是否访问过
// 该题实际字母字符不会超过j
public class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt();
        char[][] maze = new char[m][n];
        sc.nextLine();
        for(int i = 0; i < m; i++){
            maze[i] = sc.nextLine().toCharArray();
        }
        sc.close();
        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++)
                if(maze[i][j] == '2') {
                    System.out.println(solution(maze,i,j));
                    return;
                }
    }

    private static int solution(char[][] maze, int startX, int startY){
        int res = 0;
        int m = maze.length, n = maze[0].length;
        boolean[][][] isVisted = new boolean[m][n][1024];
        isVisted[startX][startY][0] = true;
        int[][] dir = {{-1,0},{1,0},{0,-1},{0,1}};
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(startX);//行进队
        queue.offer(startY);//列进队
        queue.offer(0);
        while(!queue.isEmpty()){
            int num = queue.size()/3; // 带有计数的层序遍历
            res++; // 层数
            while(num > 0){
                startX = queue.poll(); startY = queue.poll(); int k = queue.poll();
                num--;
                for(int i = 0; i < 4; i++){
                    int x = startX + dir[i][0]; //遍历节点的上下左右
                    int y = startY + dir[i][1];
                    int key = k;
                    if(x<0 || x>=m || y<0 || y>=n || maze[x][y] == '0') continue;
                    else if(maze[x][y] == '3') return res;
                    else if(maze[x][y] <= 'j' && maze[x][y] >= 'a') key = key | 1 << maze[x][y]-'a';
                    else if(maze[x][y] <= 'J' && maze[x][y] >= 'A' && (key & 1 << maze[x][y]-'A') == 0) continue;
                    if(isVisted[x][y][key] == false){ // 注意不能加else 也不能加 == '1'，否则缺少小写字符的情况
                        isVisted[x][y][key] = true;
                        queue.offer(x); queue.offer(y); queue.offer(key);//进队
                    }
                }
            }
        }
        return -1;
    }
}
