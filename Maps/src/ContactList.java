// 4

import java.util.HashMap;
import java.util.Map;

public class ContactList {
	static HashMap<String, Integer> map = new HashMap<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void saveContact(String name, int contact) {
		map.put(name, contact);
	}

	public static boolean containsKey(String key) {
		return map.containsKey(key);
	}

	public static boolean containsValue(int value) {
		for (String key : map.keySet()) {
			if (map.get(key) == value) {
				return true;
			}
		}
		return false;
	}

	public static void iteration() {
		for (Map.Entry<String, Integer> entry : map.entrySet())
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
	}

}
