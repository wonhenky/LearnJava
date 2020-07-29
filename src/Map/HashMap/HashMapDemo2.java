package Map.HashMap;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo2 {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("it001", "Steve");
        hashMap.put("it002", "Leslie");
        hashMap.put("it003", "Jack");
        Set<String> set = hashMap.keySet();
        for (String s : set) {
            System.out.println(s+"---"+hashMap.get(s));
        }

    }
}
