package Collection.List.Vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/*
Vector 特有的功能
    1 添加功能
        public void addElement(Object obj) -- add()
    2 获取功能
        public Object elementAt(int index) -- get()
        public Enumeration elements() 类似Iterator
               hasMoreElements()      hasNext()
               nextElement()          next()
 */
public class VectorFirstImpression {
    public static void main(String[] args) {
        //创建对象
        Vector v = new Vector();
        //添加
        v.addElement("Hello");
        v.addElement("World");
        v.addElement("Java");
        Iterator it = v.iterator();
        //遍历
        for(int i = 0; i < v.size(); i++){
            String s = (String)v.elementAt(i);
            System.out.println(s);
        }
        Enumeration en = v.elements();
        while(en.hasMoreElements()){
            String s = (String)en.nextElement();
            System.out.println(s);
        }
    }
}
