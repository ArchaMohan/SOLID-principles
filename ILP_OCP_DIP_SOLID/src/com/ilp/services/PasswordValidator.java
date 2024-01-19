package com.ilp.services;

public class PasswordValidator implements Validation {

	@Override
	public void validate(String data) {
		// TODO Auto-generated method stub
		
		String password=data;
		
		
		boolean isValidPassword = password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$");
		
		if (isValidPassword) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is not valid.");
        }
        	
	}

	
	}


