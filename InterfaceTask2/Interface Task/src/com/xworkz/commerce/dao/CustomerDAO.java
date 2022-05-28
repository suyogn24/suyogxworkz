package com.xworkz.commerce.dao;

import com.xworkz.commerce.dto.CustomerDTO;

public interface CustomerDAO {
	
	boolean save(CustomerDTO customerDTO);

	CustomerDTO findByName(String name);

	boolean findDTO(CustomerDTO customerDTO);


}
