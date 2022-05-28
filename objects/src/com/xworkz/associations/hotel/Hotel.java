package com.xworkz.associations.hotel;

public class Hotel {
      // const,set,literals
	private String name = new String ("a2b"); //literal
	private int since; //setter
	//generate getter for above properties
	private Vendor vendor; //const
	
	public Hotel(Vendor vendor) {// ref vendor
		this.vendor = vendor;
	}
	
	
	
	public void buyVegetables() {
		System.out.println("invoked vegetables");
		
		if (this.name !=null) {
			String hotelName = this.name.toUpperCase();
			System.out.println(hotelName);
		}
		
		if (vendor != null) {
			boolean sold = this.vendor.sell();
			if (sold) {
				System.out.println("Hotel bought vegetables");
				System.out.println(this.vendor.getBillPrice());
				System.out.println(this.vendor.getName());
				System.out.println(this.vendor.getVendorType());
			} else {
				System.out.println("Hotel dont have vegetables");
			}
		}
	}



	public int getSince() {
		return since;
	}



	public void setSince(int since) {
		this.since = since;
	}
	
	
	
	
}
