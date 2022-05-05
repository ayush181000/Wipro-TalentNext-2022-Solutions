// 3

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 2, 5, 7, 89, 43, 12, 67, 9, 56, 23, 6, 234, 7, 678 };

		int searchElement = 5;

		for (int i = 0; i < arr.length; i++) {
			if (searchElement == arr[i]) {
				System.out.println("Position is " + (i + 1));
				return;
			}
		}

		System.out.println("Not found");
	}

}
