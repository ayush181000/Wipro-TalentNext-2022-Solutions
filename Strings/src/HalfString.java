// 4

public class HalfString {

	public static void main(String[] args) {
		String str = "abcd";

		if (str.length() % 2 != 0) {
			System.out.println("null");
			return;
		}

		System.out.println(str.substring(0, str.length() / 2));

	}

}
