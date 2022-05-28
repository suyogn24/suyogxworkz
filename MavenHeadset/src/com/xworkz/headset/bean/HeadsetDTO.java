package com.xworkz.headset.bean;

public class HeadsetDTO {
	
	private String brand;
	private double cost;
	private boolean warranty;
	private String colour;
	
	
	public HeadsetDTO(String brand, double cost) {
		this.setBrand(brand);
		this.setCost(cost);	
	}
	
	
	public HeadsetDTO(double cost, boolean warranty) {
		this.setCost(cost);	
		this.setWarranty(warranty);		
	}
	
	
	public HeadsetDTO( boolean warranty, String colour) {
			this.setWarranty(warranty);
			this.setColour(colour);	
	}
		
	public HeadsetDTO(String brand,  String colour)  {
			this.setBrand(brand);
			this.setColour(colour);	
	}

	public HeadsetDTO() {
		System.out.println("created" + this.getClass().getSimpleName());
	}
	

	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public double getCost() {
		return cost;
	}


	public void setCost(double cost) {
		this.cost = cost;
	}


	public boolean isWarranty() {
		return warranty;
	}


	public void setWarranty(boolean warranty) {
		this.warranty = warranty;
	}


	public String getColour() {
		return colour;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}

		
		
		
}
