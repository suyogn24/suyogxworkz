class WaterPumpMotor extends Motor{

      WaterPumpMotor()
	  {
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
	   
	  void run(boolean run)
	  {
	     System.out.println("run waterpumpmotor with boolean");
	  }
	  
	  void stop(boolean stop)
	  {
	     System.out.println("stop waterpumpmotor with boolean");
	  }
	  
      void reset()
	  {
		  System.out.println("motor gets reset");
	  }
	  
}
	
