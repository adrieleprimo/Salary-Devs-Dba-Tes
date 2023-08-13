package entities;

public class Developer extends Employees {

	public Developer() {
		super();
	}

	public Developer(String name, Double salary) {
		super(name, salary);
	}

	public Double totalDEV() {
		if (salary > 3000) {
			return salary * 0.1 + salary;
		} else {
			return  salary * 0.2 + salary;
		}
	}

	public String toString() {
		return getName() + ", job position:Developer, salary: $ " + String.format("%.2f", totalDEV()) + "\n";
	}
}