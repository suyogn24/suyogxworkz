class Feb24Tester
{
      public static void main(String[] args)
	  {
	       //Soap Instance 1 
		    
		   Soap soap=new Soap("Park Avenue",50.0D,"White",'S',80,"13-07-2021",60.0f);
		   soap.displayDetails();
		     
		   System.out.println();
    
           soap.updateName("Dove");
		   soap.updatePrice();
           soap.updateColour("White");
           soap.updateSize ();
           soap.updateWeight(100);
           soap.updateDate();
		   soap.updatetmf(45.0f);
		   
		   System.out.println();
		   
		   soap.getName();
		   soap.getPrice();
		   soap.getColour();
		   char size=soap.getSize();
		   System.out.println(size);
		   int weight=soap.getWeight();
		   System.out.println(weight);
		   String date=soap.getDate();
		   System.out.println(date);
           float tmf=soap.getTMF();
		   System.out.println(tmf);
		   
		   System.out.println();
		   
	  }
	  
}


		   
		   
		   
		   
		   
		   
		   