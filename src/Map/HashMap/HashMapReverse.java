package Map.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
遍历Map
    Map--夫妻树
    1 把所有丈夫集中起来
    2 遍历丈夫的集合 获取每一个丈夫
    3 让丈夫找自己的妻子

    获取所有键
    遍历键的集合，获取每一个键值
    根据键找值


 */
public class HashMapReverse {
    public static void main(String[] args) {
        //创建集合对象
        Map<String, String> map = new HashMap<String, String>();

        map.put("杨过", "小龙女");
        map.put("郭靖", "黄蓉");
        map.put("杨康", "穆念慈");
        map.put("陈玄风", "梅超风");
        //根据键找值
        Set<String> set = map.keySet();
        for (String s : set) {
            String Value = map.get(s);
            System.out.println(s+Value);
        }
        //根据键值对对象找键和值
        Set<Map.Entry<String,String>> newSet = map.entrySet();
        for (Map.Entry<String,String> me : newSet){
//            String Key = me.getKey();
//            String Value = me.getValue();
//            System.out.println(Key+"---"+Value);
            System.out.println(me.getKey()+"---"+me.getValue());
        }




    }
}
