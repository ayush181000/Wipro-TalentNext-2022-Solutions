// 10

public class LastNCopy {

	public static void main(String[] args) {
		int n = 3;
		String str = "Wipro";

		// base case
		if (n > str.length()) {
			System.out.println("Invalid input");
			return;
		}

		StringBuilder ans = new StringBuilder();
		int c = 0;

		while (c < n) {
			for (int i = str.length() - n; i < str.length(); i++) {
				ans.append(str.charAt(i));
			}
			c++;
		}
		
		System.out.println(ans.toString());

	}

}
