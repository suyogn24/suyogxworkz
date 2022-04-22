package com.xworkz.commerce.dao;

import com.xworkz.commerce.dto.CustomerDTO;

public class CustomerDAOImplementation implements CustomerDAO {

	protected CustomerDTO[] customerDTO = new CustomerDTO[10];
	protected int index=0;
	
	
	@Override
	public boolean save(CustomerDTO customerDTO) {
		
		if(customerDTO!=null)
		{
			if(index<this.customerDTO.length)
			{
				this.customerDTO[index]=customerDTO;
				this.index++;
				return true;
			}
			else
			{
				System.out.println("Here the index is full in the array so it cannot be added");
				return false;
				}
		}
		return false;
	}

	@Override
	public CustomerDTO findByName(String name) {
	
		if(name!=null)
		{
			
		}
		return null;
	}


	@Override
	public boolean findDTO(CustomerDTO customerDTO) {
	
		return false;
	}

	

}
