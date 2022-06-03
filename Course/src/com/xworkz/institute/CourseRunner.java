package com.xworkz.institute;

import java.time.LocalDate;

import com.xworkz.institute.dto.CourseDTO;
import com.xworkz.institute.service.CourseService;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class CourseRunner {

	public static void main(String[] args) {
		
		CourseDTO dto1 = new CourseDTO(12,"Java1",3.0d,12000,LocalDate.of(2022, 07, 11),true);
		
		ApplicationContext  applicationContext = new ClassPathXmlApplicationContext("resource/spring.xml");
		
		
		CourseService courseService = applicationContext.getBean(CourseService.class);
		
		boolean saved = courseService.save(dto1);
		System.out.println(saved);
		
	}

}
