// 2 c

public class TestEmployeeDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeDB db = new EmployeeDB();
		db.addEmployee(new Employee(5, "Ayush", "maikl", "M", (float) 500));
		db.addEmployee(new Employee(6, "Ash", "mkl", "M", (float) 213));

		db.showList();
		db.deleteEmployee(5);
		
		System.out.println("After deletion");
		
		db.showList();
	}

}
