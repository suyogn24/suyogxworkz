package com.xworkz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BakeryRunner {

	public static void main(String[] args) {
		
			
		try {
			String username = "root";
			String password = "9405453311s";
			String url = "jdbc:mysql://localhost:3306/xworkz_jan15";
		
		Connection connection = DriverManager.getConnection(url,username, password);
		System.out.println("Connection is created" + connection);
		
		String insertQuery = "insert into bakery values(1,'Iyengar',1998,'Mudhol',6)";
		
		Statement statement = connection.createStatement();
		
		System.out.println(statement);
		
		int rowsEffected = statement.executeUpdate(insertQuery);
		
		System.out.println("successfully inserted");
		System.out.println("effected rows: +rowsEffected");
		
		
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

}
