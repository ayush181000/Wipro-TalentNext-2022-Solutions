// 7
public class CharCaseReverse {
	public static void main(String[] args) {
		char ch = 'b';
		int ascii = (int) ch;

		if (ascii >= 65 && ascii <= 90) {
			ascii += 32;
			ch = (char) ascii;
			System.out.println(ch);
		} else {
			ascii -= 32;
			ch = (char) ascii;
			System.out.println(ch);
		}
	}
}
