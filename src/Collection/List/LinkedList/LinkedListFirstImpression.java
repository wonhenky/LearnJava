package Collection.List.LinkedList;

import java.util.LinkedList;

/*
LinkedList 特有功能
    1 添加功能
        public void addFirst()
        public void addLast()
    2 获取功能
        public Object getFirst()
        public Object getLast()
    3 删除功能
        public Object removeFirst() 返回删除掉的元素
        public Object removeLast()

 */
public class LinkedListFirstImpression {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("I");
        linkedList.add("Love");
        linkedList.add("JavaEE");
        linkedList.add("!");
        //重写了toString方法
        System.out.println(linkedList.getFirst());



    }
}
