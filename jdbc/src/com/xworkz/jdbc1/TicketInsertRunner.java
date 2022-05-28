package com.xworkz.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TicketInsertRunner {

	public static void main(String[] args) {
		
		String username = "root";
		String password = "9405453311s";
		String url = "jdbc:mysql://localhost:3306/xworkz_jan15";
		
		try (Connection connection = DriverManager.getConnection(url,username, password);
	
				Statement statement = connection.createStatement();)  {
			
				
				System.out.println("Connection is created" + connection);
						
				String insertQuery = "insert into ticket values(34,567,12,'Suyog')";
				
				int rowsEffected = statement.executeUpdate(insertQuery);
				System.out.println(rowsEffected);
	

	      } catch (Exception e) {
		    e.printStackTrace();
	      }
	
						
				
				
	}

}
