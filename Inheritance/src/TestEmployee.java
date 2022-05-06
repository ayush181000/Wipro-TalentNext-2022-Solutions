// 2 c

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee employee = new Employee(new Person("Wipro"), 20000.0, 2022, "ABCDFER");

		System.out.println(employee.getPerson().getName() + " joined " + employee.getYearJoin() + " salary of "
				+ employee.getSalary());

	}

}
