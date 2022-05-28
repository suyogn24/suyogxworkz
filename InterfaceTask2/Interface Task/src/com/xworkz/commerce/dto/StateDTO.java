package com.xworkz.commerce.dto;

import java.io.Serializable;

public class StateDTO  implements Serializable {
 

	private int id;//>0 < 2000
	private String name;//min 3 , max 40
	private int noOfDistricts; //>0 , <100
	
	
	public StateDTO() {
		System.out.println("Constructor Running in StateDTO");
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		if(id<0 || id>2000) {
			System.out.println("The id is incorrect");
			return;
		}
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name.length()>3 && name.length()<40) {
			System.out.println("Name should be between 3 & 40");
			return;
		}
		this.name = name;
	}

	public int getNoOfDistricts() {
		return noOfDistricts;
	}

	public void setNoOfDistricts(int noOfDistricts) {
		if(noOfDistricts>0 && noOfDistricts<100) {
			System.out.println("The noofDistrict pass throught it");
			return;
		}
		this.noOfDistricts = noOfDistricts;
	}
	
}
