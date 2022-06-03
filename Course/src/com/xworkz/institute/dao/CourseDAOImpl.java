package com.xworkz.institute.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.institute.dto.CourseDTO;

public class CourseDAOImpl implements CourseDAO   {
	
	
	@Override
	public boolean save(CourseDTO dto) {
	
		String insertQuery = "insert into course_details(id,name,duration,fees,startDate,free) values(?,?,?,?,?,?)";
		
		String URL = "jdbc:mysql://localhost:3306/xworkz_Course";
		
		String USERNAME = "root";
		String PASSWORD = "9405453311s";
		
		
		try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			PreparedStatement statement = connection.prepareStatement(insertQuery))  
		
		{
		
			statement.setInt(1, dto.getId());
			statement.setString(2, dto.getName());
			statement.setDouble(3, dto.getDuration());
			statement.setInt(4, dto.getFees());
			statement.setString(5, dto.getStartDate().toString());
			statement.setBoolean(6, dto.isFree());
			
			int rowsAffected = statement.executeUpdate();		
			System.out.println("Row affected are - %d%n" + rowsAffected);
			
			return rowsAffected == 1 ? true : false;	
			
		}  catch (SQLException e)  {	
			e.printStackTrace();
		}
			
		return false;
	}
	
}
