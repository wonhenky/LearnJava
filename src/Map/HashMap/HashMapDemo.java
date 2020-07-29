package Map.HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        map.put("邓超","孙俪");
        map.put("黄晓明","杨颖");
        map.put("周杰伦","昆凌");
        map.put("刘恺威","杨幂");
        System.out.println(map);
        //V get(Object key):根据键值获取值
        String m1 = map.get("邓超");
        System.out.println(m1);
        System.out.println(map.get("黄晓明"));
        //Set<K> keySet():获取集合中所有键的集合
        Set<String> set = map.keySet();
        for(String r : set){
            System.out.println(r);
        }
        //Collection<V> values():获取集合中所有值的集合
        Collection<String> collection = map.values();
        for (String r : collection){
            System.out.println(r);
        }
    }
}
