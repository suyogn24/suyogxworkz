package com.xworkz.encapsulation.dto;

public class ProductDTO {
	
	private String phone="SAMSUNG";
	private int price;
	private int size;
	private String colour;
	private double weight;
	private boolean working;
	private String manufacturePlace;
	private boolean shoppingOnline;
	private boolean shoppingOffline;
	private int productcouriercharge;


	private String watch="ROLEX";
	private int watchprice;
	private int watchsize;
	private String watchcolour;
	private double watchweight;
	private boolean watchworking;
	private String watchmanufacturePlace;
	private boolean watchshoppingOnline;
	private boolean watchshoppingOffline;
	private int watchcouriercharge;


	private String aircooler="VOLTAS";
    private int aircoolerprice;
	private int aircoolersize;
	private String aircoolercolour;
	private double aircoolerweight;
	private boolean aircoolerworking;
	private String aircoolermanufacturePlace;
	private boolean aircoolershoppingOnline;
	private boolean aircoolershoppingOffline;
	private int aircoolercouriercharge;

    private String washingMachine="VIDEOCON";
    private int washingMachineprice;
	private int washingMachineaircoolersize;
	private String washingMachineaircoolercolour;
	private double washingMachineaircoolerweight;
	private boolean  washingMachineaircoolerworking;
	private String washingMachineaircoolermanufacturePlace;
	private boolean washingMachineaircoolershoppingOnline;
	private boolean washingMachineaircoolershoppingOffline;
	private int washingMachineaircoolercouriercharge;

	private String Book="JAVA";
	private int Bookprice;
	private int Bookcoolersize;
	private String Bookcolour;
	private double Bookweight;
	private boolean  Bookworking;
	private String BookmanufacturePlace;
	private boolean BookshoppingOnline;
	private boolean BookshoppingOffline;
	private int Bookcouriercharge;


	private String Laptop="DELL";
	private int Laptopprice;
	private int Laptopsize;
	private String Laptopcolour;
	private double Laptopweight;
	private boolean  Laptopworking;
	private String LaptopmanufacturePlace;
	private boolean LaptopshoppingOffline;
	private boolean LaptopshoppingOnline;
	private int Laptopcharge;


	private String gasStove="ELICA";
	private int gasStoveprice;
	private int gasStovesize;
	private String gasStovecolour;
	private double gasStoveweight;
	private boolean  gasStoveworking;
	private String gasStovemanufacturePlace;
	private boolean gasStoveshoppingOffline;
	private boolean gasStoveshoppingOnline;
	private int gasStovecharge;

	private String Tshirt="PUMA";
	private int Tshirtprice;
	private int Tshirtsize;
	private String Tshirtcolour;
	private double Tshirtweight;
	private boolean Tshirtworking;
	private String TshirtmanufacturePlace;
	private boolean TshirtshoppingOffline;
	private boolean TshirtshoppingOnline;
	private int Tshirtcharge;


	public ProductDTO() {

	System.out.println("RUNNING productDTO default constructor");
	}


	public String  getPhone() {

		return phone;
	}

