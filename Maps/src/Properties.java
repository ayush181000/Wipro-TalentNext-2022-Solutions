// 3

import java.util.HashMap;
import java.util.Map;

public class Properties {
	static HashMap<String, String> map = new HashMap<>();

	public static void main(String[] args) {

	}

	public static void saveCountryCapital(String country, String capital) {
		map.put(country, capital);
	}

	public static void iteration() {
		for (Map.Entry<String, String> entry : map.entrySet())
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
	}
}
