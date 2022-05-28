package com.xworkz.CriminalDTO;

public class CriminalDTO {

	private int id;
	private String name;
	private String offense;
	private int imprisonment;
	private String jailName;
	
	
	
    public CriminalDTO() {
		
		System.out.println("Created default dto");
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
	
	public String getOffense() {
		return offense;
	}
	
	public void setOffense(String offense) {
		this.offense = offense;
	}
	
	public int getImprisonment() {
		return imprisonment;
	}
	
	public void setImprisonment(int imprisonment) {
		this.imprisonment = imprisonment;
	}
	
	public String getJailName() {
		return jailName;
	}
	
	public void setJailName(String jailName) {
		this.jailName = jailName;
	}
	
	
	
	
}
