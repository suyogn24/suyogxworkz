package com.xworkz.runner;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.mavenjdbc.Loan;
import com.xworkz.mavenjdbc.Salary;

public class LoanRunner {

	public static void main(String[] args) {

		
		ApplicationContext  applicationContext= new ClassPathXmlApplicationContext("resource/spring-ref.xml");
		

		System.out.println("Total objects managed : "+ applicationContext.getBeanDefinitionNames());
		System.out.println(Arrays.toString(applicationContext.getBeanDefinitionNames()));
			
		Loan loan = applicationContext.getBean(Loan.class);
		boolean sanctioned = loan.sanction();
		System.out.println("sanctioned : " + sanctioned);
		
		
		
	}

}
