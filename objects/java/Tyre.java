package com.xworkz.objects.java;

public class Tyre {
	
	String name = " SPICE JET";
	String model = "spice 2010";
	int price=50000;
	boolean working=true;
	
	
	public Tyre(String name,String model,int price,boolean working) {
		super();
		System.out.print("PARAMETERISED TYRE CONSTRUCTOR");
		this.name = name;
		this.model = model;
		this.price = price;
		this.working = working;
}
	
	public Tyre() {
		
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
		return "Tyre";
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals of tyre");
		if (obj == null) {
			System.out.println("I cannot compare tyre will null");
			return true;
		}
		else {
			System.err.println("can compare tyre with obj");
			if(obj instanceof Tyre)
			{
				
		 System.out.println("Tyre is a type of an object");
		  
		 Tyre tyre=(Tyre)obj;
		 
		 String sname=Tyre.name;
		 String smodel=Tyre.model;
		 
		 if(this.name.equals(sname) && this.model.equals(smodel));
		 
		 System.out.print("Here tyre and object are same because of the type casting");
		 
		 return true;
		 
			}
			else {
				
				System.out.println("Here tyre and object are not same");
				 return false;
				 
			}
			
		}
		
	}
}
