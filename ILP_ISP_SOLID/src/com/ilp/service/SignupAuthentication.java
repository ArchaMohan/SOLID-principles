package com.ilp.service;

public class SignupAuthentication implements SignupServices {

	@Override
	public void signUp(String username, String password) {
		
		
		 System.out.println("Signing up: " + username +" " +password );
	}

}
