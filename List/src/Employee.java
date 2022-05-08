// 2 a

public class Employee {
	private int empId;
	private String empName;
	private String email;
	private String gender;
	private float salary;

	public Employee() {
		empId = 1;
		empName = "default";
		email = "defaultmail";
		gender = "F";
		salary = (float) 200.09;
	}

	public Employee(int id, String name, String email, String gender, float salary) {
		this.empId = id;
		this.empName = name;
		this.gender = gender;
		this.email = email;
		this.salary = salary;
	}

	public void getEmployeeDetails() {
		System.out.println("Id : " + empId + " , Name : " + empName + " , email : " + email);
	}

	public int getId() {
		// TODO Auto-generated method stub
		return this.empId;
	}

	public float getSalary() {
		return this.salary;
	}

	@Override
	public String toString() {
		return new String("Id : " + empId + " , Name : " + empName + " , email : " + email);
	}

}
