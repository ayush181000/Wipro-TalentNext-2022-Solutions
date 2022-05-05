// 4
public class TwoCharAlphabetical {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch1 = 'b';
		char ch2 = 'a';

		if (Character.compare(ch1, ch2) < 0) {
			System.out.println(ch1 + "," + ch2);
		} else
			System.out.println(ch2 + "," + ch1);
	}
}
