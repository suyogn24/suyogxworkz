classs Computer{
 
    String brand;
	String model;
	double price;
	int processorSpeed;
	int ramSize;
	
	
	Computer(String brand,String model)
	{
		this.brand=brand;
		this.model=model;
		System.out.println("Print the states of 1st constructor");
	}

	Computer(String brand,String model,double price)
	{
		this(brand,model);
		this.price=price;
		System.out.println("Print the ststes of 2nd constructor");
	}

	Computer(String brand,String model,double price,int ramSize)
	{
		this(brand,model,price);
		this.ramSize=ramSize;
		System.out.println("Print the ststes of 3rd constructor");
	}
}
	
	
	
	