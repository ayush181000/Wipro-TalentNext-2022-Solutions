// 9

public class RemoveTens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 10, 10, 10, 3 };
//		int[] arr = { 2, 10, 10 };

		// remove tens
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 10) {
				for (int j = i; j < arr.length - 1; j++) {
					arr[j] = arr[j + 1];
				}
				arr[arr.length - 1] = 0;
				i--;
			}
		}

		// print array
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
