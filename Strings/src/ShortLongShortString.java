// 6

public class ShortLongShortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "abcd";
		String s2 = "AB"

		;

		String longer;
		String shorter;

		if (s1.length() > s2.length()) {
			longer = s1;
			shorter = s2;
		} else {
			longer = s2;
			shorter = s1;
		}

		System.out.println(shorter + longer + shorter);

	}

}
