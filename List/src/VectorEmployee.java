// 7

import java.util.Iterator;
import java.util.Vector;

public class VectorEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Employee> emp = new Vector<>();

		emp.add(new Employee());
		emp.add(new Employee(12, "Ayush", "mail", "M", (float) 200));

		Iterator<Employee> itr = emp.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
