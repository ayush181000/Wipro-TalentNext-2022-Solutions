// 2

import java.util.HashSet;
import java.util.Iterator;

public class Question2 {
	static HashSet<String> H1 = new HashSet<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		saveEmployee("1");
		saveEmployee("2");
		saveEmployee("3");
		saveEmployee("4");

		printEmployee();

	}

	public static void saveEmployee(String country) {
		H1.add(country);
	}

	public static void printEmployee() {
		Iterator<String> it = H1.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
