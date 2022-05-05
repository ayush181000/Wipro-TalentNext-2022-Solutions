// 1

public class IntegerArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
			sum += arr[i];
		}

		double avg = sum / (arr.length * 1.0);

		System.out.println("The sum is " + sum + " and avergae is " + avg);

	}

}
