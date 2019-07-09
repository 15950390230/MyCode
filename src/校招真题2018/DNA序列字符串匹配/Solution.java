package 校招真题2018.DNA序列字符串匹配;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

//牛牛又从生物科研工作者那里获得一个任务,这次牛牛需要帮助科研工作者从DNA序列s中找出最短没有出现在DNA序列s中的DNA片段的长度。
//        例如:s = AGGTCTA
//        序列中包含了所有长度为1的('A','C','G','T')片段,但是长度为2的没有全部包含,例如序列中不包含"AA",所以输出2。
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        int length = 1;
        Set<String> set = new HashSet<>();
        int i=0;
        while ( i+length <=str.length()){
            set.add(str.substring(i,i+length));
            i++;
            if (set.size() == (int)Math.pow(4,length) ){//求4的n次方
                set = new HashSet<>();//判断相等则重新建set
                length++;//然后长度增加
                i=0;
            }
        }

        System.out.println(length);
float f=3.14f;
    }
}
