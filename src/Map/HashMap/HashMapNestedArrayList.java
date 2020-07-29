package Map.HashMap;

import Array.ArryList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*
 * HashMap嵌套HashMap
 *
 * Phone
 * 		Nokia
 * 				Lumia920
 * 				Lumia800
 * 		Apple
 * 				iPhone4s
 * 				iPhone5
 *      Samsung
 *              Galaxy S3
 *              Galaxy Note2
 *
 * 先存储元素，然后遍历元素
 */
public class HashMapNestedArrayList {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> PhoneHM = new HashMap<>();
        ArrayList<String> NokiaArray = new ArrayList<>();
        NokiaArray.add("Lumia920");
        NokiaArray.add("Lumia800");
        PhoneHM.put("Nokia", NokiaArray);
        ArrayList<String> AppleArray = new ArrayList<>();
        AppleArray.add("iPhone4s");
        AppleArray.add("iPhone5");
        PhoneHM.put("Apple", AppleArray);
        ArrayList<String> SamsungArray = new ArrayList<>();
        SamsungArray.add("Galaxy S3");
        SamsungArray.add("Galaxy Note2");
        PhoneHM.put("Samsung", SamsungArray);

        Set<String> PhoneSet = PhoneHM.keySet();
        for (String PhoneKey : PhoneSet) {
            System.out.println(PhoneKey);
            ArrayList<String> BrandArray = PhoneHM.get(PhoneKey);
            for (String Brand : BrandArray) {
                System.out.println("\t"+Brand);
            }
        }
    }
}
