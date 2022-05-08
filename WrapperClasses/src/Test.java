// 4 b

public class Test {

	public static void main(String[] args) {

		Employee e = new Employee("ABC");
		Employee copy = e;
		System.out.println(e.getName());
		System.out.println(copy.getName());

		copy.setName("XYZ");
		System.out.println(e.getName());
		System.out.println(copy.getName());

	}

}
