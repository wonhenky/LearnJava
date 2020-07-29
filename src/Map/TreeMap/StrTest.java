package Map.TreeMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 * Q:获取字符串"abccdsccsfdce"获取字符串每一个字符出现的次数
 * A:1 定义一个字符串
 *   2 定义一个TreeMap集合
 *      键:Character
 *      值:Integer
 *   3 把字符串转化为字符数组
 *   4 遍历字符数组，得到每一个字符
 *   5 拿这个字符到Map集合中去找，看返回值
 *       如果是Null的话，把字符当作键，把次数当作value
 *       不是null的话，value++
 *   6 定义一个字符缓冲区
 *   7 遍历TreeMap集合，获取每一个键值对元素拼接
 *   8 把字符串缓冲区转换为字符串输出
 *
 */
public class StrTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串:");
        String str = sc.nextLine();
        TreeMap<Character, Integer> treeMap = new TreeMap<>();
        char[] chars = str.toCharArray();
        for (char ch : chars) {
            Integer i = treeMap.get(ch);
            //如果是null，说明该键不存在，就把该字符当作键，1为值储存
            if (i == null){
                treeMap.put(ch,1);
            }else {
                i++;
                treeMap.put(ch,i);
            }
        }
        //定哟字符串缓冲区
        StringBuilder stringBuilder = new StringBuilder();
        Set<Character> set = treeMap.keySet();
        for (Character key : set){
            Integer value = treeMap.get(key);
            stringBuilder.append(key).append("（").append(value).append(") ");
        }
        String result = stringBuilder.toString();
        System.out.println(result);



    }
}
