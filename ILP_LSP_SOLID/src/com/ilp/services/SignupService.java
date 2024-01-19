package com.ilp.services;

public class SignupService extends AuthenticationService {

	public void signupAuthenticate(String useremail, String password) {
        // Additional signup-specific authentication logic
        System.out.println("Signup Authentication for: " + useremail);
        
    }

}
