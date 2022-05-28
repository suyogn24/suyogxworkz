package com.xworkz.SerializationandDeserialization;

import java.io.Serializable;

public class Person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	 String name;
	 String type;
	 int number;
     int age;
	  
	    // Default constructor
	public Person(String name, int age, String type, int number)
	    {
	        this.name = name;
	        this.type = type;
	        this.age = age;
	        this.number = number;
	    }

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
