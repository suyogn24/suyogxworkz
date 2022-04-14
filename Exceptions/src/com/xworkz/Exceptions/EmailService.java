package com.xworkz.Exceptions;

import com.xworkz.Exceptions.IncreaseEmailException.IncreaseEmailException;

public class EmailService {


	String[] emails=new String[20];
    int index=0;
	
	public EmailService () {
      System.out.println("Invoking default Emailservice constructor");
	}
	



	public boolean add(String email) throws increasedEmailException
	{
		if(email!=null)
		{
			if(!(email.length()>=3) && (email.length()<=20) || 
					! email.matches ("[A-Z a-z]+"))
				email.matches(".edu") 
				&& email.matches(".com") 
				&& email.matches(".in")
				|| email.matches("@") 
				|| email.matches("org")
				
				{
				
				System.out.println("Email  found is ======"+email);
				throw new IncreaseEmailException("Email entered is not valid ");
			}
			
			
			else {
				if(index<emails.length)
				{
					this.emails[index]=email;
					System.out.println(" Email is founded===="+email);
					this.index++;
					return true;
				}
				System.out.println("email is invalid"+email);
			}
		}
		return false;
		
	}
}




				