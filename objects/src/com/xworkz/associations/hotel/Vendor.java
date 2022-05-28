package com.xworkz.associations.hotel;

import com.xworkz.associations.constants.VendorType;

public class Vendor {
	
	private VendorType vendorType;
	private double billPrice;
	private String name;
	

public VendorType getVendorType() {
	return vendorType;
}

public void setVendorType(VendorType vendorType) {
	this.vendorType = vendorType;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
	
	
	public Vendor(VendorType vendorType, double billPrice,String name) {
	   this.billPrice = billPrice;
	   this.setName(name);
	   this.setVendorType(vendorType);
	     
	   
}

public boolean sell() {
	System.out.println("invoked sell");
	if (this.billPrice > 1000)  {
		 return true;
		}
	return false;
}

public char[] getBillPrice() {
	// TODO Auto-generated method stub
	return null;
}
}



