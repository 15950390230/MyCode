package 面试宝典.count加加与加加count;
/*
* 链接：https://www.nowcoder.com/questionTerminal/5ce602538d784f51a531bf9760592773?orderByHotValue=1&questionTypes=100000&mutiTagIds=570_639&page=1&onlyReference=false
来源：牛客网

for循环外面count=0,循环里面的count=count++;(count的值都等于count值，
而后面count自加不影响count结果，因此这个式子无意义);
循环count都为0（因count++是先返回count的本身值再自加1的）！
      若是改为count=++count;（先自加，再返回自加后的值），
      结果就是5050*101=510050了！
              改为count++;结果就是5050*101=510050了！*/
public class AddSequence {
    public static void main(String[] args) {
        int count=0;
        int num=0;
        for (int i = 0; i <= 100; i++) {
            num=num+i;
            count=count++;
        }
        System.out.println(num);
        System.out.println(count);
        System.out.println(num*count);
    }
}
