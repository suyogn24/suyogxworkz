package com.xworkz.runner;

import java.util.ArrayList;
import java.util.ListIterator;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ArrayRunner {

	public static void main(String[] args) {



		String xmlFile = "resource/spring.xml";

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlFile);

		ArrayRunner cgs=applicationContext.getBean(ArrayRunner.class);
		

	ArrayList<String> stateArray = cgs.getstateArray();
		
		ListIterator<String> lIterator = stateArray.listIterator();
		

        while(lIterator.hasNext()){
              System.out.println(lIterator.next());
        }
	}

	private ArrayList<String> getstateArray() {
		
		return null;
	}
}

