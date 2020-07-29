package IO.File;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * String (byte[] bytes, String charsetName):通过指定的字符集解码字节数组
 * byte[] getBytes(String charsetName):使用指定的字符集合把字符串编码为字节数组
 */


public class StringDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "你好";

        byte[] bys = s.getBytes();

        System.out.println(Arrays.toString(bys));
        String s1 = new String(bys);
        System.out.println(s1);
    }
}
