package JDK5;

import java.util.ArrayList;
import java.util.Iterator;

/*
ArrayL存储字符串并遍历，要求加入泛型，并使用增强for遍历
1 迭代器
2 普通for
3 增强for
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Meltmei");
        arrayList.add("Leslie");
        arrayList.add("Steve");
        arrayList.add("Bob");
        //迭代器
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("-------");
        //普通for
        for (int i = 0; i < arrayList.size(); i++){
            String s1 = arrayList.get(i);
            System.out.println(s1);
        }
        //增强for
        System.out.println("-------");
        for (String s : arrayList){
            System.out.println(s);
        }
    }
}
