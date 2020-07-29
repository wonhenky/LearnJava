package Map.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*
 ArrayList集合嵌套HashMap集合并遍历。
 需求：
 假设ArrayList集合的元素是HashMap。有3个。
 每一个HashMap集合的键和值都是字符串。
 元素我已经完成，请遍历。
 结果：
 周瑜---小乔
 吕布---貂蝉

 郭靖---黄蓉
 杨过---小龙女

 令狐冲---任盈盈
 林平之---岳灵珊
 */
public class ArrayListNestedHashMap {
    public static void main(String[] args) {
        ArrayList<HashMap<String, String>> array = new ArrayList<>();
        HashMap<String, String> hashMap1 = new HashMap<>();
        HashMap<String, String> hashMap2 = new HashMap<>();
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap1.put("周瑜", "小乔");
        hashMap1.put("吕布", "貂蝉");
        hashMap2.put("郭靖", "黄蓉");
        hashMap2.put("杨过", "小龙女");
        hashMap3.put("令狐冲", "任盈盈");
        hashMap3.put("林平之", "岳灵珊");
        array.add(hashMap1);
        array.add(hashMap2);
        array.add(hashMap2);
        for (HashMap<String, String> hashKey : array){
            Set<String> set = hashKey.keySet();
            for (String key : set) {
                String value = hashKey.get(key);
                System.out.println(key+"--"+value);
            }

        }

    }
}
