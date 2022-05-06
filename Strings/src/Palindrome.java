// 1

public class Palindrome {
	public static void main(String[] args) {
		String str = "abcdedcba";

		char[] charArr = str.toCharArray();

		int low = 0;
		int high = charArr.length - 1;

		while (low < high) {
			if (charArr[low++] != charArr[high--]) {
				System.out.println("Not a palindrome");
				return;
			}
		}
		
		System.out.println("Palindrome");
	}
}
