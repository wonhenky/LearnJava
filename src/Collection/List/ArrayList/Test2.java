package Collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

/*
ArrayList
去除集合中字符串的重复值 不能创建新的集合
 */
public class Test2 {
    public static void main(String[] args) {
        ArrayList array = new ArrayList();
        array.add("meltemi");
        array.add("leslie");
        array.add("leslie");
        array.add("Steve");
        array.add("Steve");


        for (int x = 0; x < array.size() - 1; x++) {
            for (int y = x + 1; y < array.size(); y++) {
                if (array.get(x).equals(array.get(y))) {
                    array.remove(y);
                    //有连续相同元素时需要重新判断
                    y--;
                }
            }
        }
        Iterator it = array.iterator();
        while (it.hasNext()) {
            String s = (String) it.next();
            System.out.println(s);
        }
    }
}
