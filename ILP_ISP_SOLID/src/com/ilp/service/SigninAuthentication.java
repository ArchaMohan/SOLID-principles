package com.ilp.service;

public class SigninAuthentication implements SigninServices {

	@Override
	public void signIn(String useremail, String password) {
		System.out.println("Signing in: " + useremail +" " +password);
		
		
	}

}
