class Soap{

    String name;
	double price;
    String colour;
	char size;
	double weight;
	int	manufactureDate;
    int tmf;
		
	Soap()
	{	
		System.out.println();
	}

	Soap(String name,double price,String colour,char size,double weight,int manufactureDate,int tmf)
	{
		this.name=name;
		this.price=price;
		this.colour=colour;
		this.size=size;
		this.weight=weight;
		this.manufactureDate=manufactureDate;
		this.tmf=tmf;
		
	}
	
	void updateName()
	{
		this.name="Lifebouy";
	}	
	   
    void updateName(String name)
    {
	    this.name=name;
	}	 
	    
    void updatePrice()
	{
		this.price="50";
    }	

    void updatePrice(double Price)
	{
		this.price=price;
	}	
	   
	void updateColour()
	{
		this.colour="Red";
	}	
	 
	void updateColour(String Colour)
	{
		this.colour=colour;
	}	

	void updateSize()
	{
		this.size="3";
	}

    void updateSize(Char Size)
	{
		this.size=size;
	}
	
	void updateweight()
	{
		this.weight="100 gm";
	}

    void updateweight(Double weight)
	{
		this.weight=weight;
	}

    void updateManufactureDate()
	{
		this.manufactureDate="13-07-2021";
	}

	void updateManufactureDate(Int manufactureDate)
	{
		this.manufactureDate=manufactureDate;
	}
	   
    void updateTmf()
	{
		this.tmf="75%";
	}
	   
	void updateTmf(Int tmf)
	{
		this.tmf=tmf;
	}	
	
	System.out.println();
	
	
	String getName()
	{
		System.out.println("running getName");
		return this.Name;
	}
	
	
	String getPrice()
	{
		System.out.println("running getPrice");
		return this.Price;
	}
	  
    String getColour()
    {
	    System.out.println("running getColour");
	    return this.Colour;
    }  
	
	
	Char getSize()
	{
		System.out.println("running getSize");
		return this.Size;
	}
	
	
	double getWeight()
	{
		System.out.println("running getweight");
		return this.weight;
	}
	
	
	Int getManufactureDate()
	{
		System.out.println("running getManufactureDate");
		return this.manufactureDate;
	}
	  
	  
	Int getTmf()
	{
		System.out.println("running gettmf");
		return this.tmf;
	}	
	  
}
	