package com.xworkz.objects.java;

public class Mobile {

	String brand = " SAMSUNG";
	String model = "Galaxy M20";
	int imei=353566787;
	double cost=8500;
	
	
	public Mobile(String brand,String model,int imei,double cost) {
		super();
		System.out.print("PARAMETERISED TYRE CONSTRUCTOR");
		this.brand = brand;
		this.model = model;
		this.imei = imei;
		this.cost = cost;
}
	
	public Mobile() {
		
		System.out.println("DEFAULT TYRE CONSTRUCTOR");		
	}

	@Override
	public int hashCode() {
	int superHashCode= super.hashCode();
    System.out.println("hashcode from parent"+superhashCode);
       return 980;
	}
	
	@Override
	public String toString() {
		return "Mobile";
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals of mobile");
		if (obj == null) {
			System.out.println("I cannot compare mobile will null");
			return true;
		}
		else {
			System.err.println("can compare mobile with obj");
			if(obj instanceof Mobile)
			{
				
		 System.out.println("Mobile is a type of an object");
		  
		 Mobile mobile=(Mobile)obj;
		 
		 String sbrand=Mobile.brand;
		 String smodel=Mobile.model;
		 
		 if(this.brand.equals(sbrand) && this.model.equals(smodel));
		 
		 System.out.print("Here mobile and object are same because of the type casting");
		 
		 return true;
		 
			}
			else {
				
				System.out.println("Here mobile and object are not same");
				 return false;
				 
			}
			
		}
		
	}
}

