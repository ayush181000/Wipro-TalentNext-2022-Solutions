// 8

import java.util.ArrayList;

public class SumArrConditional {

	public static void main(String[] args) {

		int[] arr = { 10, 3, 6, 1, 2, 7, 9 };
		ArrayList<Integer> list = new ArrayList<>();

		int totalSum = 0;
		int tempSum = 0;
		boolean count = true;

		for (int i = 0; i < arr.length; i++) {

			totalSum += arr[i];

			if (arr[i] == 6) {
				count = false;
				if (!list.contains(6))
					list.add(6);
			}

			if (count == false) {
				tempSum += arr[i];
			}

			if (arr[i] == 7) {
				if (list.contains(6)) {
					count = true;
					list = new ArrayList<>();
				}
			}

		}

		if (list.isEmpty()) {
			totalSum -= tempSum;
		}
		System.out.println(totalSum);
	}

}
