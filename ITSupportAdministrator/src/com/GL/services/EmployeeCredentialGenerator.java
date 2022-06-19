package com.GL.services;

import java.security.SecureRandom;

public class EmployeeCredentialGenerator {

	   String emailId;
	   
public String generateEmailAddress(int choice, String firstName, String lastName) {
		
		if(choice==1) {
			emailId=firstName+lastName+"@tech.GL.com";
		}
		else if(choice==2) {
			emailId=firstName+lastName+"@admin.GL.com";
		}
		else if(choice==3) {
			emailId=firstName+lastName+"@hr.GL.com";
		}
		else {
			emailId=firstName+lastName+"@legal.GL.com";
		}
		
		return emailId;
		
	}
	
	
	public String generateRandomPassword()
    {
        // ASCII range – alphanumeric (0-9, a-z, A-Z) & special characters
        final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@^~*!$#%&*";
 
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();
 
        // each iteration of the loop randomly chooses a character from the given
        // ASCII range and appends it to the `StringBuilder` instance
 
        //Creating a 10-digit password
        for (int i = 0; i < 10; i++)
        {
            int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));
        }
 
        return sb.toString();
    }
	
	public static void showCredentialsMethod(String firstName,String email, String password) {
        System.out.println("Dear " + firstName.toUpperCase() + " the generated credentials are as follows-->");
		System.out.println("Email--->" + email);
		System.out.println("Password--->" + password);
	}
	
}
