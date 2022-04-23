package com.xworkz.commerce.dao;

import com.xworkz.commerce.dto.CustomerDTO;

public class CustomerDAOImplementation implements CustomerDAO {

	protected CustomerDTO[] customerDTO = new CustomerDTO[10];
	protected int index=0;
	private Object[] customerDTOs;
	
	
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
	
		if(name!=null)  {
			for (int i = 0; i < customerDTOs.length;i++)  {
				 if (this.customerDTOs[i] !=null && this.customerDTOs[i].equals(customerDTO))  {
					 System.out.println("Customer Name is found @ DTO index" +index);
						return (CustomerDTO) customerDTOs[index];
				 }
			}
		}
				System.out.println("Customer Name is not found @ DTO index" +index);
					return (CustomerDTO) customerDTOs[index];
	}


	@Override
	public boolean findDTO(CustomerDTO customerDTO) {
	   
		 if (customerDTO !=null)   {
		
			for (int i = 0; i < customerDTOs.length;i++)  {
				 if (this.customerDTOs[i] !=null && this.customerDTOs[i].equals(customerDTO))  {
					 System.out.println("Customer DTO is found here");
						return true;
				 }
			 }
		 }
		 
		 System.out.println("Customer DTO is not found here");
		return false;
	}

	

}
