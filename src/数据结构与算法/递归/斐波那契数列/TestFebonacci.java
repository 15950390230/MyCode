package 数据结构与算法.递归.斐波那契数列;

public class TestFebonacci {
//    斐波那契数列 1 1 2 3 5 8 13 21 34.。。。。。后一个属等于前两个之和
public static void main(String[] args) {
int i=feonacci(3);
    System.out.println(i);
}
public static int feonacci(int i){
    if (i==1||i==2){
        return 1;
    }
    else{
        return feonacci(i-1)+feonacci(i-2);
    }
}
}
