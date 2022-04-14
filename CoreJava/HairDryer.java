class HairDryer{
         
	int speed;
    int watts;
  
	
	Hairdryer(int speed, int watts)
	{
		this.speed=speed;
		this.watts=watts;
       
		
	}
	
	public void displayDetails()
	{
		
		System.out.println(speed);
		System.out.println(watts);

	}
	
	public void changeSpeed()
	{
		speed=5;
		System.out.println("speed after change is"+ speed);
		
	}
	
	
}
