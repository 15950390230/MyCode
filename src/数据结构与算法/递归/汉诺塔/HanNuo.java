package 数据结构与算法.递归.汉诺塔;

public class HanNuo {
    public static void main(String[] args) {
hannuo(5,'A','B','C');
    }
/*
* n 共有几个盘子
* from 开始的柱子
* in 中间的柱子
* to 第三个柱子
* */
//把所有的环看成两个移动上面到中间在把最后一个移动到最后再把中间移到最后
    public static void hannuo(int n,char from,char in,char to) {
        if (n==1){
//            把第一个盘子从from移到to
            System.out.println("把第一个盘子从"+from+"移到"+to);
        }
        else{
//            移动上面所有的盘子到中间
            hannuo(n-1,from,to,in);
//            移动下面的盘子到最后
            System.out.println("第"+n+"个盘子从"+from+"到"+to);
//            把上面所有的盘子移动到最后
            hannuo(n-1,in,from,to);
        }
    }
}
