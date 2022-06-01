package com.xworkz.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.batch.dao.BatchDAO;
import com.xworkz.batch.dto.BatchDTO;

public class Service {
	
	private BatchDAO dao;
	
	public Service(BatchDAO dao) {
		super();
		this.dao = dao;
	}
	
	public boolean validateandsave(BatchDTO dto)  {
		
		if (dto != null) {
			
			if (dto.getId() !=0 && dto.getCourseName() != null 
					&& (dto.getCourseName().length() > 3 && dto.getCourseName().length() < 20) 
					&& dto.getStartDate() != null && dto.getFees() > 5000)  {
				
				   Boolean save=dao.save(dto);
				   System.out.println(save);
				   
			}
			
		}
		
		return false;
	
	}

}
