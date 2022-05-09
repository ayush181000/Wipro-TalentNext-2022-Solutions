// 5

import java.util.ArrayList;
import java.util.TreeMap;

public class Question5 {

	static TreeMap<String, String> H1 = new TreeMap<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		saveCountryCapital("India", "Delhi");
		saveCountryCapital("1", "2");
		saveCountryCapital("3", "4");

		getCapital("India");
		getCapital("3");

		getCountry("2");

		System.out.println(reverseMap());
		System.out.println(toArrayList());
	}

	public static void saveCountryCapital(String country, String capital) {
		H1.put(country, capital);
	}

	public static void getCapital(String country) {
		System.out.println(H1.get(country));
	}

	public static void getCountry(String capital) {
		for (String key : H1.keySet()) {
			if (H1.get(key) == capital) {
				System.out.println(key);
				return;
			}
		}
	}

	public static TreeMap<String, String> reverseMap() {
		TreeMap<String, String> H2 = new TreeMap<>();
		for (String key : H1.keySet()) {
			H2.put(H1.get(key), key);
		}

		return H2;

	}

	public static ArrayList<String> toArrayList() {
		ArrayList<String> list = new ArrayList<>();
		for (String country : H1.keySet()) {
			list.add(country);
		}
		return list;

	}

}
