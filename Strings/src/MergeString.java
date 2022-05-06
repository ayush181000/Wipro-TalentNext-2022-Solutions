// 9

public class MergeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "Helloooo";
		int n = a.length();

		String b = "World";
		int m = b.length();

		StringBuilder ans = new StringBuilder();

		int i = 0;
		int j = 0;

		// merged strings
		while (i < n && j < m) {
			ans = ans.append(a.charAt(i++));
			ans = ans.append(b.charAt(j++));
		}

		// check if string 1 has left elements
		while (i < n) {
			ans = ans.append(a.charAt(i++));
		}

		// check if string 2 has left elements
		while (j < m) {
			ans = ans.append(b.charAt(j++));
		}
		
		System.out.println(ans.toString());

	}

}
