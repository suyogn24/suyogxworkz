package com.xworkz.runner;

import com.xworkz.headset.bean.HeadsetDTO;

public class HeadsetRunner {

	public static void main(String[] args) {
	
		String xmlfile="resource/spring.xml";
		
		ApplicationContext  applicationContext = new ClassPathXmlApplicationContext(xmlfile);
		
		
		HeadsetDTO HeadsetDTO1 = applicationContext.getBean(HeadsetDTO.class);
		
		System.out.println(HeadsetDTO1.getBrand());
		System.out.println(HeadsetDTO1.getCost());
		System.out.println(HeadsetDTO1.isWarranty());
		System.out.println(HeadsetDTO1.getColour());
		
		System.out.println(); 
			
		
	    HeadsetDTO HeadsetDTO2 = applicationContext.getBean(HeadsetDTO.class);
		
		System.out.println(HeadsetDTO2.getBrand());
		System.out.println(HeadsetDTO2.getCost());
		System.out.println(HeadsetDTO2.isWarranty());
		System.out.println(HeadsetDTO2.getColour());
		
		System.out.println(); 
		
		
		
	    HeadsetDTO HeadsetDTO3 = applicationContext.getBean(HeadsetDTO.class);
		
		System.out.println(HeadsetDTO3.getBrand());
		System.out.println(HeadsetDTO3.getCost());
		System.out.println(HeadsetDTO3.isWarranty());
		System.out.println(HeadsetDTO3.getColour());
		
		System.out.println(); 
		
		
        HeadsetDTO HeadsetDTO4 = applicationContext.getBean(HeadsetDTO.class);
		
		System.out.println(HeadsetDTO4.getBrand());
		System.out.println(HeadsetDTO4.getCost());
		System.out.println(HeadsetDTO4.isWarranty());
		System.out.println(HeadsetDTO4.getColour());
		
		System.out.println(); 
		
		
		HeadsetDTO HeadsetDTO5 = applicationContext.getBean(HeadsetDTO.class);
			
		System.out.println(HeadsetDTO5.getBrand());
		System.out.println(HeadsetDTO5.getCost());
		System.out.println(HeadsetDTO5.isWarranty());
		System.out.println(HeadsetDTO5.getColour());
			
		System.out.println(); 
		
		
	    HeadsetDTO HeadsetDTO6 = applicationContext.getBean(HeadsetDTO.class);
				
		System.out.println(HeadsetDTO6.getBrand());
		System.out.println(HeadsetDTO6.getCost());
		System.out.println(HeadsetDTO6.isWarranty());
		System.out.println(HeadsetDTO6.getColour());
				
		System.out.println(); 
		
		
	    HeadsetDTO HeadsetDTO7 = applicationContext.getBean(HeadsetDTO.class);
					
	    System.out.println(HeadsetDTO7.getBrand());
		System.out.println(HeadsetDTO7.getCost());
		System.out.println(HeadsetDTO7.isWarranty());
		System.out.println(HeadsetDTO7.getColour());
					
		System.out.println(); 
		
		
		HeadsetDTO HeadsetDTO8 = applicationContext.getBean(HeadsetDTO.class);
				
	    System.out.println(HeadsetDTO8.getBrand());
		System.out.println(HeadsetDTO8.getCost());
		System.out.println(HeadsetDTO8.isWarranty());
		System.out.println(HeadsetDTO8.getColour());
						
		System.out.println(); 
				 
	
		
	}

}
