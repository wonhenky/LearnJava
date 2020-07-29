package Collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

/*
ArrayList
去除集合中字符串的重复值
 */
public class Test {
    public static void main(String[] args) {
        ArrayList array = new ArrayList();
        array.add("meltemi");
        array.add("leslie");
        array.add("leslie");
        array.add("Steve");
        array.add("Steve");
        Iterator it = array.iterator();
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            String s = (String)it.next();
            System.out.println(s);
            if(arrayList.contains(s)){

            }else{
                arrayList.add(s);
            }

        }
        System.out.println("--------------");
        Iterator it2 = arrayList.iterator();
        for(int i = 0; i < arrayList.size(); i++){
            String s = (String)it2.next();
            System.out.println(s);
        }

    }
}
