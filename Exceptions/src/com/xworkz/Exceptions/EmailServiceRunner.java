package com.xworkz.Exceptions;

import com.xworkz.Exceptions.DecreasedEmailException.DecreasedEmailEXception;
import com.xworkz.Exceptions.IncreaseEmailException.IncreaseEmailException;


public class EmailServiceRunner {

	public static void main(String[] args) 
	
	{

	    EmailService emailService=new EmailService();
	    
	    try {
	    
	    emailService.add("suyognaphade@gmail.com");
		emailService.add("suyog24@gmail.com");
		emailService.add("rahulpatil@gmail.com");
		emailService.add("rohan43@gmail.com");
		emailService.add("pritam34@gmail.com");
		emailService.add("mangesh93@gmail.com");
		emailService.add("vignesh392@gmail.com");
		emailService.add("prasad393@gmail.com");
		emailService.add("ravi9294@gmail.com");
		emailService.add("santosh3889@gmail.com");
		emailService.add("shubham7822@gmail.com");
		emailService.add("pranay8293@gmail.com");
		emailService.add("manish938@gmail.com");
		emailService.add("pradeep3023@gmail.com");
		emailService.add("chetanpatil@gmail.com");
		emailService.add("swapnil2934@gmail.com");
		emailService.add("prabhash383@gmail.com");
		emailService.add("akshay3343@gmail.com");
		emailService.add("abhijeet2933@gmail.com");
		emailService.add("ramesh2920@gmail.com");

	     } catch (DecreasedEmailEXception e) {

	     	e.printStackTrace();
	     }
	
	       catch(IncreaseEmailException e)
	     {
	     	e.printStackTrace();
	     }

	}
}



