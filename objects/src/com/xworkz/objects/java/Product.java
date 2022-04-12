package com.xworkz.objects.java;

public class Product {

	String brand = " FORD";
	String type = "Ford Ranger";
	String quantity="FIVE";
	double cost=1000000;
	
	
	public Product(String brand,String type,int quantity,double cost) {
		super();
		System.out.print("PARAMETERISED TYRE CONSTRUCTOR");
		this.brand = brand;
		this.type = type;
		this.quantity = quantity;
		this.cost = cost;
}
	
	public Product() {
		
		System.out.println("DEFAULT TYRE CONSTRUCTOR");		
	}

	@Override
	public int hashCode() {
	int superHashCode= super.hashCode();
    System.out.println("hashcode from parent"+superhashCode);
       return 455;
	}
	
	@Override
	public String toString() {
		return "Product";
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals of Product");
		if (obj == null) {
			System.out.println("I cannot compare product will null");
			return true;
		}
		else {
			System.err.println("can compare product with obj");
			if(obj instanceof Product)
			{
				
		 System.out.println("Product is a type of an object");
		  
		 Product product=(Product)obj;
		 
		 String sbrand=Product.brand;
		 String squantity=Product.quantity;
		 
		 if(this.brand.equals(sbrand) && this.quantity.equals(squantity));
		 
		 System.out.print("Here product and object are same because of the type casting");
		 
		 return true;
		 
			}
			else {
				
				System.out.println("Here product and object are not same");
				 return false;
				 
			}
			
		}
		
	}
}

