// 8

public class RemoveStar {

	public static void main(String[] args) {

		String str = "ab*cd";
		int n = str.length();
		StringBuilder ans = new StringBuilder();

		int i = 0;
		int pos = -1;
		while (i < n) {
			if (str.charAt(i) == '*') {
				pos = i;
				break;
			}
			i++;
		}

		if (pos == -1) {
			System.out.println(str);
			return;
		}

		if (pos != 0)
			pos = pos - 1;

		for (int j = 0; j < n; j++) {
			if (j == pos) {
				j = j + 2;
				continue;
			}
			ans = ans.append(str.charAt(j));
		}

		System.out.println(ans.toString());

	}
}
