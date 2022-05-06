// 12

public class NewArray {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 5, 4, 6 };

		int[] newArr = { arr1[1], arr2[1] };

		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + " ");
		}

	}
}
