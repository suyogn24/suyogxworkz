class Camera{
     
	 String brand;
	 String model;
	 double price;
	 int memoryCardsSize;
	 boolean chargeable;
	 float pixel;
	 
	 Camera(String brand,String model)
	 {
		 this.brand=brand;
	 	 this.model=model;
	 }

     Camera(String model,String brand,boolean chargeable)
	 {
         this(model,brand);
         this.chargeable=chargeable;
	 }

	 Camera(String model,String brand,float pixel)
	 {
		 this(model,brand);
		 this.pixel=pixel;
	 }
	    
	 Camera(String brand,float pixel,boolean chargeable)
	 {
         this(model,brand,pixel);
	 }

      Camera(String brand,double price,boolean chargeable)
	  {
         this.brand=brand;
         this.price=price;
         this.chargeable=chargeable;
	  }
	  
	 
      Camera(double price,String brand,int memoryCardsSize)
	  {
         this.brand=brand;
		 this.price=price;
		 this.memoryCardsSize=memoryCardsSize;
		 //this.brand=brand;
	  }
	  
	  
}









   
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 