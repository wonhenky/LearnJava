package Array;
//B:公司年销售额求和
//某公司按照季度和月份统计的数据如下：单位(万元)
//第一季度：22,66,44
//第二季度：77,33,88
//第三季度：25,45,65
//第四季度：11,66,99
public class TwoDArry{
	public static void main(String[] args) {
		
		sum();
	}
	public static void sum() {
		int[][] arr = {{22,66,44},{77,33,88},{25,45,65},{11,66,99}};
		int sumNumber = 0;
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				sumNumber += arr[i][j];
			}
		}
		System.out.print(sumNumber);
	}
}

