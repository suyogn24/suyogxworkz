package com.xworkz.train.dto;

public class TrainDTO {

	private int id;
	private int number;
	private String name;
	private Type type;
	private String startingPoint;
	private String destination;
	
	private TrainDTO() {
		
	}
	
	private int getId() {
		return id;
	}
	
	private void setId(int id) {
		this.id = id;
	}
	
	private int getNumber() {
		return number;
	}
	
	private void setNumber(int number) {
		this.number = number;
	}
	
	private String getName() {
		return name;
	}
	
	private void setName(String name) {
		this.name = name;
	}
	
	private Type getType() {
		return type;
	}
	
	private void setType(Type type) {
		this.type = type;
	}
	
	private String getstartingPoint() {
		return startingPoint;
	}
	
	private void setstartingPoint(String startingPoint) {
		this.startingPoint = startingPoint;
	}
	
	private String getdestination() {
		return destination;
	}
	
	private void setdestination(String destination) {
		this.destination = destination;
	}
}
