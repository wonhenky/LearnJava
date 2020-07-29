package String;
/*
 *String 和 StringBuffer转换 
 *A--B的转换
 *我们转换到B，是为了B的功能
 */
public class exchange {
	public static void main(String[] args) {
		String s = "Hello";
		//通过构造方法
		StringBuffer sb = new StringBuffer(s);
		//通过append
		sb.append(s);
		
		//StringBuffer == String
		//通过构造方法
		String str = new String(sb);
		//通过toString()方法
		String str2 = sb.toString();
	}
}
