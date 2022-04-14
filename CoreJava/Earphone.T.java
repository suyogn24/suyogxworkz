class Tester{

     public static void main(String[] args) {
	 
	       Earphone earphone = new Earphone("Samsung",1500, "yellow", "new");
		   System.out.println(earphone.type);
		   System.out.println(earphone.price);
		   System.out.println(earphone.color);
		   System.out.println(earphone.brand);

		   Earphone earphone1 = new Earphone("MI",1000, "red", "old");
		   System.out.println(earphone.type);
		   System.out.println(earphone1.price);
		   System.out.println(earphone1.color);
		   System.out.println(earphone1.brand);
		   
		   System.out.println(earphone.brand);// warrantyPeriod based on brand
		   //=================================================================
		   
	 }
}
	 