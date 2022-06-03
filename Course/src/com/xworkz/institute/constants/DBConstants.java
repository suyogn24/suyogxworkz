package com.xworkz.institute.constants;

public enum DBConstants {
	
	USERNAME("root"),PASSWORD("9405453311s"),URL("jdbc:mysql://localhost:3306/xworkzjan15");
	
	private String value;
	
	DBConstants(String value) {
		
		System.out.println("Value");
		this.value = value;			
	}

	public String getValue() {
		return value;
	}
}
