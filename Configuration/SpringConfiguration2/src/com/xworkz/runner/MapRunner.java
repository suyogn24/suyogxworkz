package com.xworkz.runner;

import java.util.Map;

public class MapRunner {

	public static void main(String[] args) {
		

		String xmlFile = "resource/spring.xml";

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlFile);

		MapRunner cgs=applicationContext.getBean(MapRunner.class);
		
		
		Map<String,String> map=cgs.getMap();
    	System.out.println(map);
		
	}

	private Map<String, String> getMap() {
		
		return null;
	}

}
