package Collection.Generic;

import java.util.ArrayList;
import java.util.Iterator;

/*
API当中有<>都是泛型 一般都在集合当中使用
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("Java");
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            String s = arrayList.get(i);
            System.out.println(s);
        }
    }
}
