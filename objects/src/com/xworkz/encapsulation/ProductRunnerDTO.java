package com.xworkz.encapsulation;
import com.xworkz.encapsulation.dto.PersonDTO;
import com.xworkz.encapsulation.dto.ProductDTO;

public class ProductRunnerDTO {

	public static void main(String[] args) {

		PersonDTO product=new PersonDTO();

		product.setName("RAHUL");
		String name=product.getName();
		System.out.println(product.getName());

		product.setHeight(170.00);
		double height=product.getHeight();
		System.out.println(product.getHeight());

		product.setWeight(70.0);
		double weight=product.getWeight();
		System.out.println(product.getWeight());

		product.setDisabled(false);
		boolean Disabled=product.isDisabled();
		System.out.println(product.isDisabled());


		product.setDead(false);
		boolean dead=product.isDead();
		System.out.println(product.isDead());

		System.out.println("SECOND INSTANCE OF PERSON");

		PersonDTO product1=new PersonDTO();
		product.setName("AKSHAY");
		String name1=product.getName();
		System.out.println(product.getName());

		product.setHeight(169.00);
		double height1=product.getHeight();
		System.out.println(product.getHeight());

		product.setWeight(75);
		double weight1=product.getWeight();
		System.out.println(product.getWeight());

		product.setDisabled(false);
		boolean Disabled1=product.isDisabled();
		System.out.println(product.isDisabled());


		product.setDead(false);
		boolean dead1=product.isDead();
		System.out.println(product.isDead());





		System.out.println("1 ST INSTANCE OF PRODUCT DTOS ");

		ProductDTO product2=new ProductDTO();

		product2.setPhone("SAMSUNG SMARTPHONE");
		System.out.println(product2.getPhone());

		product2.setPrice(100);
		System.out.println(product2.getPrice());

		product2.setColour("BLUE");
		System.out.println(product2.getColour());

		product2.setWeight(weight1);
		System.out.println(product2.getWeight());

		product2.setWorking(true);
		boolean working=product2.isWorking();
		System.out.println(product2.isWorking());

		product2.setManufacturePlace("MUMBAI");
		System.out.println(product2.getManufacturePlace());

		product2.setShoppingOnline(true);
		boolean offline=product2.isShoppingOnline();
		System.out.println(product2.isShoppingOnline());

		product2.setShoppingOffline(false);
		boolean offline1=product2.isShoppingOffline();
		System.out.println(product2.isShoppingOffline());


		product2.setProductcouriercharge(150);
		System.out.println(product2.getProductcouriercharge());




		ProductDTO product3=new ProductDTO();

		product3.setPhone("SAMSUNG GALAXY M20");
		System.out.println(product3.getPhone());

		product3.setPrice(100);
		System.out.println(product3.getPrice());

		product3.setColour("RED");
		System.out.println(product3.getColour());

		product3.setWeight(123);
		System.out.println(product3.getWeight());

		product3.setWorking(true);
		boolean workingg=product3.isWorking();
		System.out.println(product3.isWorking());

		product3.setManufacturePlace("PUNE");
		System.out.println(product3.getManufacturePlace());

		product3.setShoppingOnline(true);
		boolean offline3=product3.isShoppingOnline();
		System.out.println(product3.isShoppingOnline());

		product3.setShoppingOffline(false);
		boolean offlinee=product3.isShoppingOffline();
		System.out.println(product3.isShoppingOffline());


		product3.setProductcouriercharge(100);
		System.out.println(product3.getProductcouriercharge());



		ProductDTO product4=new ProductDTO();

		product4.setPhone("SAMSUNG SMARTPHONE 5G NEW");
		System.out.println(product4.getPhone());

		product4.setPrice(130);
		System.out.println(product4.getPrice());

		product4.setColour("WHITE");
		System.out.println(product4.getColour());

		product4.setWeight(129);
		System.out.println(product4.getWeight());

		product4.setWorking(true);
		boolean workngg=product4.isWorking();
		System.out.println(product4.isWorking());

		product4.setManufacturePlace("NASHIK");
		System.out.println(product4.getManufacturePlace());

		product4.setShoppingOnline(true);
		boolean offline4=product4.isShoppingOnline();
		System.out.println(product4.isShoppingOnline());

		product4.setShoppingOffline(false);
		boolean offliew=product4.isShoppingOffline();
		System.out.println(product4.isShoppingOffline());


		product4.setProductcouriercharge(110);
		System.out.println(product4.getProductcouriercharge());



		ProductDTO product5=new ProductDTO();

		product5.setPhone("SAMSUNG  5G NEW");
		System.out.println(product5.getPhone());

		product5.setPrice(250);
		System.out.println(product5.getPrice());

		product5.setColour("BLACK");
		System.out.println(product5.getColour());

		product5.setWeight(129);
		System.out.println(product5.getWeight());

		product5.setWorking(false);
		boolean wrkngg=product5.isWorking();
		System.out.println(product5.isWorking());

		product5.setManufacturePlace("NAGPUR");
		System.out.println(product5.getManufacturePlace());

		product5.setShoppingOnline(true);
		boolean offline5=product5.isShoppingOnline();
		System.out.println(product5.isShoppingOnline());

		product4.setShoppingOffline(true);
		boolean ofliee=product5.isShoppingOffline();
		System.out.println(product5.isShoppingOffline());


		product5.setProductcouriercharge(250);
		System.out.println(product4.getProductcouriercharge());



		System.out.println("2 INSTANCE OF PRODUCT ");

		ProductDTO product6=new ProductDTO();

		product6.setWatch("TITAN");
		System.out.println(product6.getWatch());

		product6.setWatchprice(2000);
		System.out.println(product6.getWatchprice());


		product6.setWatchsize(12);
		System.out.println(product6.getWatchsize());

		product6.setWatchcolour("WHITE");
		System.out.println(product6.getWatchcolour());

		product6.setWeight(123);
		System.out.println(product6.getWeight());

		product6.setWatchshoppingOnline(true);
		boolean offlinew=product6.isWatchshoppingOnline();
		System.out.println(product6.isWatchshoppingOnline());


		product6.setWatchshoppingOffline(true);
		boolean offinew=product6.isWatchshoppingOffline();
		System.out.println(product6.isWatchshoppingOffline());



		product6.setWatchcouriercharge(100);
		System.out.println(product6.getWatchcouriercharge());


       ProductDTO product7=new ProductDTO();

		product7.setWatch("rollex GOLD");
		System.out.println(product7.getWatch());

		product7.setWatchprice(1500);
		System.out.println(product7.getWatchprice());


		product7.setWatchsize(125);
		System.out.println(product7.getWatchsize());

		product7.setWatchcolour("RED");
		System.out.println(product7.getWatchcolour());

		product7.setWeight(623);
		System.out.println(product7.getWeight());

		product7.setWatchshoppingOnline(true);
		boolean ffinew=product7.isWatchshoppingOnline();
		System.out.println(product7.isWatchshoppingOnline());


		product7.setWatchshoppingOffline(false);
		boolean ffinew=product7.isWatchshoppingOffline();
		System.out.println(product7.isWatchshoppingOffline());



		product7.setWatchcouriercharge(1050);
		System.out.println(product7.getWatchcouriercharge());


	    ProductDTO product8=new ProductDTO();

		product8.setWatch("TITAN PLATINUM");
		System.out.println(product8.getWatch());

		product8.setWatchprice(16570);
		System.out.println(product8.getWatchprice());


		product8.setWatchsize(800);
		System.out.println(product8.getWatchsize());

		product8.setWatchcolour("BLACK");
		System.out.println(product8.getWatchcolour());

		product8.setWeight(6238);
		System.out.println(product8.getWeight());

		product8.setWatchshoppingOnline(true);
		boolean offlie=product8.isWatchshoppingOnline();
		System.out.println(product8.isWatchshoppingOnline());


		product8.setWatchshoppingOffline(true);
		boolean offiew=product8.isWatchshoppingOffline();
		System.out.println(product8.isWatchshoppingOffline());



		product8.setWatchcouriercharge(18050);
		System.out.println(product8.getWatchcouriercharge());



		ProductDTO product9=new ProductDTO();

		product9.setWatch(" PLATINUM GOLD RULER ");
		System.out.println(product9.getWatch());

	    product9.setWatchprice(1800);
		System.out.println(product9.getWatchprice());


		product9.setWatchsize(6796);
		System.out.println(product9.getWatchsize());
				
				
		product9.setWatchcolour("GOLD");
		System.out.println(product9.getWatchcolour());

		product9.setWeight(6899);
		System.out.println(product9.getWeight());

		product9.setWatchshoppingOnline(true);
		boolean fflie=product9.isWatchshoppingOnline();
		System.out.println(product9.isWatchshoppingOnline());


		product9.setWatchshoppingOffline(true);
		boolean f9iew=product9.isWatchshoppingOffline();
		System.out.println(product9.isWatchshoppingOffline());



		product9.setWatchcouriercharge(123);
		System.out.println(product8.getWatchcouriercharge());


		System.out.println("3 insatnce of product ");

		
		ProductDTO product10=new ProductDTO();

		product10.setAircooler("LG");
		System.out.println(product10.getAircooler());

		product10.setAircoolerprice(100000);
		System.out.println(product10.getAircoolerprice());

		product10.setAircoolersize(100);
		System.out.println(product10.getAircoolersize());

		product10.setAircoolercolour("GREY");
		System.out.println(product10.getAircoolercolour());


		product10.setAircoolerweight(100.0);
		System.out.println(product10.getAircoolerweight());

		product10.setAircoolerworking(true);
		boolean work=product10.isAircoolerworking();
		System.out.println(product10.isAircoolerworking());

		product10.setAircoolermanufacturePlace("PUNE");
		System.out.println(product10.getAircoolermanufacturePlace());


		product10.setAircoolershoppingOnline(true);
		boolean wiw=product10.isAircoolershoppingOnline();
		System.out.println(product10.isAircoolershoppingOnline());


		product10.setAircoolershoppingOffline(true);
		boolean wiwsr=product10.isAircoolershoppingOffline();
	    System.out.println(product10.isAircoolershoppingOffline());

		product10.setAircoolercouriercharge(1000);
		System.out.println(product10.getAircoolercouriercharge());



         ProductDTO product11=new ProductDTO();

		 product11.setAircooler("VOLTAS");
		 System.out.println(product11.getAircooler());

		 product11.setAircoolerprice(100000);
		 System.out.println(product11.getAircoolerprice());

		 product11.setAircoolersize(100);
		 System.out.println(product11.getAircoolersize());

		 product11.setAircoolercolour("GREEN");
	     System.out.println(product11.getAircoolercolour());


		 product11.setAircoolerweight(140.0);
		 System.out.println(product11.getAircoolerweight());

		 product11.setAircoolerworking(true);
	 	 boolean worDk=product11.isAircoolerworking();
		 System.out.println(product11.isAircoolerworking());

		 product11.setAircoolermanufacturePlace("SOLAPUR");
		 System.out.println(product11.getAircoolermanufacturePlace());


		 product11.setAircoolershoppingOnline(true);
	 	 boolean wEiw=product10.isAircoolershoppingOnline();
		 System.out.println(product11.isAircoolershoppingOnline());


		 product11.setAircoolershoppingOffline(true);
		 boolean wiEwsr=product11.isAircoolershoppingOffline();
		 System.out.println(product11.isAircoolershoppingOffline());

		 product11.setAircoolercouriercharge(1700);
		 System.out.println(product11.getAircoolercouriercharge());


	     ProductDTO product12=new ProductDTO();
	               
		 product12.setAircooler("BLUE PONT");
		 System.out.println(product12.getAircooler());
					
		 product12.setAircoolerprice(10000);
		 System.out.println(product12.getAircoolerprice());

		 product12.setAircoolersize(450);
		 System.out.println(product12.getAircoolersize());

		 product12.setAircoolercolour("WHITE");
		 System.out.println(product12.getAircoolercolour());
 

		 product12.setAircoolerweight(125);
		 System.out.println(product12.getAircoolerweight());

		 product12.setAircoolerworking(false);
	     boolean worDdk=product12.isAircoolerworking();
		 System.out.println(product12.isAircoolerworking());
 
		 product12.setAircoolermanufacturePlace("NANDED");
		 System.out.println(product12.getAircoolermanufacturePlace());

 
		 product12.setAircoolershoppingOnline(true);
		 boolean weEiw=product12.isAircoolershoppingOnline();
		 System.out.println(product12.isAircoolershoppingOnline());


		 product12.setAircoolershoppingOffline(true);
	 	 boolean wieEwsr=product12.isAircoolershoppingOffline();
		 System.out.println(product12.isAircoolershoppingOffline());

		 product12.setAircoolercouriercharge(15300);
		 System.out.println(product12.getAircoolercouriercharge());



		 ProductDTO product13=new ProductDTO();

		product13.setAircooler("VOLTAS DARK");
		System.out.println(product13.getAircooler());
					
		product13.setAircoolerprice(10300);
		System.out.println(product13.getAircoolerprice());

		product13.setAircoolersize(300);
		System.out.println(product13.getAircoolersize());

		product13.setAircoolercolour("BLACK");
		System.out.println(product13.getAircoolercolour());


		product13.setAircoolerweight(135);
		System.out.println(product13.getAircoolerweight());

		product13.setAircoolerworking(true);
		boolean worFDdk=product13.isAircoolerworking();
		System.out.println(product13.isAircoolerworking());
						
		product13.setAircoolermanufacturePlace("KALYAN");
		System.out.println(product13.getAircoolermanufacturePlace());


		product13.setAircoolershoppingOnline(true);
		boolean weFEiw=product13.isAircoolershoppingOnline();
		System.out.println(product13.isAircoolershoppingOnline());


		product13.setAircoolershoppingOffline(true);
		boolean wiFeEwsr=product13.isAircoolershoppingOffline();
		System.out.println(product13.isAircoolershoppingOffline());

		product13.setAircoolercouriercharge(153040);
		System.out.println(product13.getAircoolercouriercharge());



		System.out.println(" 4 Instance of product");

		 ProductDTO product14=new ProductDTO();

		 product14.setWashingMachine("PANASONIC");
		 System.out.println(product14.getWashingMachine());

		 product14.setWashingMachineprice(1000000);
		 System.out.println(product14.getWashingMachineprice());

		 product14.setWashingMachineaircoolercolour("WHITE");
		 System.out.println(product14.getWashingMachineaircoolercolour());


		 product14.setAircoolerweight(123456);
		 System.out.println(product14.getAircoolerweight());

		 product14.setAircoolerworking(true);
		 boolean dudgf=product14.isAircoolerworking();
		 System.out.println(product14.isAircoolerworking());
						 

		 product14.setAircoolermanufacturePlace("DEHLI");
		 System.out.println( product14.getAircoolermanufacturePlace());

		 product14.setAircoolershoppingOnline(true);
		 boolean oidr=product14.isBookshoppingOnline();
		 System.out.println(product14.isBookshoppingOnline());

		 product14.setAircoolershoppingOffline(true);
		 boolean oidsrr=product14.isBookshoppingOffline();
		 System.out.println(product14.isBookshoppingOffline());


		 product14.setAircoolercouriercharge(1500);
		 System.out.println(product14.getAircoolercouriercharge());



						 ProductDTO product15=new ProductDTO();

						 product15.setWashingMachine("VIDEOCON");
						 System.out.println(product15.getWashingMachine());

						 product15.setWashingMachineprice(1000500);
						 System.out.println(product15.getWashingMachineprice());

						 product15.setWashingMachineaircoolercolour("GREY");
						 System.out.println(product15.getWashingMachineaircoolercolour());


						 product15.setAircoolerweight(12356);
						 System.out.println(product15.getAircoolerweight());

						 product15.setAircoolerworking(true);
						 boolean dudgHf=product15.isAircoolerworking();
						 System.out.println(product15.isAircoolerworking());


						 product15.setAircoolermanufacturePlace("DOMBIVALI");
						 System.out.println( product15.getAircoolermanufacturePlace());

						 product15.setAircoolershoppingOnline(true);
						 boolean oGidr=product14.isBookshoppingOnline();
						 System.out.println(product14.isBookshoppingOnline());

						 product15.setAircoolershoppingOffline(true);
						 boolean oHidsrr=product15.isBookshoppingOffline();
						 System.out.println(product15.isBookshoppingOffline());


						 product15.setAircoolercouriercharge(1000);
						 System.out.println(product15.getAircoolercouriercharge());


						 ProductDTO product16=new ProductDTO();

						 product16.setWashingMachine("PANASONIC SMART NEW");
						 System.out.println(product16.getWashingMachine());

						 product16.setWashingMachineprice(10660500);
						 System.out.println(product16.getWashingMachineprice());

						 product16.setWashingMachineaircoolercolour("WHITE-GREEN");
						 System.out.println(product16.getWashingMachineaircoolercolour());


						 product16.setAircoolerweight(18666356);
						 System.out.println(product16.getAircoolerweight());

						 product16.setAircoolerworking(true);
						 boolean du66dgHf=product16.isAircoolerworking();
						 System.out.println(product16.isAircoolerworking());


						 product16.setAircoolermanufacturePlace("LATUR");
						 System.out.println( product16.getAircoolermanufacturePlace());

						 product16.setAircoolershoppingOnline(true);
						 boolean oHGidr=product16.isBookshoppingOnline();
						 System.out.println(product16.isBookshoppingOnline());

						 product16.setAircoolershoppingOffline(true);
						 boolean oHHidsrr=product16.isBookshoppingOffline();
						 System.out.println(product16.isBookshoppingOffline());



						 ProductDTO product17=new ProductDTO();

						 product17.setWashingMachine("LG SMART NEW");
						 System.out.println(product17.getWashingMachine());

						 product17.setWashingMachineprice(107660500);
						 System.out.println(product17.getWashingMachineprice());

						 product17.setWashingMachineaircoolercolour("GREY BLACK");
						 System.out.println(product16.getWashingMachineaircoolercolour());


						 product17.setAircoolerweight(127666356);
						 System.out.println(product17.getAircoolerweight());

						 product17.setAircoolerworking(true);
						 boolean d7u66dgHf=product17.isAircoolerworking();
						 System.out.println(product17.isAircoolerworking());


						 product17.setAircoolermanufacturePlace("AURANGABAD");
						 System.out.println( product17.getAircoolermanufacturePlace());

						 product17.setAircoolershoppingOnline(true);
						 boolean o7HGidr=product17.isBookshoppingOnline();
						 System.out.println(product17.isBookshoppingOnline());

						 product17.setAircoolershoppingOffline(true);
						 boolean oHHidsrJr=product17.isBookshoppingOffline();
						 System.out.println(product17.isBookshoppingOffline());


						 product17.setAircoolercouriercharge(1700);
						 System.out.println(product17.getAircoolercouriercharge());

					
						 System.out.println("5 instance of product");

						 ProductDTO product18=new ProductDTO();

						 product18.setBook("JAVA THE HERBERT SCHILDT");
						 System.out.println( product18.getBook());

						 product18.setBookprice(12345);
						 System.out.println(product18.getBookprice());

						 product18.setColour("RED");
						 System.out.println( product18.getColour());

						 product18.setBookweight(1234);
						 System.out.println(product18.getBookweight());

						 product18.setBookworking(true);
						 boolean dugn=product18.isBookworking();
						System.out.println(product18.isBookworking());


						product18.setAircoolermanufacturePlace("ANANTHAPURAM");
						System.out.println(product18.getAircoolermanufacturePlace());

						product18.setBookshoppingOnline(true);
						boolean srjf=product18.isBookshoppingOnline();
						System.out.println(product18.isBookshoppingOnline());

						product18.setBookshoppingOffline(false);
						boolean srjff=product18.isBookshoppingOffline();
						System.out.println(product18.isBookshoppingOffline());

						product18.setBookcouriercharge(17745);
						System.out.println(product18.getBookcouriercharge(1234655));



                         ProductDTO product19=new ProductDTO();

						 product19.setBook("JAVA THE HERBERT SCHILDT");
						 System.out.println( product19.getBook());

						 product19.setBookprice(12395);
						 System.out.println(product19.getBookprice());

						 product19.setColour("ORANGE");
						 System.out.println( product19.getColour());

						 product19.setBookweight(1234);
						 System.out.println(product19.getBookweight());

						 product19.setBookworking(true);
						 boolean dyugn=product19.isBookworking();
						System.out.println(product19.isBookworking());


						product19.setAircoolermanufacturePlace("SANGLI");
						System.out.println(product19.getAircoolermanufacturePlace());

						product19.setBookshoppingOnline(true);
						boolean sHrjf=product19.isBookshoppingOnline();
						System.out.println(product19.isBookshoppingOnline());

						product19.setBookshoppingOffline(false);
						boolean srjGff=product19.isBookshoppingOffline();
						System.out.println(product19.isBookshoppingOffline());

						product19.setBookcouriercharge(12395);
						System.out.println(product19.getBookcouriercharge(1234655));


						ProductDTO product20=new ProductDTO();

						 product20.setBook("BHAGVADGEETA");
						 System.out.println( product20.getBook());

						 product20.setBookprice(123925);
						 System.out.println(product20.getBookprice());

						 product20.setColour("YELLOW");
						 System.out.println( product20.getColour());

						 product20.setBookweight(419234);
						 System.out.println(product20.getBookweight());

						 product20.setBookworking(false);
						 boolean dfyugn=product20.isBookworking();
						System.out.println(product20.isBookworking());


						product20.setAircoolermanufacturePlace("PANDHARPUR");
						System.out.println(product20.getAircoolermanufacturePlace());

						product20.setBookshoppingOnline(true);
						boolean sHfrjf=product20.isBookshoppingOnline();
						System.out.println(product20.isBookshoppingOnline());

						product20.setBookshoppingOffline(false);
						boolean s2rjGff=product20.isBookshoppingOffline();
						System.out.println(product20.isBookshoppingOffline());

						product20.setBookcouriercharge(123495);
						System.out.println(product20.getBookcouriercharge(1234655));


						ProductDTO product21=new ProductDTO();

						 product21.setBook("RAMAYANAM");
						 System.out.println( product21.getBook());

						 product21.setBookprice(1213925);
						 System.out.println(product21.getBookprice());

						 product21.setColour("ORANGE-YELLOW");
						 System.out.println( product21.getColour());

						 product21.setBookweight(419434);
						 System.out.println(product21.getBookweight());

						 product21.setBookworking(true);
						 boolean ddfyugn=product21.isBookworking();
						System.out.println(product21.isBookworking());


						product21.setAircoolermanufacturePlace("AYODHYA");
						System.out.println(product21.getAircoolermanufacturePlace());

						product21.setBookshoppingOnline(true);
						boolean s2Hfrjf=product21.isBookshoppingOnline();
						System.out.println(product21.isBookshoppingOnline());

						product21.setBookshoppingOffline(false);
						boolean s2wrjGff=product21.isBookshoppingOffline();
						System.out.println(product21.isBookshoppingOffline());

						product21.setBookcouriercharge(1234954);
						System.out.println(product21.getBookcouriercharge(1234655));



						System.out.println(" 5 Instsnce of the product");
						ProductDTO product22=new ProductDTO();


						product22.setLaptop("DELL");
						System.out.println(product22.getLaptop());

						product22.setLaptopprice(2345678);
						System.out.println(product22.getLaptopprice());

						product22.setLaptopcolour("BLACK");
						System.out.println(product22.getLaptopcolour());

						product22.setLaptopweight(125);
						System.out.println(product22.getLaptopweight());

						product22.setLaptopworking(true);
						boolean dgh=product22.isLaptopworking();
						System.out.println(product22.isLaptopworking());

						product22.setLaptopmanufacturePlace("MUMBAI");
						System.out.println(product22.getLaptopmanufacturePlace());

						product22.setLaptopshoppingOffline(true);
						boolean fjufjf=	product22.isLaptopshoppingOffline();
						System.out.println(product22.isLaptopshoppingOffline());

						product22.setLaptopshoppingOnline(false);
						boolean dujgf=product22.isLaptopshoppingOnline();
						System.out.println(product22.isLaptopshoppingOnline());

						product22.setLaptopcharge(4);
						System.out.println(product22.getLaptopcharge());


						ProductDTO product23=new ProductDTO();

						product23.setLaptop("HP");
						System.out.println(product23.getLaptop());

						product23.setLaptopprice(1245678);
						System.out.println(product23.getLaptopprice());

						product23.setLaptopcolour("SILVER");
						System.out.println(product23.getLaptopcolour());

						product23.setLaptopweight(1523);
						System.out.println(product23.getLaptopweight());

						product23.setLaptopworking(true);
						boolean dgtgh=product23.isLaptopworking();
						System.out.println(product23.isLaptopworking());

						product23.setLaptopmanufacturePlace("KALYAN");
						System.out.println(product23.getLaptopmanufacturePlace());

						product23.setLaptopshoppingOffline(true);
						boolean fGjufjf=	product23.isLaptopshoppingOffline();
						System.out.println(product23.isLaptopshoppingOffline());

						product23.setLaptopshoppingOnline(false);
						boolean dRujgf=product23.isLaptopshoppingOnline();
						System.out.println(product23.isLaptopshoppingOnline());

						product23.setLaptopcharge(4);
						System.out.println(product23.getLaptopcharge());


                       ProductDTO product24=new ProductDTO();

						product24.setLaptop("LENOVA");
						System.out.println(product24.getLaptop());

						product24.setLaptopprice(145678);
						System.out.println(product24.getLaptopprice());

						product24.setLaptopcolour("BLACK");
						System.out.println(product24.getLaptopcolour());

						product24.setLaptopweight(523);
						System.out.println(product24.getLaptopweight());

						product24.setLaptopworking(true);
						boolean dGgtgh=product24.isLaptopworking();
						System.out.println(product24.isLaptopworking());

						product24.setLaptopmanufacturePlace("BANDRA");
						System.out.println(product24.getLaptopmanufacturePlace());

						product24.setLaptopshoppingOffline(true);
						boolean fGGjufjf=product24.isLaptopshoppingOffline();
						System.out.println(product24.isLaptopshoppingOffline());

						product24.setLaptopshoppingOnline(false);
						boolean dRGujgf=product24.isLaptopshoppingOnline();
						System.out.println(product24.isLaptopshoppingOnline());

						product24.setLaptopcharge(4);
						System.out.println(product24.getLaptopcharge());



                       ProductDTO product25=new ProductDTO();

                       product25.setLaptop("DELL probook");
						System.out.println(product25.getLaptop());

						product25.setLaptopprice(145678);
						System.out.println(product25.getLaptopprice());

						product25.setLaptopcolour("GOLD");
						System.out.println(product25.getLaptopcolour());

						product25.setLaptopweight(154423);
						System.out.println(product25.getLaptopweight());

						product25.setLaptopworking(true);
						boolean dGGgtgh=product25.isLaptopworking();
						System.out.println(product25.isLaptopworking());

						product25.setLaptopmanufacturePlace("BADLAPUR");
						System.out.println(product25.getLaptopmanufacturePlace());

						product25.setLaptopshoppingOffline(true);
						boolean fGGjGufjf=	product25.isLaptopshoppingOffline();
						System.out.println(product25.isLaptopshoppingOffline());

						product25.setLaptopshoppingOnline(false);
						boolean dHRGGujgf=product25.isLaptopshoppingOnline();
						System.out.println(product25.isLaptopshoppingOnline());

						product25.setLaptopcharge(4);
						System.out.println(product25.getLaptopcharge());


						System.out.println(" 6 instance of product");


						 ProductDTO product26=new ProductDTO();


						 product26.setGasStove("ELICA SMART");
						 System.out.println(product26.getGasStove());

						 product26.setGasStoveprice(127890);
						 System.out.println(product26.getGasStoveprice());


						 product26.setGasStovesize(123);
						 System.out.println( product26.getGasStovesize());

						 product26.setGasStovecolour("RED");
						 System.out.println(product26.getGasStovecolour());


						 product26.setGasStoveweight(123);
						 System.out.println(product26.getGasStoveweight());

						 product26.setGasStoveworking(true);
						 boolean djgtu= product26.isGasStoveworking();
						 System.out.println( product26.isGasStoveworking());


						 product26.setGasStovemanufacturePlace("AKOLA");
						 System.out.println( product26.getGasStovemanufacturePlace());


						 product26.setGasStoveshoppingOffline(true);
						 boolean sjf= product26.isGasStoveshoppingOffline();
						 System.out.println( product26.isGasStoveshoppingOffline());

						 product26.setGasStoveshoppingOnline(false);
						 boolean sdfdjf= product26.isGasStoveshoppingOnline();
						 System.out.println( product26.isGasStoveshoppingOnline());

						 product26.setGasStovecharge(3);
						 System.out.println( product26.getGasStovecharge());




                        ProductDTO product27=new ProductDTO();


						 product27.setGasStove("ELICA");
						 System.out.println(product27.getGasStove());

						 product27.setGasStoveprice(1234567890);
						 System.out.println(product27.getGasStoveprice());


						 product27.setGasStovesize(1723);
						 System.out.println( product27.getGasStovesize());

						 product27.setGasStovecolour("WHITE");
						 System.out.println(product27.getGasStovecolour());


						 product27.setGasStoveweight(71);
						 System.out.println(product27.getGasStoveweight());

						 product27.setGasStoveworking(true);
						 boolean djjgtu= product27.isGasStoveworking();
						 System.out.println( product27.isGasStoveworking());


						 product27.setGasStovemanufacturePlace("PUNE");
						 System.out.println( product27.getGasStovemanufacturePlace());


						 product27.setGasStoveshoppingOffline(true);
						 boolean sjjjf= product27.isGasStoveshoppingOffline();
						 System.out.println( product27.isGasStoveshoppingOffline());

						 product27.setGasStoveshoppingOnline(false);
						 boolean sjjdfdjf= product27.isGasStoveshoppingOnline();
						 System.out.println( product27.isGasStoveshoppingOnline());

						 product27.setGasStovecharge(7);
						 System.out.println( product27.getGasStovecharge());


                        ProductDTO product28=new ProductDTO();


						 product28.setGasStove("ELICA SMART");
						 System.out.println(product28.getGasStove());

						 product28.setGasStoveprice(127890);
						 System.out.println(product28.getGasStoveprice());


						 product28.setGasStovesize(13);
						 System.out.println( product28.getGasStovesize());

						 product28.setGasStovecolour("SILVER");
						 System.out.println(product28.getGasStovecolour());


						 product28.setGasStoveweight(182);
						 System.out.println(product28.getGasStoveweight());

						 product28.setGasStoveworking(true);
						 boolean djgtKKu= product28.isGasStoveworking();
						 System.out.println( product28.isGasStoveworking());


						 product28.setGasStovemanufacturePlace("VADODARA");
						 System.out.println( product26.getGasStovemanufacturePlace());


						 product28.setGasStoveshoppingOffline(true);
						 boolean sKKjf= product28.isGasStoveshoppingOffline();
						 System.out.println( product28.isGasStoveshoppingOffline());

						 product28.setGasStoveshoppingOnline(false);
						 boolean sKKdfdjf= product28.isGasStoveshoppingOnline();
						 System.out.println( product28.isGasStoveshoppingOnline());

						 product28.setGasStovecharge(1);
						 System.out.println( product28.getGasStovecharge());

						  ProductDTO product29=new ProductDTO();


							 product29.setGasStove("piegion SMART");
							 System.out.println(product29.getGasStove());

							 product29.setGasStoveprice(1880);
							 System.out.println(product29.getGasStoveprice());


							 product29.setGasStovesize(1923);
							 System.out.println( product29.getGasStovesize());

							 product29.setGasStovecolour("BLACK");
							 System.out.println(product29.getGasStovecolour());


							 product29.setGasStoveweight(1783);
							 System.out.println(product29.getGasStoveweight());

							 product29.setGasStoveworking(true);
							 boolean dj9gtKKu= product29.isGasStoveworking();
							 System.out.println( product29.isGasStoveworking());


							 product29.setGasStovemanufacturePlace("AHEMADABAD");
							 System.out.println( product29.getGasStovemanufacturePlace());


							 product29.setGasStoveshoppingOffline(true);
							 boolean sKKKKjf= product29.isGasStoveshoppingOffline();
							 System.out.println( product29.isGasStoveshoppingOffline());

							 product29.setGasStoveshoppingOnline(false);
							 boolean sLKKdfdjf= product29.isGasStoveshoppingOnline();
							 System.out.println( product29.isGasStoveshoppingOnline());

							 product29.setGasStovecharge(19);
							 System.out.println( product29.getGasStovecharge());



					System.out.println("Final instance of Product");
					ProductDTO product30=new ProductDTO();

			      product30.setTshirt("POLO");
			      System.out.println(product30.getTshirt());

			      product30.setTshirtprice(30);
			      System.out.println(product30.getTshirtprice());

			      product30.setTshirtweight(1236);
			      System.out.println(product30.getTshirtweight());

			      product30.setTshirtcolour("BLUE");
			      System.out.println( product30.getTshirtcolour());

			      product30.setTshirtweight(100);
			      System.out.println(product30.getTshirtweight());

			      product30.setTshirtworking(true);
			      boolean wogrking=product30.isTshirtworking();
			      System.out.println(product30.isTshirtworking());


			      product30.setTshirtmanufacturePlace("ULHASNAGAR");
			      System.out.println(product30.getTshirtmanufacturePlace());

			      product30.setTshirtshoppingOffline(true);
			      boolean wogrkifng=product30.isTshirtshoppingOffline();
			      System.out.println(product30.isTshirtshoppingOffline());


			      product30.setTshirtshoppingOnline(true);
			      boolean wogrkigfng=product30.isTshirtshoppingOnline();
			      System.out.println(product30.isTshirtshoppingOnline());

			      product30.setTshirtcharge(100);
			      System.out.println(product30.getTshirtcharge());


			      ProductDTO product31=new ProductDTO();

			      product31.setTshirt("POLO SLIM WEAR");
			      System.out.println(product31.getTshirt());

			      product31.setTshirtprice(31);
			      System.out.println(product31.getTshirtprice());

			      product31.setTshirtweight(13256);
			      System.out.println(product31.getTshirtweight());

			      product31.setTshirtcolour("RED");
			      System.out.println( product31.getTshirtcolour());

			      product31.setTshirtweight(1400);
			      System.out.println(product31.getTshirtweight());

			      product31.setTshirtworking(true);
			      boolean wEogrking=product31.isTshirtworking();
			      System.out.println(product31.isTshirtworking());


			      product31.setTshirtmanufacturePlace("JALNA");
			      System.out.println(product31.getTshirtmanufacturePlace());

			      product31.setTshirtshoppingOffline(true);
			      boolean wDogrkifng=product31.isTshirtshoppingOffline();
			      System.out.println(product31.isTshirtshoppingOffline());


			      product31.setTshirtshoppingOnline(true);
			      boolean woDgrkigfng=product31.isTshirtshoppingOnline();
			      System.out.println(product31.isTshirtshoppingOnline());

			      product31.setTshirtcharge(100);
			      System.out.println(product31.getTshirtcharge());


	   ProductDTO product32=new ProductDTO();

	   product32.setTshirt("POLO");
	   System.out.println(product32.getTshirt());

	   product32.setTshirtprice(32);
	   System.out.println(product32.getTshirtprice());

	   product32.setTshirtweight(232346);
	   System.out.println(product32.getTshirtweight());

	   product32.setTshirtcolour("WHITE");
	   System.out.println( product32.getTshirtcolour());

	   product32.setTshirtweight(12400);
	   System.out.println(product32.getTshirtweight());

	   product32.setTshirtworking(false);
       boolean wEdogrking=product32.isTshirtworking();
	   System.out.println(product32.isTshirtworking());


	   product32.setTshirtmanufacturePlace("MUMBAI");
	   System.out.println(product31.getTshirtmanufacturePlace());

	   product32.setTshirtshoppingOffline(true);
	   boolean wdDogrkifng=product32.isTshirtshoppingOffline();
	   System.out.println(product32.isTshirtshoppingOffline());


	   product32.setTshirtshoppingOnline(true);
	   boolean wdoDgrkigfng=product32.isTshirtshoppingOnline();
	   System.out.println(product32.isTshirtshoppingOnline());

	   product32.setTshirtcharge(100);
       System.out.println(product32.getTshirtcharge());



	   ProductDTO product33=new ProductDTO();

       product33.setTshirt("PUMA COAT");
	   System.out.println(product33.getTshirt());

	   product33.setTshirtprice(33);
	   System.out.println(product33.getTshirtprice());

	   product33.setTshirtweight(13323456);
	   System.out.println(product33.getTshirtweight());

	   product33.setTshirtcolour("BLUE");
	   System.out.println( product33.getTshirtcolour());

	   product33.setTshirtweight(1430);
	   System.out.println(product33.getTshirtweight());

	   product33.setTshirtworking(false);
	   boolean wEfogrking=product33.isTshirtworking();
	   System.out.println(product33.isTshirtworking());


	   product33.setTshirtmanufacturePlace("AKOLA");
	   System.out.println(product33.getTshirtmanufacturePlace());

	   product33.setTshirtshoppingOffline(true);
	   boolean wFDogrkifng=product33.isTshirtshoppingOffline();
	   System.out.println(product33.isTshirtshoppingOffline());


	   product33.setTshirtshoppingOnline(false);
	   boolean woDgrfkigfng=product33.isTshirtshoppingOnline();
	   System.out.println(product33.isTshirtshoppingOnline());

	   product33.setTshirtcharge(200);
	   System.out.println(product33.getTshirtcharge());

      
	}
	
}


	