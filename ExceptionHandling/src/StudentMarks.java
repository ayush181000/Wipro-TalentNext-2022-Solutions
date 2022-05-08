// 3 b

import java.util.Scanner;

public class StudentMarks {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String name1 = sc.next();
			int[] marks1 = new int[3];
			int sum1 = 0;
			for (int i = 0; i < 3; i++) {
				marks1[i] = Integer.parseInt(sc.next());
				if (marks1[i] < 0 || marks1[i] > 100) {
					throw new NegativeValueException("Number out of range");
				}
				sum1 += marks1[i];
			}

			String name2 = sc.next();
			int[] marks2 = new int[3];
			int sum2 = 0;
			for (int i = 0; i < 3; i++) {
				marks2[i] = Integer.parseInt(sc.next());
				if (marks2[i] < 0 || marks2[i] > 100) {
					throw new NegativeValueException("Number out of range");
				}
				sum2 += marks2[i];
			}

			System.out.println("Name : " + name1 + " Average : " + (sum1 / 3.0));
			System.out.println("Name : " + name2 + " Average : " + (sum2 / 3.0));

		} catch (NumberFormatException e) {
			System.out.println(e);
		} catch (NegativeValueException e) {
			System.out.println(e);
		}

	}

}
