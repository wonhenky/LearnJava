package Collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

/*
ArrayList 使用
    c

 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList array = new ArrayList();
        array.add("Hello");
        array.add("Java");
        array.add("World");

        Iterator it = array.iterator();
        while(it.hasNext()){
            String s = (String)it.next();
            System.out.println(s);
        }
        for(int i = 0; i <array.size(); i++){
            String s = (String) array.get(i);
            System.out.println(s);
        }
    }
}
