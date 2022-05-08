// 6

import java.util.Vector;

public class Assignment1Vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> list = new Vector<>();

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
