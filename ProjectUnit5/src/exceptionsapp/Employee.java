package exceptionsapp;

public class Employee {

	int id;
	String name;

	double salary = 0.0;
	double taxWithHolding = 0.0;

	Taxes tax;

	public Employee() {

	}

	public Employee(int id, String name, double salary, double taxWithHolding) {

		this.id = id;
		this.name = name;
		this.salary = salary;
		this.taxWithHolding = taxWithHolding;
		tax = new Taxes();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getTaxWithHolding() {
		return taxWithHolding;
	}

	public void setTaxWithHolding(double taxWithHolding) {
		this.taxWithHolding = taxWithHolding;
	}

	public double calculateSalary() throws ErrorTaxException {

		return this.salary - tax.calculateTaxes(this);

	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", taxWithHolding=" + taxWithHolding
				+ "]";
	}

}
