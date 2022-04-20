package com.xworkz.criminals;

public class CriminalRunner {

	public static void main(String[] args) {
		
		CriminalDAO dto = new CriminalDTO();
		criminaldao.save(null);
		
		CriminalService criminalservice = new CriminalService(criminaldao);
		
		CriminalDTO dto = new CriminalDTO();
		dto.setId(600);
		dto.setName("Yerwada");
		dto.setOffense("Robbery");
		dto.setImprisonment(4);
		dto.setJailName("Yerwada Pune");
		criminaldao.save(dto);
		
		criminalservice.validateAndSave(dto);

	}

}
