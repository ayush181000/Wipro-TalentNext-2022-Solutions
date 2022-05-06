// 2

public class Calculator {

	public static int powerInt(int num1, int num2) {
		return (int) Math.pow(num1, num2);
	}

	public static double powerDouble(double num1, double num2) {
		return Math.pow(num1, num2);
	}

	public static void main(String[] args) {

		int a = 5, b = 2;
		double c = 5.0, d = 2.0;

		System.out.println(powerInt(a, b));
		System.out.println(powerDouble(c, d));

	}

}
