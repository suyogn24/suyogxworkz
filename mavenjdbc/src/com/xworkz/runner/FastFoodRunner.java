package com.xworkz.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.mavenjdbc.FastFood;

public class FastFoodRunner {

	public static void main(String[] args) {
		

				String xmlfile="resource/spring.xml";
				
				ApplicationContext  applicationContext = new ClassPathXmlApplicationContext(xmlfile);
				
			
				FastFood fastfood =applicationContext.getBean(FastFood.class);
				
				System.out.println(fastfood);
			}

		}
