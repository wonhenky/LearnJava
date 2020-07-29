package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * 需求：存储自定义对象并遍历Student(name,age)
 *
 * 分析：
 * 		A:创建people类
 * 		B:创建集合对象
 * 		C:创建people对象
 * 		D:把people对象添加到集合对象中
 * 		E:遍历集合
 */
public class Test {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        People p0 = new People("Meltemi",22);
        People p1 = new People("Steve Jobs",50);
        People p2 = new People("Leslie",60);
        People p3 = new People("Java",70);
        c.add(p0);
        c.add(p1);
        c.add(p2);
        c.add(p3);
        Iterator it = c.iterator();
        while(it.hasNext()){
            People p = (People)it.next();
            System.out.println(p.getName()+","+p.getAge());
        }
    }
}
