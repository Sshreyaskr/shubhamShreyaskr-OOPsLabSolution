package com.GreatLearning.main;

import com.GreatLearning.departments.AdminDepartment;

import com.GreatLearning.departments.HRDepartment;
import com.GreatLearning.departments.TechDepartment;
import com.GreatLearning.model.SuperDepartment;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperDepartment superDep = new SuperDepartment();
		SuperDepartment adminDep = new AdminDepartment();
		HRDepartment hrDep = new HRDepartment();
		TechDepartment techDep = new TechDepartment();

		try (Scanner sc = new Scanner(System.in)) {
			int choice;
			do {
				System.out.println("Choose the departments whose details you want to be displayed:");
				System.out.println("1. Admin");
				System.out.println("2. HR");
				System.out.println("3. Tech");
				System.out.println("4. Super");
				choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Welcome to " + adminDep.getDepartmentName());
					System.out.println(adminDep.getTodaysWork());
					System.out.println(adminDep.getWorkDeadline());
					System.out.println(adminDep.isTodayAHoliday());
					break;
				case 2:
					System.out.println("Welcome to " + hrDep.getDepartmentName());
					System.out.println(hrDep.doActivity());
					System.out.println(hrDep.getTodaysWork());
					System.out.println(hrDep.getWorkDeadline());
					System.out.println(hrDep.isTodayAHoliday());
					break;
				case 3:
					System.out.println("Welcome to " + techDep.getDepartmentName());
					System.out.println(techDep.getTodaysWork());
					System.out.println(techDep.getWorkDeadline());
					System.out.println(techDep.getTechStackInformation());
					System.out.println(techDep.isTodayAHoliday());
					break;
				case 4:
					System.out.println("Welcome to " + superDep.getDepartmentName());
					System.out.println(superDep.getTodaysWork());
					System.out.println(superDep.getWorkDeadline());
					System.out.println(superDep.isTodayAHoliday());
					break;
				default:
					System.out.println("Enter a valid choice!");
				}
			} while (choice != 0);
		}

	}

}
