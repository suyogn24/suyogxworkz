package com.xworkz.CameraDTO;

public class CameraDTO {


	private int id;
	private String brand;
	private float pixel;
	private String type;
	private double cost;

	
	public CameraDTO() {
		
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public float getPixel() {
		return pixel;
	}
	
	public void setPixel(float pixel) {
		this.pixel = pixel;
	}
	
	public String getType() {
		return  type;
	}
	
	public void setType(String  type) {
		this. type =  type;
	}
	
	public double getCost() {
		return cost;
	}
	
	public void setCost(double cost) {
		this.cost= cost;
	}

	
}
