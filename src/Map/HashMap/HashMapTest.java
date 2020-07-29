package Map.HashMap;

import java.util.HashMap;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<People, String> hashMap = new HashMap<>();
        People p1 = new People("Steve",60);
        People p2 = new People("Slim",45);
        People p3 = new People("Leslie",50);
        People p4 = new People("Leslie",50);
        hashMap.put(p1, "1111");
        hashMap.put(p2, "2222");
        hashMap.put(p3, "3333");
        hashMap.put(p4, "4444");

        Set<People> set = hashMap.keySet();
        for (People p : set) {
            String Value = hashMap.get(p);
            //重写People类的equals和HashCode方法
            System.out.println(p.getName()+"---"+p.getAge()+"---"+Value);

        }

    }
}
