package Collection.Set;
/**
 * 为什么存储字符串的时候只存了一个
 *
 */

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("Hello");
        hashSet.add("Java");
        hashSet.add("Hello");
        for (String s : hashSet){
            System.out.println(s);
        }

    }
}
