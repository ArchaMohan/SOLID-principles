package com.ilp.services;

public class EmailValidator implements Validation {

	@Override
	public void validate(String data) {
		String email=data;
		
		  boolean isValidEmail = email.matches("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$");

	        if (isValidEmail) {
	            System.out.println("Email is valid.");
	        } else {
	            System.out.println("Email is not valid.");
		
	}}
		
	

}
