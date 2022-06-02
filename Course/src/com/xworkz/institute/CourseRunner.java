package com.xworkz.institute;

import java.time.LocalDate;

import com.xworkz.institute.dto.CourseDTO;
import com.xworkz.institute.service.CourseService;
import com.xworkz.institute.service.CourseServiceImpl;

public class CourseRunner {

	public static void main(String[] args) {
		
		CourseDTO dto1 = new CourseDTO(11,"Java",1.05,10000,LocalDate.now(),true);
		CourseDTO dto2 = new CourseDTO(12,"Web",2.05,5000,LocalDate.now(),false);
		CourseDTO dto3 = new CourseDTO(13,"Spring",3.05,7000,LocalDate.now(),true);
		CourseDTO dto4 = new CourseDTO(14,"MYSQL",2,9000,LocalDate.now(),true);
		
	
		CourseService service = new CourseServiceImpl();
		System.out.println(service.save(dto1));
		System.out.println(service.save(dto2));
		System.out.println(service.save(dto3));
		System.out.println(service.save(dto4));
		
		
	}

}
