package com.GL.employeeSetup;

public class Employee {

	private String firstName;
	private String lastName;
	
	public Employee() {
		
	}
	//Using parameterized constructor of class Employee, to pass firstName, lastName
	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getLastName() {
		return lastName;
	}
		
}
