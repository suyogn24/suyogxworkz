package com.xworkz.athelete.dto;

public class AtheleteDTO {
	
	private Integer id;
	private String name;
	private String sports;
	private String noOfGames;
	private String country;
	private Integer level;
	private String olympics;
	private Integer age;
	private String retired;
	private String coachName;
	private Integer totalMedals;
	private boolean fit;
	private double salary;
	
	

	public AtheleteDTO(int i, String string, String string2, int j, String string3, int k, String string4, int l, int m,
			String string5, int n, String string6, double d) {
		
	}



	public AtheleteDTO(int id1, String name4, String sport4, int games, String country4, String level2, String oly,
			int age2, boolean retired2, String chName, int total, boolean fit2, double salary2) {
	
	}



	public AtheleteDTO(Integer id2, String name2, String sports2, Integer noOfGames2, String country2, String level2,
			boolean olympics2, Integer age2, boolean retired2, String coachName2, Integer totalMedals2, boolean fit2,
			Double salary2) {

	}





	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSports() {
		return sports;
	}
	
	public void setSports(String sports) {
		this.sports = sports;
	}
	
	public String getNoOfGames() {
		return noOfGames;
	}
	
	public void setNoOfGames(String noOfGames) {
		this.noOfGames = noOfGames;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public Integer getLevel() {
		return level;
	}
	
	public void setLevel(Integer level) {
		this.level = level;
	}
	
	public String getOlympics() {
		return olympics;
	}
	
	public void setOlympics(String olympics) {
		this.olympics = olympics;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public String getRetired() {
		return retired;
	}
	
	public void setRetired(String retired) {
		this.retired = retired;
	}
	
	public String getCoachName() {
		return coachName;
	}
	
	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}
	
	public Integer getTotalMedals() {
		return totalMedals;
	}
	
	public void setTotalMedals(Integer totalMedals) {
		this.totalMedals = totalMedals;
	}
	
	public boolean isFit() {
		return fit;
	}
	
	public void setFit(boolean fit) {
		this.fit = fit;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	
	
	
	
}
