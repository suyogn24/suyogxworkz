package com.xworkz.criminals;

import com.xworkz.CriminalDTO.CriminalDTO;
import com.xworkz.criminal.dao.CriminalService;

public class CriminalRunner {

	public static void main(String[] args) {
		
		CriminalDTO dao = new CriminalDTO();
	
		
		CriminalService criminalservice = new CriminalService(dao);
		
		CriminalDTO dto = new CriminalDTO();
		dto.setId(600);
		dto.setName("Yerwada");
		dto.setOffense("Robbery");
		dto.setImprisonment(4);
		dto.setJailName("Yerwada Pune");
		
		criminalservice.validateAndSave(dto);

	}

}
