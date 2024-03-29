package 笔试题库.栈的压入顺序判断;

import java.util.Stack;
/*
* 【思路】借用一个辅助的栈，遍历压栈顺序，先讲第一个放入栈中，这里是1，然后判断栈顶元素是不是出栈顺序的第一个元素，这里是4，很显然1≠4，所以我们继续压栈，直到相等以后开始出栈，出栈一个元素，则将出栈顺序向后移动一位，直到不相等，这样循环等压栈顺序遍历完成，如果辅助栈还不为空，说明弹出序列不是该栈的弹出顺序。
举例：
入栈1,2,3,4,5
出栈4,5,3,2,1
首先1入辅助栈，此时栈顶1≠4，继续入栈2
此时栈顶2≠4，继续入栈3
此时栈顶3≠4，继续入栈4
此时栈顶4＝4，出栈4，弹出序列向后一位，此时为5，,辅助栈里面是1,2,3
此时栈顶3≠5，继续入栈5
此时栈顶5=5，出栈5,弹出序列向后一位，此时为3，,辅助栈里面是1,2,3
….
依次执行，最后辅助栈为空。如果不为空说明弹出序列不是该栈的弹出顺序。 */
public class Solution {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if (pushA == null || popA == null || pushA.length == 0 || popA.length == 0 || pushA.length != popA.length)
            return false;
        Stack<Integer> st = new Stack<Integer>();
        int i = 0;//入栈记录指针
        int j = 0;//出栈记录指针
        st.push(pushA[i++]);
        while(j <= popA.length-1){//遍历所有出栈元素
            while(popA[j] != st.peek()){//判断中间栈元素是否和栈顶元素相等   每pop一次判断一次
                if(i == pushA.length)
                    return false;
                st.push(pushA[i++]);//不断查找栈顶元素
            }
            j++;
            st.pop();//找到之后元素往后移并删除栈顶元素
        }
        return true;
    }
}
