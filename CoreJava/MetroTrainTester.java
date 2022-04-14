class MetroTrainTester{

   public static void main(String[]things)
   {

   MetroTrain metroTrain = new MetroTrain(23456,"Sachkand Express",FuelType.PETROL,"Nanded");
   
   metroTrain.ticketPrice=477;
   System.out.println(metroTrain.cityName);
   System.out.println(metroTrain.ticketPrice);
   metroTrain.displayDetails();
   
   MetroTrain metroTrain1 = new MetroTrain(36299,"Gitanjali Express",FuelType.DIESEL,"455");
   metroTrain1.cityName="Mumbai";
   System.out.println(metroTrain1.cityName);
   System.out.println(metroTrain1.ticketPrice);
   metroTrain.displayDetails();
   
   MetroTrain metroTrain2 = new MetroTrain(45870,"Rajdhani Express",FuelType.DIESEL,"Delhi","676");
   metroTrain2.cityName="Pune";
   metroTrain2.ticketPrice=754;
   System.out.println(metroTrain2.cityName);
   System.out.println(metroTrain2.ticketPrice);
   metroTrain.displayDetails();
   }
}
