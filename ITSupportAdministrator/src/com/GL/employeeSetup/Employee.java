package com.GL.employeeSetup;

import java.security.SecureRandom;

public class Employee {

	private String firstName;
	private String lastName;
	private String emailID;
	
	//Using parameterized constructor of class Employee, to pass firstName, lastName instead of the setter method.
	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLasttName() {
		return lastName;
	}
	
	
	public String generateEmailAddress(int choice) {
		
		if(choice==1) {
			emailID=firstName+lastName+"@tech.GL.com";
		}
		else if(choice==2) {
			emailID=firstName+lastName+"@admin.GL.com";
		}
		else if(choice==3) {
			emailID=firstName+lastName+"@hr.GL.com";
		}
		else {
			emailID=firstName+lastName+"@legal.GL.com";
		}
		
		return emailID;
		
	}
	
	public String generateRandomPassword(int len)
    {
        // ASCII range – alphanumeric (0-9, a-z, A-Z) & special characters
        final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@^~*!$#%&*";
 
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();
 
        // each iteration of the loop randomly chooses a character from the given
        // ASCII range and appends it to the `StringBuilder` instance
 
        for (int i = 0; i < len; i++)
        {
            int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));
        }
 
        return sb.toString();
    }
	
	public static void showCredentialsMethod(String email, String password) {
		System.out.println("Email--->" + email);
		System.out.println("Password--->" + password);
	}
	
	
}
