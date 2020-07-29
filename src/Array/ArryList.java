package Array;

import java.util.Scanner;

public class ArryList<S> {
	public static void main(String[] args) {
		System.out.println("想要输入多少个数字:");
		Scanner sc = new Scanner(System.in);
		int ArryLength = sc.nextInt();
		int[] arr = new int[ArryLength];
		for(int i = 0 ; i < arr.length ; i++) {
			int num = i+1;
			System.out.println("请输入第"+num+"个数字:");
			arr[i] = sc.nextInt();
	}
		traverse(arr);	
		BestValue(arr);
		reverse(arr);
		sc.close();
}
	public static void traverse(int[] arr) {
		System.out.println("数组为:");
		for(int i = 0; i < arr.length; i++) {
			if( i!= arr.length-1)
			{
				System.out.print(arr[i]+",");
			}
			else {
				System.out.println(arr[i]);
			}
		}
	
	}
	public static void BestValue(int[] arr) {
		int Max = arr[0];
		int Min = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(Max < arr[i])
			{
				Max = arr[i];
			}
			if(Min > arr[i])
			{
				Min = arr[i];
			}
			
		}
	System.out.println("最大值是:"+Max+",最小值是:"+Min);
	}
	public static void reverse(int[] arr) {
		for(int i = 0, j = arr.length-1; i < j; i++, j--)
		{
			int temp = 0;
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		traverse(arr);
	}
}


