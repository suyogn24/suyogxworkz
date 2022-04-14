class Charger{

    String colour;
  	ChargerType type;
	String watts;
	String brand;
	PinType pinType;
	boolean USB;
	float wirelength;
	boolean working;
		   
	
	
	void about()
	{	
      System.out.println(this.colour);
	  System.out.println(this.type);
      System.out.println(this.watts);
      System.out.println(this.brand);
      System.out.println(this.pinType);
      System.out.println(this.USB);
      System.out.println(this.wirelength);
      System.out.println(this.working);
	}
	
    void updateColour()
	{
		this.colour="Red";
	}
	 
	void updateColour(String colour) 
	{ 
	    this.colour=colour;
	}
	
	void updateType()
	{
		this.type=ChargerType.USB_CHARGER;
	}
	
	void updateType(ChargerType type)
	{
		this.type=type;
	}
	
	void updateWatts()
	{
		this.watts="3W";
	}
	
	void updateWatts(String watts)
	{
		this.watts=watts;
	}
	
	void updateBrand()
	{
		this.brand="Samsung";
	}
		
    void updateBrand(String brand)
	{
		this.brand=brand;
	}
	
	void updatePinType()
	{
		this.pinType=PinType.TYPE_A;
	}
	
	void updatePinType(PinType pinType)
	{
		this.pinType=pinType;
	}
	
	void updateUSB()
	{
		this.USB=true;
	}
	
	void updateUSB(boolean USB)
	{
		this.USB=USB;
	}
	
	void updateWirelength()
	{
		this.wirelength=2.6f;
	}
	
	void updateWirelength(float wirelength)
	{
		this.wirelength=wirelength;
	}
	
	void updateWorking()
	{
		this.working=true;
	}
	
	void updateWorking(Boolean Working)
	{
		this.working=working;
	}
	
	
	void update(String colour,ChargerType type,String watts,String brand,PinType pinType,boolean USB,float wirelength,boolean working)
	{
		this.colour=colour;
	    this.type=type;
	    this.watts=watts;
	    this.brand=brand;
	    this.pinType=pinType;
	    this.USB=USB;
	    this.wirelength=wirelength;
	    this.working=working;
	}
	
	
}

	
	
	
	
	
	
	