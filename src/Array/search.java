package Array;
import java.util.Arrays;
public class search {
	public static void main(String[] args) {
		int[] array = {12,42,33,21,65,51,73,74};
		Arrays.sort(array);
		show(array);
		System.out.println(BinarySearch(array,42));
		
	}

	public static int BinarySearch(int[] arr, int value) {
		int min = 0;
		int max = arr.length-1;
		int mid = (min+max)/2;
		while(arr[mid]!=value) {
			if(arr[mid] < value) {
				min = mid+1;
			}
			else if(arr[mid] > value) {
				max = mid-1;
			}
			if(min > max) {
				return -1;
			}
			mid = (min+max)/2;
		}
		return mid;
		
	}
	public static void show(int[] arr) {
		System.out.print("[");
		for(int i = 0; i < arr.length; i++) {
			if(i == arr.length-1) {
				System.out.print(arr[i]);
			}else {
				System.out.print(arr[i]+",");
			}
			
		}
		System.out.println("]");
	}
	
}
