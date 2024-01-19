package com.ilp.utility;

import com.ilp.services.UserAuthentication;
import com.ilp.services.UserValidation;

public class UserManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   UserValidation userValidation = new UserValidation();
	        UserAuthentication userAuthentication = new UserAuthentication();

	        // Validate user input
	        String name = "exampleUser";
	        String pass = "password123";
	        
	        if(userValidation.validateuser(name,pass)) {
	        	System.out.println("valid data");
	        }
	        else
	        {
	        	System.out.println("Invalid data");
	        }
	
	 
    if(userAuthentication.authenticateUser(name,pass)) {
    	System.out.println("authentication successful");
    }
    else
    {
    	System.out.println("authentication unsuccessful");
    }

}
}
