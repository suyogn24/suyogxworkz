package com.xworkz.IplTeamDTO;

public class IplTeamDTO {

	private int id;
	private String name;
	private String sponsor;
	private String captain;
	private int noofWins;
	private int noofLostMatch;
	
	
	public IplTeamDTO() {
		
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
		this. name =  name;
	}
	
	public String getSponsor() {
		return sponsor;
	}
	
	public void setSponsor(String sponsor) {
		this.sponsor = sponsor;
	}
	
	public String getCaptain() {
		return captain;
	}
	
	public void setCaptain(String captain) {
		this.captain = captain;
	}
	
	public int getNoofWins() {
		return noofWins;
	}
	
	public void setnoofWins(int noofWins) {
		this.noofWins = noofWins;
	}
	
	public int getnoofLostMatch() {
		return noofLostMatch;
	}
	
	public void setNoofLostMatch(int noofLostMatch) {
		this.noofLostMatch = noofLostMatch;
	}
}
