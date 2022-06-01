package com.xworkz.batchrunner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class BatchRunner {

	public static void main(String[] args) {

		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("resources/spring.xml");
		

	}
	

}


