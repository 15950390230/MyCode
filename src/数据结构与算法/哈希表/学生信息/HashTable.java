package 数据结构与算法.哈希表.学生信息;

import java.util.Arrays;

public class HashTable {
    private StuInfo[] data=new StuInfo[100];
    public void put(StuInfo stuInfo){
//        调用散列函数获取存取位置
        int index=stuInfo.hashCode();
        data[index]=stuInfo;
    }
    public StuInfo get(StuInfo stuInfo){
        return data[stuInfo.hashCode()] ;
    }

    @Override
    public String toString() {
        return "HashTable{" +
                "data=" + Arrays.toString(data) +
                '}';
    }
}
