// 1

import java.util.Scanner;

public class ArrayHandling {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {

		try {
			int x;

			x = sc.nextInt();
			int[] nums = new int[x];

			for (int i = 0; i < x; i++) {
				nums[i] = sc.nextInt();
			}

			int pos = Integer.parseInt(sc.next());

			System.out.println(nums[pos + 1]);

		} catch (NumberFormatException f) {
			
			System.out.println("Number is not in format");
		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Array out of bounds");
		}
	}

}
