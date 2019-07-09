package 数据结构与算法.集合类.集合排序;
//按年龄降序排列

import java.util.*;

public class Solution
{
    public static void main(String[] args) {
        HashMap<Integer,user> users=new HashMap<Integer, user>();
        users.put(1,new user("张三",25));
        users.put(2,new user("李四",22));
        users.put(3,new user("王五",28));
        System.out.println(users);
        HashMap<Integer,user> sortHashMap=sortHashMap(users);
        System.out.println(sortHashMap);


    }

    private static HashMap<Integer, user> sortHashMap(HashMap<Integer, user> map) {
        Set<Map.Entry<Integer,user>> entrySet=map.entrySet();
        List<Map.Entry<Integer,user>> list=new ArrayList<>(entrySet);
        Collections.sort(list, new Comparator<Map.Entry<Integer, user>>() {//将外部比较器传入集合参数内自定义排序
            @Override
            public int compare(Map.Entry<Integer, user> o1, Map.Entry<Integer, user> o2) {
                return o2.getValue().getAge()-o1.getValue().getAge();
            }
        });
        //创建一个新的有序的hashmap
        LinkedHashMap<Integer,user> linkedHashMap=new LinkedHashMap<>();
        for (Map.Entry<Integer,user> entry: list) {
            linkedHashMap.put(entry.getKey(),entry.getValue());

        }
        return linkedHashMap;
    }
}
class user {
    String name;
    Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public user(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "user{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
