// 2

public class StringConcat {

	public static void main(String[] args) {
		String s1 = "Mark";
		String s2 = "Kate";

		char[] ch1 = s1.toLowerCase().toCharArray();
		char[] ch2 = s2.toLowerCase().toCharArray();

		int j = 0;
		if (ch1[ch1.length - 1] == ch2[0]) {
			j = 1;
		}

		StringBuilder ans = new StringBuilder();

		for (int i = 0; i < ch1.length; i++) {
			ans.append(ch1[i]);
		}

		while (j < ch2.length) {
			ans.append(ch2[j++]);
		}

		System.out.println(ans);
	}

}
