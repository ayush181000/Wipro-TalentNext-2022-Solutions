// 11

public class OnlyOneFour {

	public static void main(String[] args) {

		int[] arr = { 1, 4, 1, 3, 1, 4, 1 };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 4 || arr[i] == 1) {
				continue;
			} else {
				System.out.println("False");
				return;
			}
		}

		System.out.println("True");
	}
}
