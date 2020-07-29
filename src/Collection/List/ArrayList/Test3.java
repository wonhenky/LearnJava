package Collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

/*
需求：去除集合中自定义对象的重复值（对象成员变量值都相同）
contains 底层依赖equals方法，默认使用父object方法，而父类的equals只判断地址值，
按照我们自己的需求，比较成员变量
 */
public class Test3 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        Student s1 = new Student("Meltemi",20);
        Student s2 = new Student("Meltemi",10);
        Student s3 = new Student("Steve",40);
        Student s4 = new Student("Leslie",50);
        Student s5 = new Student("Meltemi",20);
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        arrayList.add(s4);
        arrayList.add(s5);
        ArrayList arrayList1 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Student s = (Student)it.next();
            //重写父类的equals放法
            if(!arrayList1.contains(s)){
                arrayList1.add(s);
            }
        }
        for (int i = 0; i < arrayList1.size(); i++){
            Student s = (Student)arrayList1.get(i);
            System.out.println(s.getName()+"---"+s.getAge());
        }

    }
}
