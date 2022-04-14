class Tester{
    public static void main(String[] args)
	{
		Tshirt shirt=new Tshirt('X',1000.0d,"H&M");
		
		System.out.println(shirt.size);
		System.out.println(shirt.price);
	    System.out.println(shirt.brand);
		shirt.colour="Red";
	    System.out.println(shirt.colour);
		shirt.material="Cotton";
		System.out.println(shirt.material);
		shirt.quality="Good";
		System.out.println(shirt.quality);
		shirt.gender='M';
		System.out.println(shirt.gender);
		 
		Tshirt shirtA=new Tshirt('S',600.0d,"Puma","Red");
		
		shirtA.material="Pure Cotton";
		shirtA.quality="1 num";
		shirtA.gender='F';
		System.out.println(shirtA.size);
		System.out.println(shirtA.price);
		System.out.println(shirtA.brand);
		System.out.println(shirtA.colour);
		System.out.println(shirtA.material);
        System.out.println(shirtA.quality);
		System.out.println(shirtA.gender);
	
	

		Computer device=new Computer("Lenevo","intel core i3");
		System.out.println(device.brand);
		System.out.println(device.model);
		System.out.println(device.price);
		      
		   
		Computer device2=new Computer("Dell",intel",40000.0d);
		System.out.println(device2.brand);
		System.out.println(device2.model);
		System.out.println(device2.price);
		
		
		Computer device3=new Computer("Asus","intel core i3",50000.0d,8);
		System.out.println(device3.brand);
		System.out.println(device3.model);
		System.out.println(device3.price);
		System.out.println(device3.ramsize);
		
		
		Camera pic=new Camera("Nikon","5ds");
		System.out.println(pic.brand);
		System.out.println(pic.model);
		
		
		Camera picA=new Camera("A7R","Sony",false);
		System.out.println(picA.model);
		System.out.println(picA.brand);
		System.out.println(picA.price);
		
		
		Camera picB=new Camera("Full Frame",Canon",18.91F);
		System.out.println(picB.model);
		System.out.println(picB.brand);
		System.out.println(picB.pixel);
		System.out.println(picB.price);
		
		
		Camera picC=new Camera("Sigma"45.4F,d7500");
		System.out.println(picC.brand);
		System.out.println(picC.pixel);
		System.out.println(picC.model);
		
		
		Camera picD=new Camera("Panasonic"55000.0d,true);
		System.out.println(picD.brand);
		System.out.println(picD.price);
		System.out.println(picD.chargeable);
		
		
		Camera picE=new Camera("20000.0d,"Canon",4);
		System.out.println(picE.memoryCardSize);
		System.out.println(picE.price);
		System.out.println(picE.brand);
		
		
	}
	
		
		
		
		
		
		
		