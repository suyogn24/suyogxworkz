package com.xworkz.runner;

import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SetRunner {

	public static void main(String[] args) {
	
		
		String xmlFile = "resource/spring.xml";

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlFile);

		SetRunner cgs=applicationContext.getBean(SetRunner.class);
		
       
	    Set<String> vegetableSet=cgs.getvegetableSet();
    	System.out.println(vegetableSet); 
    	
		
	}

	private Set<String> getvegetableSet() {
		
		return null;
	}
}

