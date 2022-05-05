// 2

public class MaxMinIntArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 7, 23, 7, 4567, 12, 7, 235, 12, 7, 45, 2, 56, 456, 346, 234, 124, 346 };

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {

			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);

		}

		System.out.println("Max is " + max + " and min is " + min);

	}

}
