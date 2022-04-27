package com.xworkz.PoliticalPartyDTO;

import java.io.Serializable;

public class PoliticalPartyDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private  int  id;
	private  String  name;
	private  String presidentName;
	private  boolean nationalParty;
	private  int noOfMps;

	
	public PoliticalPartyDTO(int i, String string, String string2, String string3, int j) {
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "PoliticalPartyDTO [id=" + id + ", name=" + name + ", presidentName=" + presidentName
				+ ", nationalParty=" + nationalParty + ", noOfMps=" + noOfMps + "]";
	}



	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPresidentName() {
		return presidentName;
	}
	
	public void setPresidentName(String presidentName) {
		this.presidentName = presidentName;
	}
	
	public boolean getNationalParty() {
		return nationalParty;
	}
	
	public void setNationalParty(boolean nationalParty) {
		this.nationalParty = nationalParty;
	}
	
	public int getNoOfMps() {
		return noOfMps;
	}
	
	public void setNoOfMps(int noOfMps) {
		this.noOfMps = noOfMps;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
}
