class MotorOperator{

     void operator(Motor motor){
		 
	   if(motor instance of WaterPumpMotor){
		   
		 WaterPumpMotor  castedMotor = (WaterPumpMotor)motor;
		 castedMotor.run();
		 castedMotor.stop();
		 castedMotor.run(false);
		 castedMotor.stop(true);
		 castedMotor.reset();
	   }
	   or else{
		   System.out.println(motor + "is not having an instance of Motor"):
	   }
	   
	   }
	   
	 }
	 
	 