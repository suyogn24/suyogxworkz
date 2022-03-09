class TrainTester{

   public static void main(String[]things)
   {
   
    Train train =new train(35668,"Shatabdi Express",FuelType.DIESEL);
    train.displayDetails();
	
    Train train1=new Train(23567,"Rajdhani Express");
	train1.type=FuelType.PETROL;
    System.out.println(train1.type);
    train1.displayDetails();

	Train train2=new Train("Jan Shatabdi Express",FuelType.DIESEL);
	train2.trainNo=68895;
    System.out.println(train2.type);
    train2.displayDetails();
	
	Train train3=new Train("Humsafar Express",12789);
	train3.type=FuelType.DIESEL;
    System.out.println(train3.type);
    train3.displayDetails();
   }
}
