package com.xworkz.commerce;

import com.xworkz.commerce.constants.CustomerType;
import com.xworkz.commerce.dao.CustomerDAO;
import com.xworkz.commerce.dao.CustomerDAOImplementation;
import com.xworkz.commerce.dto.AddressDTO;
import com.xworkz.commerce.dto.CustomerDTO;
import com.xworkz.commerce.dto.StateDTO;
import com.xworkz.commerce.service.CustomerService;
import com.xworkz.commerce.service.CustomerServiceImplementation;


public class CustomerRunner {

	// team work --->  
	

	public static void main(String[] args) {
		
	CustomerDAO customerDAO=null;// new CustomerDAOImplementation();
		
		CustomerDAO customerdao=new CustomerDAOImplementation();
		
		customerdao.findByName("Suyog");
		customerdao.save(null);
		
		
		
       StateDTO stateDTO = new StateDTO();
       
       stateDTO.setId(3693);
       stateDTO.setName("MUMBAI");
       stateDTO.setNoOfDistricts(24);
       
       
       AddressDTO addressDTO = new AddressDTO();
       
       addressDTO.setId(450);    
       addressDTO.setStreet("RANJANWAN COLONY");
       addressDTO.setDoorNo("65");
       addressDTO.setPincode(431001);
       addressDTO.setStateDTO(stateDTO);
       
       
       CustomerDTO customerDTO = new CustomerDTO();
       
       customerDTO.setId(29);
       customerDTO.setName("AKSHAY");
       customerDTO.setCustomerId(550);
       customerDTO.setMobile(945682340);
       customerDTO.setAlternativeMobile(934870126);
       customerDTO.setEmail("suyognaphade123@gmail.com");
       customerDTO.setCustomerType(CustomerType.GOLD);
       customerDTO.setAlternativeEmail("suyognaphade.xworkz@gmail.com");
       customerDTO.setAddressDTO(addressDTO);
       
		
		CustomerService customerService=null;//new CustomerServiceImplementation(customerDAO);
		CustomerService customerServices=new CustomerServiceImplementation(customerDAO);
		
		
		CustomerDTO foundByName=customerServices.findByName("AKSHAY");
		System.out.println(foundByName);
	
		StateDTO stateDTO=null;
		//init all variables		
	    AddressDTO=null;
		//init all variables
		//addressDTO.setStateDTO(stateDTO);
        CustomerDTO customerDTO=null;
		//init all variables inclusing addressDTO
		//customerDTO.setAddressDTO(addressDTO)
		
		customerService.validateAndSave(customerDTO);
		

	}

}

