// 6

import java.util.Arrays;

public class ArraysSorting {
	public static void main(String[] args) {
		int[] arr = { 97, 2, 5, 7, 89, 43, 12, 67, 9, 56, 23, 6, 234, 7, 678 };

		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}
