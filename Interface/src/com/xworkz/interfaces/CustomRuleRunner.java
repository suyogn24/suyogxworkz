package com.xworkz.interfaces;

import com.xworkz.interfaces.CustomRuleImplementor;
import com.xworkz.interfaces.CustomCheckInTimeRule;
import com.xworkz.interfaces.CustomGoodsRule;
import com.xworkz.interfaces.CustomRule;


public class CustomRuleRunner {
	
	public static void main(String[] args) {
		
		
		CustomRule customRule = new CustomRuleImplementor();
		
		
	    boolean checktime=customRule.validPassport();
		boolean timeCheck=customRule.baggageCheckin();
	    String  bookTickets=customRule.bookedTickets();
	    
	    
	    System.out.println(checktime);
	    System.out.println(timeCheck);
	    System.out.println(bookTickets);
	    
	    
	    CustomCheckInTimeRule customCheckInTimeRule = (CustomCheckInTimeRule)customRule;
	    
	    CustomCheckInTimeRule.minCheckInTimeRule();
	    CustomCheckInTimeRule.maxCheckInTimeRule();
	    
	    
	    CustomGoodsRule customGoodsRule = (CustomGoodsRule)customRule;
	    		
	    customGoodsRule.validItems();
	    customGoodsRule.nonvalidItems();
	    
	  

	}

}
