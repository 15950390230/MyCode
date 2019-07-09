package 数据结构与算法.哈希表.学生信息;

public class TestHashTable {
    public static void main(String[] args) {
        StuInfo stuInfo1 =new StuInfo(16,3);
        StuInfo stuInfo2 =new StuInfo(17,11);
        StuInfo stuInfo3 =new StuInfo(18,23);
        StuInfo stuInfo4 =new StuInfo(19,24);
        StuInfo stuInfo5 =new StuInfo(20,9);

        HashTable hashTable =new HashTable();
        hashTable.put(stuInfo1);
        hashTable.put(stuInfo2);
        hashTable.put(stuInfo3);
        hashTable.put(stuInfo4);
        hashTable.put(stuInfo5);
//        想要获取目标数据
        System.out.println(hashTable);
        StuInfo target=new StuInfo(18);
        StuInfo stuInfo00=hashTable.get(target);
        System.out.println(stuInfo00);
    }
}
