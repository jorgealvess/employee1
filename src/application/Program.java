package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);  
		
		Employee x = new Employee();

		System.out.print("Employee name: ");
		x.name = sc.nextLine();
		System.out.print("Employee GrossSalary: $");
		x.grossSalary = sc.nextDouble();
		System.out.print("Employee Tax: ");
		x.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + x);
		System.out.println();
		System.out.print("Witch percent to increase salary? ");
		double percentage = sc.nextDouble();
		x.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Update data: " + x);
		
		sc.close();
	}

}