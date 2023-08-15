package entities;

import model.entities.JobPosition;

public class DatabaseAdministrator implements JobPosition {

	public double total(double salary) {
		if (salary > 3000) {
			return salary - (0.15 * salary);
		} else {
			return salary - (0.20 * salary);
		}
	}	
}