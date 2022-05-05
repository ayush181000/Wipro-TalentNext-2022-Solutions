// 14

import java.util.Scanner;

public class SumDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		int sum = 0;

		while (sum <= 9) {
			sum += x % 10;
			x /= 10;
		}
		System.out.println(sum);
	}

}
