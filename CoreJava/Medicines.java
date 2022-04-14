class Medicines{

    String[] medicines=new String[10];
	int tempValue=0;

	void addmedicines(String medicines){
		
	System.out.println("Medicines "+ medicines);
	this.medicines[tempValue]=medicines;
	tempValue = tempValue++;
	
	}
	
    void displayMedicines()
	{
		System.out.println("Displaying Medicines");
		
	for(int n=0;n<medicines.length;n++)
		
	    System.out.println(this.medicines[n]);
		System.out.println(medicines);
		
	}

	boolean FindMedicines (String name);
	{
		System.out.println("Find Medicines");
		boolean found=false;
		for(int n=0;n<this.name.length;n++)
		{ 
	    String nameFromArray=this.name[n];
		if(nameFromArray.equals(name))
		{
			System.out.println("Medicines is found" + name);
			found=true;
		}
		
		}

        if(!found)
		{
              System.out.println("Medicines is not found" + name);
		}
	     return found;
	}	
}



