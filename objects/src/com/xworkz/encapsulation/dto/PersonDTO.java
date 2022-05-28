package com.xworkz.encapsulation.dto;

public class PersonDTO {

	private String name;
    private double weight;
    private double height;
    private boolean disabled;
    private boolean dead;
      
    public PersonDTO() {

    System.out.println("Default constructorDTO");
    }
      
      
    public   String getName() {

    	  return this.name;
	}

      
	public  void setName(String name) {
		this.name = name;
	}


	public double getWeight(){

		return weight;
	}


	public double setWeight(double weight) {
		return this.weight;
	}

	
	//accessing
	public double getHeight() {
		return height;
	}
	
	
	//mutators.
	public void setHeight(double height) {
		this.weight = weight;
	}
	
	
	public boolean isDisabled() {
		return disabled;
	}

	
	public  void  setDisabled(boolean disabled)
	{
		this.disabled=disabled;
	}

	
	public boolean isDead() {
		return dead;
	}
	

	public void   setDead(boolean dead) {
		this.dead=dead;
	}

}
