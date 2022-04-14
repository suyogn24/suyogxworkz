class Train{

  String  trainNo
  String  trainName;
  FuelType type;
  
   Train(String trainNo,String trainName,FuelType type)
   {
	   
    void DisplayDetails()
	{
		System.out.println(this.trainno);
        System.out.println(this.trainname);
		System.out.println(this.type);
	}
	
    Train(String trainNo)
	{
		this.train.No=trainNo;
		System.out.println();
	}
	
	Train(String trainNo,String trainName)
	{
		this.(trainNo);
		this.trainName=trainName;
		System.out.println();
	}
	
	Train(String trainNo,String trainName,FuelType type)
	{
		this.(trainNo,trainName);
		this.type=type;
		System.out.println();
	}
	
    Train(FuelType type)
	{
		this.type=type;
		System.out.println();
	}
   }
}


 