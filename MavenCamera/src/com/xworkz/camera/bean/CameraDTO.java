package com.xworkz.camera.bean;


public class CameraDTO {
	
	private int id;
	private String brand;
	private float pixel;
	private String type;
	private double cost;
	private String colour;
	
	
	public CameraDTO()  {
		
		System.out.println("Default constructor");
		
	}
	
	CameraDTO(int id ,String brand, float pixel)
	{
		System.out.println("Parameterised constructor");
		this.id = id;
		this.brand = brand;
		this.pixel = pixel;

	}
	
	public void setType(String type)  {
		this.type = type;
	}
	
	

	public void setCost(double cost)  {
		this.cost = cost;
	}
	
	

	public void setColour(String colour)  {
		this.colour = colour;
	}
	
	

}
