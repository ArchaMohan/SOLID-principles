package com.ilp.utility;

import com.ilp.service.SigninAuthentication;
import com.ilp.service.SigninServices;
import com.ilp.service.SignupAuthentication;
import com.ilp.service.SignupServices;

public class UserAuthentication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SignupServices signupServices = new SignupAuthentication();
        SigninServices signinServices = new SigninAuthentication();

        // Call methods on SignupServices
        signupServices.signUp("exampleUser", "password123");

        // Call methods on SigninServices
        signinServices.signIn("example@gmail.com", "password123");
    }
	

	}


