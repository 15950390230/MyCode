package 校招真题2018.最后一位;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//牛牛选择了一个正整数X,然后把它写在黑板上。然后每一天他会擦掉当前数字的最后一位,
//        直到他擦掉所有数位。 在整个过程中,牛牛会把所有在黑板上出现过的数字记录下来,然后求出他们的总和sum.
//        例如X = 509, 在黑板上出现过的数字依次是509, 50, 5, 他们的和就是564.
//        牛牛现在给出一个sum,牛牛想让你求出一个正整数X经过上述过程的结果是sum.
public class Solution {
    public static void main(String[] args)throws IOException{
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        System.out.println(sumOf(br.readLine()));
    }

    public static long sumOf(String str){
        long n = Long.parseLong(str);
        StringBuilder tem = new StringBuilder();
        for (int i=0; i<str.length(); ++i){
            tem.append(1);
        }
        StringBuilder res = new StringBuilder();
        while (tem.length()!=0){
            long temp = n/Long.parseLong(tem.toString());
            if(temp>9)
                return -1;
            res.append(temp);
            n %= Long.parseLong(tem.toString());
            tem.deleteCharAt(tem.length()-1);
        }
        return Long.parseLong(res.toString());
    }
}
//解析：
//        首先要确定x的位数，它一定是三位或两位（如果是四位，结果肯定是四位）。
//        在此我们就假定它是三位数abc(就算最终结果是两位数，那么求出来a=0就可以了)。
//        经过一系列擦操作之后：abc + ab + a = 564，
//        即：(a * 100 + b * 10 + c) + (a * 10 + b) + (a) =564;
//        即 ：111 * a + 11 * b + 1 * c = 564
//        我们想要求a、b、c，很简单，a = 564 // 111 = 5（"//"表示取整操作）
//        此时564 - 111 * 5 = 9。接下来要求b：b = 9//11 = 0
//        此时 9 - 0 * 11 = 9。接下来要求c:c = 9//1 = 9
//        最终结果5->0->9