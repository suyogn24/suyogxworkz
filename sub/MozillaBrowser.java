package com.xworkz.browser.sub;
import com.xworkz.browser.parent.Browser;

public class MozillaBrowser extends Browser{
	
	
	@Override
	public void developerTool() {
		System.out.println("Overiding method from browser in child class");

	}

	@Override
	public void showTime() {

		System.out.println("Overriding method from browser in child class ");
	}


	public void cleanUp() {

		System.out.println("clean up method from Mozilla browser which is in the child class");
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
	
		return super.clone();
	}

	@Override
	public void connect() {

		System.out.println("Connect method from child class which override from parent browser");
		super.connect();
	}


	@Override
	public boolean equals(Object obj) {

		System.out.println("Boolean object method method ");
		return super.equals(obj);
	}


	@Override
	public String getCompany() {

		System.out.println("overriding getCompany from the child class");
		return super.getCompany();
	}

	@Override
	public String getName() {

		System.out.println("Overriding the child class which is over riden");
		return super.getName();
	}


	@Override
	public String getVersion() {

		System.out.println("Get version from the child class");
		return super.getVersion();
	}


	@Override
	public int hashCode() {

		System.out.println("overriding the hashcode from the parent  class");
		return super.hashCode();
	}


	@Override
	public String toString() {

		System.out.println("Overriding the string to string method from the parent class");
		return super.toString();
	}

	@Override
	public void Browser() {


	}

	@Override
	public void Browser(String name, String version, String company) {
	

	}

}
