package Collection.Set;

import java.util.TreeSet;

/**
 * TreeSet能够对元素进行某种规则的排序
 * 唯一性：是根据比较的返回值是否为0来决定的
 *  排序和唯一
 * 1 自然排序(无参构造)元素具备比较性
 *      让元素所属类实现自然排序接口Comparable
 *      需要告知条件。。CompareTo
 * 2 *比较器排序*（集合具备比较型）
 *      让集合的构造方法接受一个比较器接口的子类对象Comparator
 *      使用一次可以使用匿名内部类
 *      多次的话需要外部类作为对象实现接口的实现类
 *
 *
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        //自然顺序排序
        TreeSet<Integer> ts = new TreeSet<Integer>();
        TreeSet<People> ps = new TreeSet<People>();
        People p3 = new People("Meltemi",20);
        People p1 = new People("Leslie",30);
        People p2 = new People("Steve",25);
        ps.add(p1);
        ps.add(p2);
        ps.add(p3);
        //集装箱
        ts.add(20);
        ts.add(18);
        ts.add(22);
        ts.add(23);
        ts.add(40);
        ts.add(50);
        for (Integer i : ts){
            System.out.println(i);
        }
        for (People p : ps){
            System.out.println(p);
        }
    }
}
