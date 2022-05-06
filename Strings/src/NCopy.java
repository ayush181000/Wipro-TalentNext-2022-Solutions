// 3

public class NCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Wipro";
		int n = str.length();

		StringBuilder ans = new StringBuilder();

		int counter = 0;
		while (counter < n) {

			for (int i = 0; i < 2; i++) {
				ans.append(str.charAt(i));
			}
			counter++;

		}

		System.out.println(ans.toString());

	}

}
