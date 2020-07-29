package Collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList array = new ArrayList();
        Student s1 = new Student("Meltemi",20);
        Student s2 = new Student("Leslie",40);
        Student s3 = new Student("Steve",60);
        Student s4 = new Student("Jobs",30);
        Student s5 = new Student("Java",80);
        array.add(s1);
        array.add(s2);
        array.add(s3);
        array.add(s4);
        array.add(s5);
        //没有重写toString
        System.out.println(array);
        Iterator it = array.iterator();
        while (it.hasNext()){
            Student s = (Student)it.next();
            System.out.println(s.getName()+"---"+s.getAge());
        }
        System.out.println("------------------");
        for(int i = 0; i < array.size(); i++){
            Student student = (Student)array.get(i);
            System.out.println(student.getName()+"---"+student.getAge());
        }
    }
}
