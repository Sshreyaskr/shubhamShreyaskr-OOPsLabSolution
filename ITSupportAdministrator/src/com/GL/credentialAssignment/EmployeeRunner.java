package com.GL.credentialAssignment;

import com.GL.employeeSetup.*;
import com.GL.services.EmployeeCredentialGenerator;

import java.util.Scanner;

public class EmployeeRunner {

	public static void main(String[] args) {

		String firstName = null;
		String lastName = null;
		String emailId=null;
		String password=null;
		EmployeeCredentialGenerator empCred=new EmployeeCredentialGenerator();
		
		try (Scanner input = new Scanner(System.in)) {
			char continueIteration;
			int choice;

			do {
				System.out.println("Enter your first name");
				firstName = input.next();

				System.out.println("Enter your last name");
				lastName = input.next();

				
				Employee employee=new Employee(firstName, lastName);
			
				System.out.println("Please enter your department from the following: ");
				System.out.println("1. Technical");
				System.out.println("2. Admin");
				System.out.println("3. Human Resource");
				System.out.println("4. Legal");
				choice = input.nextInt();

				switch (choice) {
				case 1:
					     emailId=empCred.generateEmailAddress(choice,firstName,lastName);
					     password=empCred.generateRandomPassword();
					     EmployeeCredentialGenerator.showCredentialsMethod(firstName, emailId, password);
					break;
				case 2:
					 emailId=empCred.generateEmailAddress(choice,firstName,lastName);
				     password=empCred.generateRandomPassword();
				     EmployeeCredentialGenerator.showCredentialsMethod(firstName, emailId, password);
					break;
				case 3:
					 emailId=empCred.generateEmailAddress(choice,firstName,lastName);
				     password=empCred.generateRandomPassword();
				     EmployeeCredentialGenerator.showCredentialsMethod(firstName, emailId, password);
					break;
				case 4:
					 emailId=empCred.generateEmailAddress(choice,firstName,lastName);
				     password=empCred.generateRandomPassword();
				     EmployeeCredentialGenerator.showCredentialsMethod(firstName, emailId, password);
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
