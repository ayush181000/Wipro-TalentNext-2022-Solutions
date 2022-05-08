// 2

public class MathOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] nums = new int[5];

			int sum = 0;

			for (int i = 0; i < 5; i++) {

				nums[i] = Integer.parseInt(args[i]);
				sum = sum + nums[i];

			}

			double avg = sum / 5.0;

			System.out.println("Average : " + avg);

		} catch (ArithmeticException e) {

			System.out.println(e);

		} catch (NumberFormatException e) {

			System.out.println(e);

		}

	}

}
