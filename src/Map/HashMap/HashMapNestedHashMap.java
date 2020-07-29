package Map.HashMap;

import java.util.HashMap;
import java.util.Set;

/*
 * HashMap嵌套HashMap
 *
 * Phone
 * 		Nokia
 * 				Lumia920		4699
 * 				Lumia800		4999
 * 		Apple
 * 				iPhone4		    4999
 * 				iPhone5         6999
 *
 * 先存储元素，然后遍历元素
 */
public class HashMapNestedHashMap {
    public static void main(String[] args) {
        //创建大集合对象
        HashMap<String, HashMap<String, Integer>> PhoneHM = new HashMap<>();
        //创建Nokia集合对象
        HashMap<String, Integer> NokiaHM = new HashMap<>();
        //添加元素
        NokiaHM.put("Lumia920",4699);
        NokiaHM.put("Lumia800",4999);
        //把Nokia添加到大集合对象
        PhoneHM.put("Nokia", NokiaHM);
        //创建Apple集合对象
        HashMap<String, Integer> AppleHM = new HashMap<>();
        //添加元素
        AppleHM.put("iPhone4", 4999);
        AppleHM.put("iPhone5", 6999);
        //把Apple添加到大集合对象
        PhoneHM.put("Apple", AppleHM);
        //返回Set视图
        Set<String> PhoneSet = PhoneHM.keySet();
        //遍历集合
        for (String PhoneKey : PhoneSet) {
            System.out.println(PhoneKey);
            HashMap<String, Integer> PhoneValue = PhoneHM.get(PhoneKey);
            Set<String> BrandSet = PhoneValue.keySet();
            for (String BrandKey : BrandSet) {
                Integer price = PhoneValue.get(BrandKey);
                System.out.println("\t"+BrandKey+"---"+price);
            }
        }
    }
}
