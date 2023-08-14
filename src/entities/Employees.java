package entities;

import model.entities.JobPosition;

public class Employees {
	
	private String name;
	
	private JobPosition job;
	
	private double salary;

	public Employees(String name, JobPosition job, double salary) {
		this.name = name;
		this.job = job;	
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	@Override
	public String toString() {
		return getName() + ", salary: " +  String.format("%.2f", job.total(getSalary())) + "\n" ;
	}	
}