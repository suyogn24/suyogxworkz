package com.xworkz.runner;

import com.xworkz.camera.bean.CameraDTO;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class CameraRunner {

	public static void main(String[] args) {
	
        String xmlfile="resource/spring.xml";
		
		ApplicationContext  applicationContext = new ClassPathXmlApplicationContext(xmlfile);
		
	
		CameraDTO cameraDTO = applicationContext.getBean(CameraDTO.class);
	        System.out.println(cameraDTO);
	        
	       
	        Double doubleNumber = applicationContext.getBean(Double.class);
	        System.out.println(doubleNumber);
	       
	        Boolean booleanValue = applicationContext.getBean(Boolean.class);
	        System.out.println(booleanValue);
	        
	        Character characterValue=applicationContext.getBean(Character.class);
	        System.out.println(characterValue);
	        
	        Float floatValue = applicationContext.getBean(Float.class);
	        System.out.println(floatValue);

	        StringBuffer string1 = applicationContext.getBean(StringBuffer.class);
	        System.out.println(string1);

	        StringBuffer string2 = applicationContext.getBean(StringBuffer.class);
	        System.out.println(string2);

	        StringBuffer string3 = applicationContext.getBean(StringBuffer.class);
	        System.out.println(string3);
	       
	       

	}

}
