package com.xworkz.expenditure.dao;

import com.xworkz.expenditure.dto.ExpenditureDTO;

public class ExpenditureDAO {

	private ExpenditureDTO[] expenditureDTOs = new ExpenditureDTO[20];
	private int expenditureIndex=0;
	
	public ExpenditureDAO() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}
	
	public boolean create (ExpenditureDTO dto)  {
		
		System.out.println("invoked create expenditure".concat(dto.toString()));
		
		this.expenditureDTOs[expenditureIndex] = dto;
		expenditureIndex++;
		
		return false;
		
	}
}
