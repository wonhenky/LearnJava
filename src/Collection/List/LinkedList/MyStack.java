package Collection.List.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

/*
LinkedList
使用LinkedList模拟栈数据结构的集合，并测试
LinkedList 的特殊功能addFirst
栈的特点先进后出
 */
public class MyStack {
    private LinkedList linkedList;
    public MyStack() {
        linkedList = new LinkedList();
    }
    public void add(Object obj){
        linkedList.addFirst(obj);
    }
    public void show(){
        System.out.println(linkedList.removeFirst());
    }
    public boolean isEmpty(){
        return linkedList.isEmpty();
    }

}
