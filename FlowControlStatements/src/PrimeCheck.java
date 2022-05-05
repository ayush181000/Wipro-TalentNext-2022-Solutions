// 12

import java.util.Scanner;

public class PrimeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		if (x < 2) {
			System.out.println("Not a prime");
		}

		for (int i = 2; i <= Math.sqrt(23); i++) {
			if (x % i == 0) {
				System.out.println("Not a prime number");
				return;
			}
		}

		System.out.println("Prime Number");

	}

}
