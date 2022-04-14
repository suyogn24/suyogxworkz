class Tshirt{
      
	  char size;
	  double price;
	  String brand;
	  String colour;
	  String materials;
	  String quality;
	  char gender;
	  
	       Tshirt(char size,double price,String brand)
		   {
			   this.size=size;
			   this.price=price;
			   this.brand=brand;
			   System.out.println("Print all the states of Tshirt");
		   } 
   
            Tshirt(char size,double price,String brand,String colour)
			{
				this.(size,price,brand);
				this.colour=colour;
				System.out.println("States");
			}
			
			
}
