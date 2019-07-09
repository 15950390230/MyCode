package 笔试题库.贪婪算法;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*六一儿童节，老师带了很多好吃的巧克力到幼儿园。
每块巧克力j的重量为w[j]，对于每个小朋友i，
当他分到的巧克力大小达到h[i] (即w[j]>=h[i])，
他才会上去表演节目。
老师的目标是将巧克力分发给孩子们，
使得最多的小孩上台表演。
可以保证每个w[i]> 0
且不能将多块巧克力分给一个孩子或将一块分给多个孩子。*/
public class childday {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(bf.readLine());
        String[] strings1=bf.readLine().split(" ");
        int[] h=new  int[strings1.length];
        for (int i = 0; i <strings1.length ; i++) {
            h[i]=Integer.parseInt(strings1[i]);
        }
        Arrays.sort(h);
        int m=Integer.parseInt(bf.readLine());
        String p[]=bf.readLine().split(" ");
        int w[]=new int[m];
        for(int i=0;i<m;i++){
            w[i]=Integer.parseInt(p[i]);
        }
        Arrays.sort(w);
        int result=0;
        int i=0,j=0;
        while(i<n && j<m){
            if(w[j]>=h[i]){
                result++;
                i++;
            }
            j++;
        }
        System.out.println(result);
    }
}
