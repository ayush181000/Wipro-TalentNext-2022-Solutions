// 13

import java.util.Scanner;

public class PrimeBetween10And99 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = 10;
		int y = 99;
		for (int i = x; i <= y; i++)
			if (isPrime(i))
				System.out.println(i);

	}

	public static boolean isPrime(int n) {

		if (n <= 1)
			return false;

		else if (n == 2)
			return true;

		else if (n % 2 == 0)
			return false;

		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			if (n % i == 0)
				return false;
		}

		return true;
	}
}
