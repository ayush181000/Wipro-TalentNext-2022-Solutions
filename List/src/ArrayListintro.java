// 1

import java.util.ArrayList;

public class ArrayListintro {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

		list.add("jan");
		list.add("feb");
		list.add("mar");
		list.add("apr");
		list.add("may");
		list.add("jun");
		list.add("jul");
		list.add("aug");
		list.add("sep");
		list.add("oct");
		list.add("nov");
		list.add("dec");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}
