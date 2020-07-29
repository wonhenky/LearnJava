package Map.TreeMap;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap<People, String> treeMap = new TreeMap<>(new Comparator<People>() {
            @Override
            public int compare(People o1, People o2) {
                int num = o2.getAge() - o1.getAge();
                int num2 = num == 0 ? o2.getName().compareTo(o1.getName()) : num;
                return num2;
            }
        });
        //Map.TreeMap.People cannot be cast to java.lang.Comparable

        People p1 = new People("Steve",60);
        People p2 = new People("Slim",45);
        People p3 = new People("Leslie",50);
        People p4 = new People("Leslie",50);
        treeMap.put(p1, "1111");
        treeMap.put(p2, "2222");
        treeMap.put(p3, "3333");
        treeMap.put(p4, "4444");
        Set<People> set = treeMap.keySet();
        for (People key : set) {
            String value = treeMap.get(key);
            System.out.println(key.getName()+"---"+key.getAge()+"---"+value);
        }

    }
}
