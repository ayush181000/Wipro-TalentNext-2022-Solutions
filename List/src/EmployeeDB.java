// 2 b

import java.util.ArrayList;

public class EmployeeDB {

	ArrayList<Employee> list;

	public EmployeeDB() {
		this.list = new ArrayList<Employee>();
	}

	boolean addEmployee(Employee e) {
		list.add(e);
		return true;
	}

	boolean deleteEmployee(int id) {

		for (int i = 0; i < list.size(); i++) {
			Employee e = list.get(i);

			if (e.getId() == id) {
				list.remove(e);
				return true;
			}
		}

		return false;

	}

	public String showPayslip(int empId) {
		for (int i = 0; i < list.size(); i++) {
			Employee e = list.get(i);

			if (e.getId() == empId) {

				return new String("Salary" + e.getSalary());
			}
		}

		return "Not found";
	}

	public void showList() {
		for (int i = 0; i < list.size(); i++) {
			Employee e = list.get(i);
			e.getEmployeeDetails();
		}
	}

}
