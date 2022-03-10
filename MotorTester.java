class MotorTester{

 public static void main (String[] things)
 {
	 Motor motor=new Motor(1400,true,"Diesel");
	 System.out.println(motor.rpm);
	 System.out.println(motor.working);
	 System.out.println(motor.fuelType);
	 motor.run();
	 motor.stop();
	 
	 Motor motor1=new WaterPumpMotor(700,true,"Petrol");

	 motor.run();
	 motor.stop();
	 
	 MotorOperator motorOperator = new MotorOperator();
	 
	 motorOperator.operator(motor1);
	 
 }
}