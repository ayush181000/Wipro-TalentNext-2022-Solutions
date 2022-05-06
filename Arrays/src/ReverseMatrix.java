// 13

import java.util.Scanner;

public class ReverseMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] mat = new int[2][2];

		// input
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		// Reverse print
		System.out.println("The reverse of array is:");
		for (int i = 1; i >= 0; i--) {
			for (int j = 1; j >= 0; j--) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();

		}

	}

}
