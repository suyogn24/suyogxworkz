package com.xworkz.institute.service;

import java.time.LocalDate;

import com.xworkz.institute.dao.CourseDAO;
import com.xworkz.institute.dao.CourseDAOImpl;
import com.xworkz.institute.dto.CourseDTO;

public class CourseServiceImpl implements CourseService  {

	CourseDAO dao = new CourseDAOImpl();

	@Override
	public boolean validate(CourseDTO dto) {
	
		if (dto !=null) {
			LocalDate startDate = dto.getStartDate();
			System.out.println("Validate the course details ==>");
			if (dto.getName() != null && dto.getName().isEmpty() 
					&& dto.getName().length() > 4 && dto.getName().length() < 30 
					&& dto.getDuration() >= 0 && dto.getDuration() <= 6 
					&& dto.getFees() < 50000 && dto.getFees() >= 0 
					&& startDate.isAfter(LocalDate.of(2022, 06, 02))) {
				System.out.println("Details are given");
				return true;
			}  else  {
				System.out.println("Details are not valid");
			}
		}
		return false;
	}

	@Override
	public boolean save(CourseDTO dto) {
	
		if (validate(dto))  {
			System.out.println("Save course details");
            return dao.save(dto);	
		}
		
		return false;
	}

}