package com.xworkz.shop.dao;

import java.sql.DriverManager;

public class ShopDAOImpl implements ShopDAO {

	@Override
	public boolean save (ShopDTO shopDTO)  {
		
		String insertQuery = "insert into shop values(" + shopDTO.getID() + "," + shopDTO.getShopName()
		
		
		try (Connection connection = DriverManager.getConnection(SqlCredential.URL.getValue(),SqlCredential.
				)
		
		
		
		
		
		return false;
		
	}

	
	
	
}