	public void setPhone(String phone) {
		this.phone=phone;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public double getWeight() {
		return weight;
	}


	public double  setWeight(double weight) {
		return this.weight = weight;
	}

	public boolean isWorking() {
		return working;
	}
	public void setWorking(boolean working) {
		this.working = working;
	}


	public String getManufacturePlace() {
		return manufacturePlace;
	}

	public void setManufacturePlace(String manufacturePlace) {
		this.manufacturePlace = manufacturePlace;
	}

	public boolean isShoppingOnline() {
		return shoppingOnline;
	}

	public void setShoppingOnline(boolean shoppingOnline) {
		this.shoppingOnline = shoppingOnline;
	}

	public boolean isShoppingOffline() {
		return shoppingOffline;
	}

	public void setShoppingOffline(boolean shoppingOffline) {
		this.shoppingOffline = shoppingOffline;
	}


	public int getProductcouriercharge() {
		return productcouriercharge;
	}

	public void setProductcouriercharge(int productcouriercharge) {
		this.productcouriercharge = productcouriercharge;
	}



	public String getWatch() {
		return watch;
	}

	public void setWatch(String watch) {
		this.watch = watch;
	}

	public int getWatchprice() {
		return watchprice;
	}

	public void setWatchprice(int watchprice) {
		this.watchprice = watchprice;
	}


	public int getWatchsize() {
		return watchsize;
	}

	public void setWatchsize(int watchsize) {
		this.watchsize = watchsize;
	}

	public String getWatchcolour() {
		return watchcolour;
	}

	public void setWatchcolour(String watchcolour) {
		this.watchcolour = watchcolour;
	}


	public double getWatchweight() {
		return watchweight;
	}

	public void setWatchweight(double watchweight) {
		this.watchweight = watchweight;
	}


	public boolean isWatchworking() {
		return watchworking;
	}

	public void setWatchworking(boolean watchworking) {
		this.watchworking = watchworking;
	}

	public void setBookmanufacturePlace(String bookmanufacturePlace) {
		BookmanufacturePlace = bookmanufacturePlace;
	}

	public String getAircooler() {
		return aircooler;
	}


	public boolean isWatchshoppingOnline() {
		return watchshoppingOnline;
	}

	public void setWatchshoppingOnline(boolean watchshoppingOnline) {
		this.watchshoppingOnline = watchshoppingOnline;
	}

	public void setWatchshoppingOffline(boolean watchshoppingOffline) {
		this.watchshoppingOffline = watchshoppingOffline;
	}


	public int getWatchcouriercharge() {
		return watchcouriercharge;
	}

	public void setWatchcouriercharge(int watchcouriercharge) {
		this.watchcouriercharge = watchcouriercharge;
	}


	public String getAircoolercolour() {
		return aircoolercolour;
	}

	public void setAircooler(String aircooler) {
		this.aircooler = aircooler;
	}

	public int getAircoolerprice() {
		return aircoolerprice;
	}

	public void setAircoolerprice(int aircoolerprice) {
		this.aircoolerprice = aircoolerprice;
	}

	public int getAircoolersize() {
		return aircoolersize;
	}

	public void setAircoolersize(int aircoolersize) {
		this.aircoolersize = aircoolersize;
	}

	public void setAircoolercolour(String aircoolercolour) {
		this.aircoolercolour = aircoolercolour;
	}


	public double getAircoolerweight() {
		return aircoolerweight;
	}

	public void setAircoolerweight(double aircoolerweight) {
		this.aircoolerweight = aircoolerweight;
	}

	public boolean isAircoolerworking() {
		return aircoolerworking;
	}

	public void setAircoolerworking(boolean aircoolerworking) {
		this.aircoolerworking = aircoolerworking;
	}

	public String getAircoolermanufacturePlace() {
		return aircoolermanufacturePlace;
	}

	public void setAircoolermanufacturePlace(String aircoolermanufacturePlace) {
		this.aircoolermanufacturePlace = aircoolermanufacturePlace;
	}



	public boolean isAircoolershoppingOnline() {
		return aircoolershoppingOnline;
	}

	public void setAircoolershoppingOnline(boolean aircoolershoppingOnline) {
		this.aircoolershoppingOnline = aircoolershoppingOnline;
	}

	public boolean isAircoolershoppingOffline() {
		return aircoolershoppingOffline;
	}

	public void setAircoolershoppingOffline(boolean aircoolershoppingOffline) {
		this.aircoolershoppingOffline = aircoolershoppingOffline;
	}

	public int getAircoolercouriercharge() {
		return aircoolercouriercharge;
	}

	public void setAircoolercouriercharge(int aircoolercouriercharge) {
		this.aircoolercouriercharge = aircoolercouriercharge;
	}


	public String getWashingMachine() {
		return washingMachine;
	}

	public void setWashingMachine(String washingMachine) {
		this.washingMachine = washingMachine;
	}

	public int getWashingMachineprice() {
		return washingMachineprice;
	}

	public void setWashingMachineprice(int washingMachineprice) {
		this.washingMachineprice = washingMachineprice;
	}

	public int getWashingMachineaircoolersize() {
		return washingMachineaircoolersize;
	}

	public void setWashingMachineaircoolersize(int washingMachineaircoolersize) {
		this.washingMachineaircoolersize = washingMachineaircoolersize;
	}

	public String getWashingMachineaircoolercolour() {
		return washingMachineaircoolercolour;
	}

	public void setWashingMachineaircoolercolour(String washingMachineaircoolercolour) {
		this.washingMachineaircoolercolour = washingMachineaircoolercolour;
	}

	public double getWashingMachineaircoolerweight() {
		return washingMachineaircoolerweight;
	}

	public void setWashingMachineaircoolerweight(double washingMachineaircoolerweight) {
		this.washingMachineaircoolerweight = washingMachineaircoolerweight;
	}

	public boolean isWashingMachineaircoolerworking() {
		return washingMachineaircoolerworking;
	}

	public void setWashingMachineaircoolerworking(boolean washingMachineaircoolerworking) {
		this.washingMachineaircoolerworking = washingMachineaircoolerworking;
	}


	public String getWashingMachineaircoolermanufacturePlace() {
		return washingMachineaircoolermanufacturePlace;
	}

	public void setWashingMachineaircoolermanufacturePlace(String washingMachineaircoolermanufacturePlace) {
		this.washingMachineaircoolermanufacturePlace = washingMachineaircoolermanufacturePlace;
	}

	public boolean isWashingMachineaircoolershoppingOnline() {
		return washingMachineaircoolershoppingOnline;
	}
	public void setWashingMachineaircoolershoppingOnline(boolean washingMachineaircoolershoppingOnline) {
		this.washingMachineaircoolershoppingOnline = washingMachineaircoolershoppingOnline;
	}



	public boolean isWashingMachineaircoolershoppingOffline() {
		return washingMachineaircoolershoppingOffline;
	}


	public void setWashingMachineaircoolershoppingOffline(boolean washingMachineaircoolershoppingOffline) {
		this.washingMachineaircoolershoppingOffline = washingMachineaircoolershoppingOffline;
	}


	public int getWashingMachineaircoolercouriercharge() {
		return washingMachineaircoolercouriercharge;
	}

	public void setWashingMachineaircoolercouriercharge(int washingMachineaircoolercouriercharge) {
		this.washingMachineaircoolercouriercharge = washingMachineaircoolercouriercharge;
	}



	public String getBook() {
		return Book;
	}

	public void setBook(String book) {
		Book = book;
	}

	public int getBookprice() {
		return Bookprice;
	}

	public void setBookprice(int bookprice) {
		Bookprice = bookprice;
	}


	public int getBookcoolersize() {
		return Bookcoolersize;
	}

	public void setBookcoolersize(int bookcoolersize) {
		Bookcoolersize = bookcoolersize;
	}


	public String getBookcolour() {
		return Bookcolour;
	}

	public void setBookcolour(String bookcolour) {
		Bookcolour = bookcolour;
	}


	public double getBookweight() {
		return Bookweight;
	}

	public void setBookweight(double bookweight) {
		Bookweight = bookweight;
	}


	public boolean isBookworking() {
		return Bookworking;
	}

	public void setBookworking(boolean bookworking) {
		Bookworking = bookworking;
	}



	public String getBookmanufacturePlace() {
		return BookmanufacturePlace;
	}

	public void setBookmanufacturePlace1(String BookmanufacturePlace) {

		this.BookmanufacturePlace=BookmanufacturePlace;
	}

	public boolean isBookshoppingOnline() {
		return BookshoppingOnline;
	}

	public void setBookshoppingOnline(boolean bookshoppingOnline) {
		BookshoppingOnline = bookshoppingOnline;
	}



	public boolean isBookshoppingOffline() {
	return BookshoppingOffline;
  }

	public void setBookshoppingOffline(boolean bookshoppingOffline) {
		BookshoppingOffline = bookshoppingOffline;
	}


	public int getBookcouriercharge(int i) {
		return Bookcouriercharge;
	}


	public void setBookcouriercharge(int bookcouriercharge) {
		Bookcouriercharge = bookcouriercharge;
	}




	public String getLaptop() {
		return Laptop;
	}

	public void setLaptop(String laptop) {
		Laptop = laptop;
	}

	public int getLaptopprice() {
		return Laptopprice;
	}

	public void setLaptopprice(int laptopprice) {
		Laptopprice = laptopprice;
	}


	public int getLaptopsize() {
		return Laptopsize;
	}

	public void setLaptopsize(int laptopsize) {
		Laptopsize = laptopsize;
	}


	public String getLaptopcolour() {
		return Laptopcolour;
	}


	public void setLaptopcolour(String laptopcolour) {
		Laptopcolour = laptopcolour;
	}


	public double getLaptopweight() {
		return Laptopweight;
	}

	public void setLaptopweight(double laptopweight) {
		Laptopweight = laptopweight;
	}


	public boolean isLaptopworking() {
		return Laptopworking;
	}

	public void setLaptopworking(boolean laptopworking) {
		Laptopworking = laptopworking;
	}


	public String getLaptopmanufacturePlace() {
		return LaptopmanufacturePlace;
	}

	public void setLaptopmanufacturePlace(String laptopmanufacturePlace) {
		LaptopmanufacturePlace = laptopmanufacturePlace;
	}


	public boolean isLaptopshoppingOffline() {
		return LaptopshoppingOffline;
	}

	public void setLaptopshoppingOffline(boolean laptopshoppingOffline) {
		LaptopshoppingOffline = laptopshoppingOffline;
	}


	public boolean isLaptopshoppingOnline() {
		return LaptopshoppingOnline;
	}

	public void setLaptopshoppingOnline(boolean laptopshoppingOnline) {
		LaptopshoppingOnline = laptopshoppingOnline;
	}

	public int getLaptopcharge() {
		return Laptopcharge;
	}

	public void setLaptopcharge(int laptopcharge) {
		Laptopcharge = laptopcharge;
	}



	public String getGasStove() {
		return gasStove;
	}

	public void setGasStove(String gasStove) {
		this.gasStove = gasStove;
	}


	public int getGasStoveprice() {
		return gasStoveprice;
	}

	public void setGasStoveprice(int gasStoveprice) {
		this.gasStoveprice = gasStoveprice;
	}


	public int getGasStovesize() {
		return gasStovesize;
	}


	public void setGasStovesize(int gasStovesize) {
		this.gasStovesize = gasStovesize;
	}


	public String getGasStovecolour() {
	return gasStovecolour;
   }

	public void setGasStovecolour(String gasStovecolour) {
		this.gasStovecolour = gasStovecolour;
	}

	public double getGasStoveweight() {
		return gasStoveweight;
	}


	public void setGasStoveweight(double gasStoveweight) {
		this.gasStoveweight = gasStoveweight;
	}


	public boolean isGasStoveworking() {
		return gasStoveworking;
	}

	public void setGasStoveworking(boolean gasStoveworking) {
		this.gasStoveworking = gasStoveworking;
	}


	public String getGasStovemanufacturePlace() {
		return gasStovemanufacturePlace;
	}

	public void setGasStovemanufacturePlace(String gasStovemanufacturePlace) {
		this.gasStovemanufacturePlace = gasStovemanufacturePlace;
	}


	public boolean isGasStoveshoppingOffline() {
		return gasStoveshoppingOffline;
	}


	public void setGasStoveshoppingOffline(boolean gasStoveshoppingOffline) {
		this.gasStoveshoppingOffline = gasStoveshoppingOffline;
	}

	public boolean isGasStoveshoppingOnline() {
		return gasStoveshoppingOnline;
	}

	public void setGasStoveshoppingOnline(boolean gasStoveshoppingOnline) {
		this.gasStoveshoppingOnline = gasStoveshoppingOnline;
	}

	public int getGasStovecharge() {
		return gasStovecharge;
	}

	public void setGasStovecharge(int gasStovecharge) {
		this.gasStovecharge = gasStovecharge;
	}



	public String getTshirt() {
		return Tshirt;
	}

	public void setTshirt(String tshirt) {
		Tshirt = tshirt;
	}

	public int getTshirtprice() {
		return Tshirtprice;
	}

	public void setTshirtprice(int tshirtprice) {
		Tshirtprice = tshirtprice;
	}


	public int getTshirtsize() {
		return Tshirtsize;
	}


	public void setTshirtsize(int tshirtsize) {
		Tshirtsize = tshirtsize;
	}


	public void setTshirtcolour(String tshirtcolour) {
		Tshirtcolour = tshirtcolour;
	}

	public String getTshirtcolour() {
		return Tshirtcolour;
	}

	public double getTshirtweight() {
		return Tshirtweight;
	}


	public void setTshirtweight(double tshirtweight) {
		Tshirtweight = tshirtweight;
	}

	public boolean isTshirtworking() {
		return Tshirtworking;
	}

	public void setTshirtworking(boolean tshirtworking) {
		Tshirtworking = tshirtworking;
	}

	public String getTshirtmanufacturePlace() {
		return TshirtmanufacturePlace;
	}

	public void setTshirtmanufacturePlace(String tshirtmanufacturePlace) {
		TshirtmanufacturePlace = tshirtmanufacturePlace;
	}


	public boolean isTshirtshoppingOffline() {
		return TshirtshoppingOffline;
	}

	public void setTshirtshoppingOffline(boolean tshirtshoppingOffline) {
		TshirtshoppingOffline = tshirtshoppingOffline;
	}


	public boolean isTshirtshoppingOnline() {
		return TshirtshoppingOnline;
	}

	public void setTshirtshoppingOnline(boolean tshirtshoppingOnline) {
		TshirtshoppingOnline = tshirtshoppingOnline;
	}

	public boolean isWatchshoppingOffline() {
		return watchshoppingOffline;
	}

	public void setTshirtcharge(int tshirtcharge) {
		Tshirtcharge = tshirtcharge;
	}


	public int getTshirtcharge() {
		return Tshirtcharge;
	}

}
