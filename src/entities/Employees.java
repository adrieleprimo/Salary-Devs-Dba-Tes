package entities;

public class Employees {
	protected String name;
	protected Double salary;

	public Employees() {

	}

	public Employees(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public Double getSalary() {
		return salary;
	}
}