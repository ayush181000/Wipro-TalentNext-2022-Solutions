// 1

import java.util.HashSet;
import java.util.Iterator;

public class Question1 {

	static HashSet<String> H1 = new HashSet<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		saveCountry("India");
		saveCountry("Tokyo");
		saveCountry("Australia");
		saveCountry("China");

		System.out.println(getCountry("India"));
		System.out.println(getCountry("Indi"));

	}

	public static void saveCountry(String country) {
		H1.add(country);
	}

	public static String getCountry(String country) {
		Iterator<String> it = H1.iterator();

		while (it.hasNext()) {
			String next = it.next();
			if (next == country) {
				return next;
			}
		}

		return null;
	}

}
