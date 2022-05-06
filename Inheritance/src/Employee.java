// 2 b

public class Employee {
    private Person person;
    private double salary;
    private int yearJoin;
    private String insuranceNumber;

    public Employee(Person person, double salary, int yearJoin, String insuranceNumber) {
        this.person = person;
        this.salary = salary;
        this.yearJoin = yearJoin;
        this.insuranceNumber = insuranceNumber;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getYearJoin() {
        return yearJoin;
    }

    public void setYearJoin(int yearJoin) {
        this.yearJoin = yearJoin;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }
}
