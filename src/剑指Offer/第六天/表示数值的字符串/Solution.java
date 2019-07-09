package 剑指Offer.第六天.表示数值的字符串;

public class Solution {
    //    方法1正则表达式
    public boolean isNumberic(char[] str) {
        String s = String.valueOf(str);
        //return s.matches("[+-]?[0-9]*(.[0-9]*)?([eE][+-]?[0-9]+)?");
        return s.matches("[+-]?[0-9]*(\\.[0-9]*)?([eE][+-]?[0-9]+)?");
    }

    //    方法二
    public boolean isNumberic2(char[] str) {
        int sum=0;
        char p = str[0];
        //非正数、非负数、非数字
        if(p!='+'&&p!='-'&&(p>'9'||p<'1')){
            return false;
        }
        for(int i=1;i<str.length;i++){
            int m = str[i];
//            计算小数点位数
            if(m=='.'){
                sum++;
                if(sum>1) return false;
            }
//            数字不在在1到9之间
            else if(m>'9'||m<'0'){
//                判断科学计数法
                if(m=='E'||m=='e'){
//                    是否是最后一位
                    if(i+1>=str.length) return false;
//                    非正非负且不为整数
                    if(str[i+1]!='+'&&str[i+1]!='-'&&(str[i+1]>'9'||str[i+1]<'0')){
                        return false;
                    }
//                    加号后面的数字校验
                    for(int j=i+2;j<str.length;j++){
                        int n = str[j];
                        if(n>'9'||n<'0'){
                            return false;
                        }
                    }
                    return true;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
