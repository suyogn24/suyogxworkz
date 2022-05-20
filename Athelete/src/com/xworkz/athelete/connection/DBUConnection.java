package com.xworkz.athelete.connection;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



	public class DBUConnection {
	 
	   public static Connection getConnection() throws SQLException
	   
		{
		   
		return DriverManager.getConnection(URL.getVal(),USERNAME.getVal(),PASSWORD.getVal());
		
		}
	   
	}
