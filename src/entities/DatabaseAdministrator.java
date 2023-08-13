package entities;

public class DatabaseAdministrator extends Employees{
	
	private Double salary;
	
	public DatabaseAdministrator() {
		
	}

	public DatabaseAdministrator(String name, Double salary) {
		super(name, salary);
	
	}

	public Double totalDBA(){
		if ( salary > 3000) {
			return salary = salary * 0.15 + salary;
		}
		else {
			return salary = salary * 0.20 + salary;
		}
	}

	@Override
	public String toString() {
		return getName() +  ", job position: DatabaseAdministrator, salary: $ " + String.format("%.2f", totalDBA()) +"\n";
	}	
}