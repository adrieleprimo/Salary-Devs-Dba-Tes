package application;

import java.util.ArrayList;
import java.util.IllegalFormatException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.DatabaseAdministrator;
import entities.Developer;
import entities.Employees;
import entities.Tester;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		List <Employees> list = new ArrayList<>();
		try {
		System.out.print("Enter number of employees: ");
		Integer N = sc.nextInt();
		for (int i = 1; i<= N; i++) {
			System.out.println();
			System.out.println("Employee data: ");
			System.out.print("Job position: d - (DEV), a - (DataBaseAdm) and t - (Tester) - d/a/t: ");
			char answer = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			if( answer == 'd') {
				System.out.print("Salary: ");
				Double salaryEmployee = sc.nextDouble();
				list.add(new Developer(name, salaryEmployee));
			}
			else if (answer == 'a') {
				System.out.print("Salary: ");
				Double salaryEmployee = sc.nextDouble();
				list.add(new DatabaseAdministrator(name, salaryEmployee));
			}
			else {
				System.out.print("Salary: ");
				Double salaryEmployee = sc.nextDouble();
				list.add(new Tester(name, salaryEmployee));
			}		
		}
		}
		catch (IllegalFormatException e) {
			System.out.println(e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		System.out.println();
		for(Employees e: list) {
			System.out.println(e);
		}
	
		sc.close();

	}
}