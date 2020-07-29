package Collection.Set;
/**
 * 之所以可以实现元素唯一，是因为在People类中重写了HashCode和equals方法
 */

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<People> hashSet = new HashSet<People>();
        People p1 = new People("Meltmei", 20);
        People p2 = new People("Steve", 30);
        People p3 = new People("Leslie", 30);
        People p4 = new People("Leslie", 30);
        People p5 = new People("Meltemi", 10);
        hashSet.add(p1);
        hashSet.add(p2);
        hashSet.add(p3);
        hashSet.add(p4);
        hashSet.add(p5);
        for (People p : hashSet){
            System.out.println(p.getName()+"---"+p.getAge());
        }
    }

}
