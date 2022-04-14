class Motor{

   int rpm;
   boolean working;
   String fuelType;
   
   Motor(int rpm,boolean working)
   {
	   this.rpm=rpm;
	   this.working=working;
	   System.out.println();
   }
   
   Motor(int rpm,boolean working, String fuelType)
   {
	   this(rpm,working);
	   this.fuelType=fuelType;
	   System.out.println();
   }
   
   void run()
   {
	   System.out.println("run motor");
   }
   
   void stop()
   {
	   System.out.println("stop motor");
   }
   
   

   
   
}

