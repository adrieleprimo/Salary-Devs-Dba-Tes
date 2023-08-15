package entities;

import model.entities.JobPosition;

public class Developer implements JobPosition {
	
	public double total(double salary) {
		if (salary > 3000) {
			return salary - (0.1 * salary);
		} else {
			return  salary - (0.2 * salary);
		}
	}
}