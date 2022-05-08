// 3

import java.util.ArrayList;
import java.util.Iterator;

public class StringArrayList {
	static ArrayList<String> list = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		list.add("abc");
		list.add("abc");
		list.add("abc");
		list.add("abc");
		list.add("abc");

		printAll();

	}

	public static void printAll() {
		Iterator<String> itr = list.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
