package app;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Company;
import model.Individual;
import model.TaxPayer;

public class App {

	public static void main(String[] args) {
		
		List<TaxPayer> list = new ArrayList<>();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number of taxpayers: ");
		int taxpayerNumber = scanner.nextInt();

		for (int i = 1; i <= taxpayerNumber; i++) {
			System.out.println("Taxpayer #" + i + " data:");
			System.out.println("Individual or company (i/c)/");
			char type = scanner.next().charAt(0);
			
			System.out.println("Name: ");
			String name = scanner.next();

			System.out.println("Anual income: ");
			Double income = scanner.nextDouble();


			if (type == 'i') {
				
				System.out.println("Health expenditures:");
				Double healthExp = scanner.nextDouble();
				Individual individual = new Individual(name, income, healthExp);

				list.add(individual);
				
			} else if (type == 'c') {
				System.out.println("Enter the number of Employees: ");
				Integer numberOfEmployees = scanner.nextInt();
				Company company = new Company(name,income, numberOfEmployees);

			} else {
				System.out.println("The option entered is not correct");
				break;
			}
		}
	}

}
