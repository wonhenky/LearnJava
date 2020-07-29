package Collection.List.LinkedList;

public class MyStackTest {

    public static void main(String[] args) {
//        LinkedList linkedList = new LinkedList();
//        linkedList.addFirst("Meltemi");
//        linkedList.addFirst("Leslie");
//        linkedList.addFirst("Steve");
//        linkedList.addFirst("Java");
//        linkedList.addFirst("Bob");
//        linkedList.addFirst("Jerry");
//        Iterator it = linkedList.iterator();
//        while (it.hasNext()) {
//            String s = (String)it.next();
//            System.out.println(s);
//        }
        MyStack myStack = new MyStack();
        myStack.add("Meltmei");
        myStack.add("Steve");
        myStack.add("Leslie");
        while(!myStack.isEmpty()){
            myStack.show();
        }
    }
}
