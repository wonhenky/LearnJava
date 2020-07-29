package Array;

public class Sort {
	public static void main(String[] args) {
		int[] arr = { 22, 54, 65, 21, 44, 65 };
		//BubbleSort(arr);
		//SelectSort(arr);
		reverse(arr);
	}

	public static void SelectSort(int[] arr) {
		for(int i = 0; i < arr.length-1; i++) {
			for(int x = i + 1; x < arr.length; x++) {
				if(arr[i] > arr[x]) {
					int temp = arr[i];
					arr[i] = arr[x];
					arr[x] = temp;
				}
			}
		}
	}
	
	
	public static void BubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int x = 0; x < arr.length - 1 - i; x++) {
				if (arr[x] > arr[x + 1]) {
					int temp = arr[x];
					arr[x] = arr[x + 1];
					arr[x + 1] = temp;
				}
			}
		}

	}

	public static void reverse(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if(i == arr.length-1)
			{
				System.out.print(arr[i]);
			}else {
				System.out.print(arr[i]+",");
			}
		}
		System.out.print("]");
	}

}
