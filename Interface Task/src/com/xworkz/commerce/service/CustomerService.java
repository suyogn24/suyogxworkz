package com.xworkz.commerce.service;

import com.xworkz.commerce.dto.CustomerDTO;

public interface CustomerService {
	
	
	boolean validateAndSave(CustomerDTO customerDTO);

	CustomerDTO findByName(String name);
}
