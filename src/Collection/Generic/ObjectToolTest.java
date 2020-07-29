package Collection.Generic;

public class ObjectToolTest {
    public static void main(String[] args) {
        ObjectTool<String> ot = new ObjectTool<String>();
        ot.setObj(new String("Meltmei"));
        String s = ot.getObj();
        System.out.println(s);

    }
}
