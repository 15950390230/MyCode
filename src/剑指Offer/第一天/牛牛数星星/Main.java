package 剑指Offer.第一天.牛牛数星星;

/**
 * 链接：https://www.nowcoder.com/questionTerminal/1bf5b56583f747e98741e37652e5a63e?toCommentId=1451625
 * 来源：牛客网
 *
 * 一闪一闪亮晶晶，满天都是小星星，牛牛晚上闲来无聊，便躺在床上数星星。
 * 牛牛把星星图看成一个平面，左上角为原点(坐标为(1, 1))。现在有n颗星星，
 * 他给每颗星星都标上坐标(xi，yi)，表示这颗星星在第x行，第y列。
 * 现在，牛牛想问你m个问题，给你两个点的坐标(a1, b1)(a2，b2)，
 * 表示一个矩形的左上角的点坐标和右下角的点坐标，
 * 请问在这个矩形内有多少颗星星（边界上的点也算是矩形内）。
 * */
import java.util.*;
public class Main{
    public static void main(String[] str){
        Scanner sc=new Scanner(System.in);
        int star[][]=new int[1001][1001];
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            for(int j=y;j<=1000;j++){//表示的是 star[x][y]这个点到这个star[x][0]中包含星星的格式
                           star[x][j]++;
            }
        }
        int m=sc.nextInt();
        for(int i=0;i<m;i++){
            int x1=sc.nextInt();
            int y1=sc.nextInt();
            int x2=sc.nextInt();
            int y2=sc.nextInt();
            int sum=0;
            for(int x=x1;x<=x2;x++){
                sum+=star[x][y2]-star[x][y1-1];//起始点为 1.1 不会出现越界

                    }
                    System.out.println(sum);
        }
    }
}