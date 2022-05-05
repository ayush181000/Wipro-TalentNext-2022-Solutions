// 10

public class ArrayPrintConditional {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 5, 4, 2 };
		int low = 0;
		int high = arr.length - 1;
		int[] ans = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				ans[low++] = arr[i];
			} else
				ans[high--] = arr[i];
		}

		// print array
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}
}
