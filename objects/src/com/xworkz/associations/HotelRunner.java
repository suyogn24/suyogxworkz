package com.xworkz.associations;

import com.xworkz.associations.constants.VendorType;
import com.xworkz.associations.hotel.Hotel;
import com.xworkz.associations.hotel.Vendor;


public class HotelRunner {
   
	public static void main(String[] args)  {
		  
		String vendorName="Manju Vegetable Vendor";
		Vendor vendor=new Vendor(VendorType.VEGETABLES,2000,vendorName);
		
		
		Hotel hotel=new (vendor);
		
		hotel.buyVegetables();
		
	}
}
