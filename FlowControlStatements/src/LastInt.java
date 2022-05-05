// 1

import java.util.Scanner;

public class LastInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a == b % 10) {
			System.out.println("True");
		} else
			System.out.println("False");

	}

}
