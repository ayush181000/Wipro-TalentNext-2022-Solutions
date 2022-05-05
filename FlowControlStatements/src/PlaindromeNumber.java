// 17

import java.util.Scanner;

public class PlaindromeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String number = sc.next();

		char[] numChar = number.toCharArray();

		int low = 0;
		int high = numChar.length - 1;

		while (low < high) {
			if (numChar[low++] != numChar[high--]) {
				System.out.println("Not a palindrome");
				return;
			}
		}
		System.out.println("Palindrome");

	}
}
