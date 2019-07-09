package 笔试题库.替换空格;

public class Solution {
    public String replaceSpace(StringBuffer str) {

        int spaceNum=0;//计算空格数；
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==' '){
                spaceNum++;
            }
        }
        int indexOld=str.length()-1;//替换前str下标
        int newLength=str.length()+spaceNum*2;//计算把空格都替换为%20后的str长度
        int indexNew=newLength-1;//替换后str下标
        str.setLength(newLength);//防止下标越界，将str长度变更为替换后的长度
        for(;indexOld>=0&&indexOld<newLength;--indexOld){
            if(str.charAt(indexOld)==' '){
                str.setCharAt(indexNew--,'0');
                str.setCharAt(indexNew--,'2');
                str.setCharAt(indexNew--,'%');
            }else{
                str.setCharAt(indexNew--,str.charAt(indexOld));
            }
        }
        return str.toString();


    }
}
