// 5

import java.util.Arrays;

public class Max2Min2Arr {
	public static void main(String[] args) {
		int[] arr = { 97, 2, 5, 7, 89, 43, 12, 67, 9, 56, 23, 6, 234, 7, 678 };

		Arrays.sort(arr);

		System.out.println(arr[0] + " " + arr[1] + " " + arr[arr.length - 2] + " " + arr[arr.length - 1]);
	}
}
