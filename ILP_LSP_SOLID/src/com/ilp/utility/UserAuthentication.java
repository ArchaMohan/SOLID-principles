package com.ilp.utility;

import com.ilp.services.AuthenticationService;
import com.ilp.services.SigninService;
import com.ilp.services.SignupService;

public class UserAuthentication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		SignupService signup= new SignupService();
		   AuthenticationService signInService = new SigninService();
	        signInService.authenticate("john_doe", "password123");
	      

	        // Using base class reference for SignUpService
	        AuthenticationService signUpService = new SignupService();
	        signUpService.authenticate("jane_doe", "secure_password");
	        
	        
//	        SignupService SignUpService1 = new SignupService();
//	        SignUpService1.signupAuthenticate("ar", "secure_password");
//	        SigninService authentication=new AuthenticationService();
	    }
	}

