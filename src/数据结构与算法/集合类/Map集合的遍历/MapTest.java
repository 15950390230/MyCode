package 数据结构与算法.集合类.Map集合的遍历;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("key1",1);
        map.put("key2",2);
        map.put("key3",3);
        map.put("key4",4);
        map.put("key5",5);
//        迭代器遍历效率高
        /*itrator1Map(map);*/
//        迭代器遍历效率低
//        itrator2Map(map);
//        forEachBianli1(map);
        forEachBianli2(map);

    }

    private static void itrator1Map(Map map) {
        Iterator ite=map.entrySet().iterator();
        while(ite.hasNext()){
            Map.Entry entry= (Map.Entry) ite.next();
            String key= (String) entry.getKey();
            Integer value= (Integer) entry.getValue();
            System.out.println("键位"+key+"----值为"+value);
        }
    }
    private static void itrator2Map(Map<String, Integer> map) {
        Iterator iter = map.keySet().iterator();

         while (iter.hasNext()) {
             String key = (String) iter.next();
             Integer value = map.get(key);
          System.out.println("键位"+key+"----值为"+value);
         }
    }
    private static void forEachBianli1(Map<String, Integer> map) {
        for (String key:map.keySet()){
            Integer value=map.get(key);
            System.out.println("键位"+key+"----值为"+value);

        }
    }
    private static void forEachBianli2(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry:map.entrySet()){
            Integer value=entry.getValue();
            String key=entry.getKey();
            System.out.println("键位"+key+"----值为"+value);

        }
    }
}
