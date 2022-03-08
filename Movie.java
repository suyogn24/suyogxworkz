class Movie{
 
   String type;
   String name;
   float size;
   String actor;
      
   Movie( String type; String name; float size; String actor);
   {
		  this.type=type;
		  this.name=name;
		  this.size=size;
		  this.actor=actor;
		  
	void displayDetails();
	{
		System.out.println(this.type);
		System.out.println(this.name);
		System.out.println(this.size);
		System.out.println(this.actor);
	}
	
	int rating(String name, int rating)
	{	
		System.out.println(name+"movie rating is"+rating);
		return rating;
		
	}
   }
}

		
		
		
		  
		  