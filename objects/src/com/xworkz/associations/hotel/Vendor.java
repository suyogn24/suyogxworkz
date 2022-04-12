package com.xworkz.associations.hotel;

import com.xworkz.associations.constants.VendorType;

public class Vendor {
	
	private VendorType vendorType;
	private double billPrice;
	private String name;
//generate getter for above properties
	public Vendor(VendorType vendorType, double billPrice,String name);
	   this.billPrice = billPrice;
	   this.name = name;
	   this.vendorType = vendorType;
}

public boolean sell() {
	System.out.println("invoked sell");
	if (this.billPrice > 1000)  {
		 return true;
		}
	return false;
	
	}
