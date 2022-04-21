package com.xworkz.commerce.service;

import com.xworkz.commerce.dao.CustomerDAO;
import com.xworkz.commerce.dto.CustomerDTO;

public class CustomerServiceImplementation implements CustomerService {

	private CustomerDAO customerDAO;
	
	public CustomerServiceImplementation(CustomerDAO customerDAO)  {
		if (customerDAO != null)  {
			this.customerDAO = customerDAO;
			System.out.println("Generated "+ this.getClass().getSimpleName());
			return;
		}
		System.out.println("CustomerDAO is null");
	}
	
	@Override
	public boolean validateAndSave(CustomerDTO customerDTO) {
		
		if(customerDTO !=null) {
			if (customerDTO.getId()<=0) {
				System.out.println("Id is incorrect");
				return false;
			}
		}

	if (customerDTO.getName() == null
			|| customerDTO.getName().length() < 3
			|| customerDTO.getName().length() > 50) {
		System.err.println("Customer Name is incorrect");
		return false;
		}
	

	if (customerDTO.getCustomerId() <= 0)  {
			System.err.println("Customer Id is invalid");
           return false;
	}
	
	if (String.valueOf(customerDTO.getMobile()).length() !=10)  {
		System.out.println("Mobile no is incorrect");
        return false;
	}
	
	if (String.valueOf(customerDTO.getAlternativeMobile()).length() !=10)  {
		System.out.println("Alternative Mobile no is incorrect");
        return false;
	}
	
	if (customerDTO.getEmail() == null
			|| customerDTO.getEmail().length() < 7
			|| customerDTO.getEmail().length() > 50
			|| !customerDTO.getEmail().contains("@") 
			|| !(customerDTO.getEmail().endsWith(".com")
					|| customerDTO.getEmail().endsWith(".edu")
					|| customerDTO.getEmail().endsWith(".in")
					|| customerDTO.getEmail().endsWith(".org"))) {
		System.out.println("Customer Email is incorrect");
		return false;
		}
	
	if (customerDTO.getCustomerType() == null)  {
		System.out.println("Customer Type is incorrect");
	     return false;
	}
	if (customerDTO.getAlternativeEmail() == null
			|| customerDTO.getAlternativeEmail().length() < 7
			|| customerDTO.getAlternativeEmail().length() > 50
			|| !customerDTO.getAlternativeEmail().contains("@") 
			|| !(customerDTO.getAlternativeEmail().endsWith(".com")
					|| customerDTO.getAlternativeEmail().endsWith(".edu")
					|| customerDTO.getAlternativeEmail().endsWith(".in")
					|| customerDTO.getAlternativeEmail().endsWith(".org"))) {
		System.out.println("Customer Email is incorrect");
		return false;
		}
			
	if (customerDTO.getAddressDTO() == null)  {
		System.out.println("Customer Address DTO is incorrect");
	     return false;
	}
	boolean found = customerDAO.findDTO(customerDTO);
	if (found)  {
		System.err.println("cannot be added");
		 return false;
	}
	else {
		System.out.println("Customers details are correct can be added to list");
		customerDAO.save(customerDTO);
		 return true;
	}
	System.out.println("Customer DTO is null cannot be added");
    return false;
    
	}

			
	
	@Override
	public CustomerDTO findByName(String name) {
	    if (name !=null)  {
	    	CustomerDTO dtoFound = customerDAO.findByName(name);
	    	return dtoFound;
	    }
		System.out.println("Name is not found");
		return null;
	}
}

	