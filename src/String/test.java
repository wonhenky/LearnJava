package String;

public class test {
	public static void main(String[] args) {
		//字节数组
		byte[] byt = {'H','e','l','l','o'};
		char[] value = {'H','e','l','l','o'};
		//String构造方法
		String s1 = new String(byt);
		System.out.println("把字节数组转化成字符串:"+s1);
		System.out.println("字节长度"+s1.length()+"\n"+"索引位置的字符"+s1.charAt(3)+"\n"+"对应字符的索引"+s1.indexOf('l')+"\n"+"对应索引之后字符出现的位置"+s1.indexOf("l", 2)+"\n"+"从索引位置截取字符"+s1.substring(3)+"\n"+"指定位置截取索引"+s1.substring(1, 4));
		String s2 = new String(byt,1,4);
		byte[] byt1 = s1.getBytes();
		System.out.println("把字节数组从1位置长度为4转化成字符串:"+s2);
		String s3 = new String("Meltmei");
		System.out.println("把字符串常量转化成字符串:"+s3);
		String s4 = String.valueOf(value);
		System.out.println(s4);
		System.out.println(s4.substring(0,1).toUpperCase()+s4.substring(1).toLowerCase());
		//
	}
}
