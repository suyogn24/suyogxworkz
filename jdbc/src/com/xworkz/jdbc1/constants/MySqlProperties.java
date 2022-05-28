package com.xworkz.jdbc1.constants;

public enum MySqlProperties {

	URL("jdbc:mysql://localhost:3306/xworkz_jan15"), USERNAME("root"), PASSWORD("xworkz@odc");
	
	
	private String value;
	
	private MySqlProperties(String value) {
		this.value = value;
	}
	
	public String getValue() { 	
		return value;
		
	}
	
	
	
	
}
