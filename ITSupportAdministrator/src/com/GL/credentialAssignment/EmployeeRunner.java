package com.GL.credentialAssignment;

import com.GL.employeeSetup.*;
import java.util.Scanner;

public class EmployeeRunner {

	

	public static void main(String[] args) {

		String firstName = null;
		String lastName = null;
		try (Scanner input = new Scanner(System.in)) {
			char continueIteration;
			int choice;

			do {
				System.out.println("Enter your first name");
				firstName = input.next();

				System.out.println("Enter your last name");
				lastName = input.next();

				Employee emp = new Employee(firstName, lastName);

				System.out.println("Please enter your department from the following: ");
				System.out.println();
				System.out.println("1. Technical");
				System.out.println("2. Admin");
				System.out.println("3. Human Resource");
				System.out.println("4. Legal");
				choice = input.nextInt();

				switch (choice) {
				case 1:
					Employee.showCredentialsMethod(firstName,emp.generateEmailAddress(1), emp.generateRandomPassword(10));
					break;
				case 2:
					Employee.showCredentialsMethod(firstName,emp.generateEmailAddress(2), emp.generateRandomPassword(10));
					break;
				case 3:
					Employee.showCredentialsMethod(firstName,emp.generateEmailAddress(3), emp.generateRandomPassword(10));
					break;
				case 4:
					Employee.showCredentialsMethod(firstName,emp.generateEmailAddress(4), emp.generateRandomPassword(10));
					break;
				default:
					System.out.println("Please choose the departments from (1-4)");

				}
				System.out.println("Do you wish to continue? 'Y' or 'N' ");
				continueIteration = input.next().charAt(0);
			} while (continueIteration == 'Y' || continueIteration == 'y');
		}

	}
}
