// 14

import java.util.Scanner;

public class LargestElMat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int[][] mat = new int[3][3];

		int max = Integer.MIN_VALUE;

		// input
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				mat[i][j] = sc.nextInt();
				max = Math.max(max, mat[i][j]);
			}
		}

		System.out.println("Max element is " + max);
	}

}
