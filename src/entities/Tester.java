package entities;

public class Tester extends Employees {

	private Double salary;

	public Tester() {
		super();
	}

	public Tester(String name, Double salary) {
		super(name, salary);
	}

	public Double totalTes() {
		if (salary > 3000) {
			return salary * 0.15 + salary;
		} else {
			return salary * 0.2 + salary;
		}
	}

	@Override
	public String toString() {
		return getName() + ", job position: Tester, salary: $ " + String.format("%.2f", totalTes()) + "\n";
	}
}