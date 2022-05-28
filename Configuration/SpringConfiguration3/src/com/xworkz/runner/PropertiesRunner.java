package com.xworkz.runner;

import java.util.Properties;

public class PropertiesRunner {

	public static void main(String[] args) {
	
		
		String xmlFile = "resource/spring.xml";

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlFile);

		PropertiesRunner cgs=applicationContext.getBean(PropertiesRunner.class);
		
		
		Properties properties=cgs.getPros();
    	System.out.println(properties);
        
        
		
		
	}

	private Properties getPros() {
		
		return null;
	}

}
