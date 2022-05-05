// 6
public class GenderPercentage {
	public static void main(String[] args) {
		int age = Integer.valueOf(args[1]);
		if (args[0] == "Female") {
			if (age < 58) {
				System.out.println("8.2%");
			} else
				System.out.println("9.2%");
		} else if (args[0] == "Male") {
			if (age < 58) {
				System.out.println("8.4%");
			} else
				System.out.println("10.5%");
		}
	}
}
