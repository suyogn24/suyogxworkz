package com.xworkz.interfaces;

public class CustomCheckInTimeRule implements CustomRule,CustomGoodsRule {

	double minCheckInTime()
	{
		
		System.out.println("Checking the min time rule ");
		System.out.println("Custom checkin time rule");
		
		return 1000;
		
	}
	
	 double maxCheckInTime()
	{
		
		System.out.println("Checking the max time rule ");
		System.out.println("Custom checkin time rule");
		
		return 2000;
		
	}
		

	@Override
	public String[] validItems() {

		System.out.println("Implementing method from the CustomGoodsRule");
		return null;
	}

	@Override
	public String[] nonvalidItems() {
          System.out.println("Implementing non valid items from the custom goods rule");
		return null;
	}
	
	
}
