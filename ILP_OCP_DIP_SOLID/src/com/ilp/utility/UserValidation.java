package com.ilp.utility;

import com.ilp.services.EmailValidator;
import com.ilp.services.NameValidator;
import com.ilp.services.PasswordValidator;
import com.ilp.services.Validation;

public class UserValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 String email="example@gmail.com";
		 String name="Abc";
		 String password ="Abc@1243";	
		 
		 NameValidator nameValidator =new NameValidator();
		 nameValidator.validate(name);
		 
		 EmailValidator emailValidator =new EmailValidator();
		 emailValidator.validate(email);
		 
		 PasswordValidator passwordValidator =new PasswordValidator();
		 passwordValidator.validate(password);
		 
		 
		 
		 /////IMPLEMENTING DIP
		 
//		 Validation Name = new NameValidator();
//		 Validation Email = new EmailValidator();
//		 Validation Password = new PasswordValidator();
//		 
//		 Password.validate(password);
//		 Email.validate(email);
//		 Name.validate(name);

	}

	

	}


