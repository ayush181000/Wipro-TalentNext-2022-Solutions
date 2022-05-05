// 7

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 97, 2, 5, 7, 89, 43, 12, 67, 9, 56, 23, 6, 234, 7, 678 };
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			if (!list.contains(arr[i])) {
				System.out.print(arr[i] + "  ");
				list.add(arr[i]);
			}
		}

	}

}
