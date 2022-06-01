package com.xworkz.batch.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.batch.dto.BatchDTO;

public class BatchDAOImplementation implements BatchDAO {

	String query = "insert into Batch_Details values(?,?,?,?)";
	
	
	@Override
	public boolean save(BatchDTO dto) {
		
		String url = "jdbc:mysql://localhost:3306/xworkzjan15";
		
		String username = "root";
		String password = "9405453311s";
		
		
		try (Connection connection = DriverManager.getConnection(url, username, password);
			PreparedStatement prepares = connection.prepareStatement(query))  
		
		{
		
			prepares.setInt(1, dto.getId());
			prepares.setString(2, dto.getCourseName());
			prepares.setString(3, dto.getStartDate());
			prepares.setInt(4, dto.getFees());
		
		}  catch (SQLException e)  {
			
			e.printStackTrace();
		}
		
		
		return false;
	}

	
	
	
	
	
	
	
	
}
