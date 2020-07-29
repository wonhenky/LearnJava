package Collection.Generic;

import java.util.ArrayList;
import java.util.Iterator;

/*
集合也模仿着数组这种做法，在创建对象的时候明确元素的数据结构，这样就不会有问题了

泛型：是一种把类型明确的工作推迟搭到创建对象或者调用方法的时候才去明确的特殊类型。参数化类型，把类型当作参数一样传递
格式：<数据类型> 此处的数据类型只能是引用类型
好处：把运行时期的问题提前到了编译期间，避免了强制类型转换，优化了程序设计
 */
public class GenericFirstImpression {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList();

        arrayList.add("Hello");
        arrayList.add("world");
        arrayList.add("java");
        //arrayList.add(new Integer(100));

        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            //只转换了String
            String s = (String)it.next();
            System.out.println(s);
        }
    }
}
