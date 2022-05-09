// 3

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Question3 {
	static TreeSet<String> H1 = new TreeSet<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		H1.add("1");
		H1.add("2");
		H1.add("3");
		H1.add("4");
		H1.add("5");

		System.out.println(reverse());
		System.out.println(contains("5"));

	}

	public static TreeSet<String> reverse() {
		NavigableSet<String> treereverse = H1.descendingSet();
		return (TreeSet<String>) treereverse;
	}

	public static void iteration() {
		Iterator<String> it = H1.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

	public static boolean contains(String value) {
		return H1.contains(value);
	}

}
