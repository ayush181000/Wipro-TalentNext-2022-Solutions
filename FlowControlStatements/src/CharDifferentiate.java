// 5
public class CharDifferentiate {
	public static void main(String[] args) {
		char ch = '#';
		int ascii = (int) ch;

		if (ascii >= 47 && ascii <= 57) {
			System.out.println("Number");
		} else if (ascii >= 65 && ascii <= 122) {
			System.out.println("Alphabet");
		} else
			System.out.println("Symbol");
	}
}
