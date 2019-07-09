package 面试宝典.值与引用参数传递;

public class Inc {
//    链接：https://www.nowcoder.com/questionTerminal/b507628f3f0b4c85a00a7ed0de830413?orderByHotValue=1&questionTypes=100000&mutiTagIds=570_639&page=1&onlyReference=false
//    来源：牛客网

    public static void main(String[] args) {
        Inc inc = new Inc();
        int i = 0;
        inc.fermin(i);
        i= i ++;
        System.out.println(i);
    }
    void fermin(int i){
        i++;
    }
    /*java方法之间的参数传递是 值传递 而不是 引用传递 这句话是错的
基本类型和String是传值
对象则是传引用*/
}
