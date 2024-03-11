package format;

import java.time.LocalDate;

public class Employee {

	private String fullname;
	private double salary;
	private int age;
	private LocalDate startDate;

	public Employee(String fullname, double salary, int age, LocalDate startDate) {
		super();
		this.fullname = fullname;
		this.salary = salary;
		this.age = age;
		this.startDate = startDate;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	@Override
	public String toString() {
		return "Employee [fullname=" + fullname + ", salary=" + salary + ", age=" + age + ", startDate=" + startDate
				+ "]";
	}

}
