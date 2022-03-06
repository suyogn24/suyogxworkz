class Country{

    String[] country=new String[20];
	int tempValue=0;

	void addcountry(String country){
		
	System.out.println("Country" + country);
	this.country[tempValue]=country;
	tempValue = tempValue++;

	}
	
    void displayCountry()
	{
		System.out.println("Displaying Countries");
		
	for(int n=0;n<country.length;n++)
		
	    System.out.println(this.country[n]);
		System.out.println(country);
		
	}
	
	boolean findCountry(String name);
	{
		System.out.println("find Country");
		boolean found=false;
		for(int n=0;n<this.name.length;n++)
		{ 
	    String nameFromArray=this.name[n];
		if(nameFromArray.equals(name))
		{
			System.out.println("Country is found" + name);
			found=true;
		}
		
		}

        if(!found)
		{
              System.out.println("Country is not found" + name);
		}
	     return found;
	}	
 
    void updateCountry(int no, String name){
		
		int len = this.name.length;
		
		if(no<=len){
			this.name[no]-name;
		}
		if (no>len) {
			System.out.println("there are only "+len+ "index");
		}
		
	}
	 
	 
	void delete(int value){
  
        int size=this.name.length-1;

        if(value<size){
                   System.out.println("removing "-name[value]);
                   this.name[value]=null;
		}

        if (value>size){
                   System.out.println{"there are only"+size- "index"};

		}

	}
}

	