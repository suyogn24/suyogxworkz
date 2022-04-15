package com.xworkz.interfaces;

public interface CustomGoodsRule {  
	
	
      String[] nonvalidItems();
	  
	
	
	
	public default  String[] validItems()
	{
		String[] validItems= new String[] ("CLOTHES","BOOKS");
		 for(int i=0;i<validItems.length;i++)
		    {
		    	System.out.println(validItems[i]);
		    }
		 return validItems;
	}

}
