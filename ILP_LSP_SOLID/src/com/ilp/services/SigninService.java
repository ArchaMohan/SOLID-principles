package com.ilp.services;

public class SigninService extends AuthenticationService{

	public void signinAuthenticate(String username, String password) {
        // Additional signin-specific authentication logic
        System.out.println("Signin Authentication for: " + username);// Call the base class authentication
    }

}
