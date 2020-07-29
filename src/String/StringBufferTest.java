package String;
/*
 * 删除
 * deleteCharAt(int index):
 * delete(int start,int end):
 * 替换
 * replace(int start,int end,String str)
 * 反转功能
 * reverse
 * 截取功能
 * String substring(int start)
 * String substring(int start, int end)
 */
public class StringBufferTest {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("Hello").append("World");
		//sb.deleteCharAt(1);
		//sb.delete(5, 10);
		sb.replace(5, 10, "Meltemi");
		//sb.reverse();
		String newSb = sb.substring(4);
		System.out.println(sb+","+newSb);
		
	}
}
