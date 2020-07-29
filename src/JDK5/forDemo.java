package JDK5;

import java.util.ArrayList;

/*
增强for:for循环的一种
格式:
    for(元素数据类型 变量：数组或者collection集合){
        使用变量即可，该变量就是元素
    }
    简化了遍历,用来替代迭代器的
    弊端：增强for的目标不能为null

 */
public class forDemo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for(int x: arr){
            System.out.println(x);
        }
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Meltmei");
        arrayList.add("Leslie");
        arrayList.add("Steve");
        arrayList.add("Java");
        for (String s : arrayList){
            System.out.println(s);
        }
    }
}
