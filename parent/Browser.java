package com.xworkz.browser.parent;

public abstract class Browser { 
	
	String name="FIREFOX";
	String version="ANDROID 98.0";
	String company="MOZILLA";


	public Browser() {

	System.out.println("DEFAULT BROWSER CONSTRUCTOR");
	}


   @Override
protected Object clone() throws CloneNotSupportedException {
	
	return super.clone();
}

  
   @Override
public String toString() {
	
	return super.toString();
}

   
   @Override
public boolean equals(Object obj) {

	return super.equals(obj);
}


   @Override
public int hashCode() {
	
	return super.hashCode();
}




	public Browser(String name, String version, String company) {
		super();
		System.out.println("Parameterised constructor browser");
		this.name = name;
		this.version = version;
		this.company = company;
	}

	public void connect()
	{
		System.out.println("CONNECT METHOD RUNNING IN PARENT CLASS BROWSER ");
	}

	
	public abstract void developerTool(); {
		System.out.println("RUNNING ABSTRACT METHOD DEVELOPER TOOL PARENT CLASS");

	}


	public abstract void showTime();
	{
		System.out.println(" Abstract show time in the parent class ");

	}

	public String getCompany() {
		return company;
	}

	public String getName() {
		return name;
	}


	public String getVersion()
	{
		return version;
	}


	public abstract void cleanUp();
	{
		System.out.println("Clean method from the parent class");
	}
	

	public abstract void Browser(String name, String version, String company);


	public abstract void Browser();

}
