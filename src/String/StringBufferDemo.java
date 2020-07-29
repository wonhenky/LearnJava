package String;
		/*StringBuffer构造方法
		 * 指定capacity容量
		 * StringBuffer添加功能
		 * append(String str):追加任意类型数据到字符缓冲区里
		 * insert(int offset, String str):在指定位置把任意的数据插入到字符串缓冲区
		*/
public class StringBufferDemo{
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		//System.out.println(sb.append("Hello"));
		System.out.println(sb.capacity());
		//自己定义容量
		sb.append("Hello");
		sb.append(true);
		sb.insert(5, "World");
		
		System.out.println(sb);
	}


}

