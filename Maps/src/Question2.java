// 2

import java.util.HashMap;
import java.util.Map;

public class Question2 {

	static HashMap<String, String> map = new HashMap<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		map.put("1", "2");
		map.put("3", "4");
		map.put("5", "6");
		map.put("7", "8");

		System.out.println(containsKey("1"));
		System.out.println(containsValue("2"));
		iteration();
	}

	public static boolean containsKey(String key) {
		return map.containsKey(key);
	}

	public static boolean containsValue(String value) {
		for (String key : map.keySet()) {
			if (map.get(key) == value) {
				return true;
			}
		}
		return false;
	}

	public static void iteration() {
		for (Map.Entry<String, String> entry : map.entrySet())
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
	}

}
