package com.xworkz.interfaces;

public interface CustomRule {
	
	public default boolean validPassport()
		{
			System.out.println("validpassport"+this.getClass().getSimpleName());
			return true;
		}
		
		
		default boolean baggageCheckin()
		{
			System.out.println("Baggage checkin "+this.getClass().getSimpleName());
			return true;
			
		}
		
		
		public String bookedTickets();
		{
		
			System.out.println("bookedTickets"+this.getClass().getSimpleName());
			return null;
	
		}		
		
		

		

}
