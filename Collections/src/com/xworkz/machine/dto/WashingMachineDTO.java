package com.xworkz.machine.dto;

import com.xworkz.EnumType.Type;

public class WashingMachineDTO {

	private int id;
	private String brand;
	private int capacity;
	private String colour;
	private Type type;
	private double price;
	private int modelNo;
	
	public WashingMachineDTO() {

		System.out.println("Default constructor of washing machinr DTO");
	}

	
	public WashingMachineDTO(int id, String brand, int capacity, String colour, Type type , double price, int modelNo)  {
		super();
		this.id = id;
		this.brand = brand;
		this.capacity = capacity;
		this.colour = colour;
		this.type = type;
		this.price = price;
		this.modelNo = modelNo;
	}
	
	@Override
	public String toString() {
		return "WashingMachineDTO [id=" + id + ", brand=" + brand + ", capacity=" + capacity + ", colour=" + colour
				+ ", price=" + price + ", modelNo=" + modelNo + "]";
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

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getModelNo() {
		return modelNo;
	}

	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}
	
	
	
	
}
