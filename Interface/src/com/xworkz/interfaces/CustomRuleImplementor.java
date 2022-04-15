package com.xworkz.interfaces;

public class CustomRuleImplementor implements CustomRule {

	@Override
	public boolean validPassport() {
		System.out.println("validpassport"+this.getClass().getSimpleName());
		return true;
	}
	
	
	@Override
	public boolean baggageCheckin() {
		System.out.println("Baggage checkin process"+this.getClass().getSimpleName());
		return true;
	}

	
	@Override
	public String bookedTickets() {
		System.out.println("bookedTickets"+this.getClass().getSimpleName());
		return null;
	}
	
	double minCheckInTime()
	{
		System.out.println("Checking the min time rule ");
		System.out.println("Calling the method from the custom checkin time rule");	
		return 1000;
		
	}
	
	double maxCheckInTime()
	{
		System.out.println("Checking the max time rule ");
		System.out.println("Calling the method from the custom checkin time rule");
		return 2000;
		
	}
	
	

	public String[] validItems() 
	{

		System.out.println("Implementing method from the CustomGoodsRule");
		return null;
	}

	
	public String[] nonvalidItems() 
	{
          System.out.println("Implementing non valid items from the custom goods rule");
		return null;
	}
	
	
	
	
	
	

}
