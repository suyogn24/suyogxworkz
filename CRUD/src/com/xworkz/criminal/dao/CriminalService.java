package com.xworkz.criminal.dao;

import com.xworkz.criminals.dto.CriminalDAO;

public class CriminalService {
	
	private CriminalDAO dao;

	public CriminalService(CriminalDAO dao) {
		super();
		this.dao = dao;
	}
	
	public void validateAndSave(com.xworkz.CriminalDTO.CriminalDTO dto)
	{
		if(dto!=null)
		{
			if (dto.getId() > 0 && dto.getName().length() > 3 
					&& dto.getJailName().length() < 50) {
				if (dto.getImprisonment() > 0 && dto.getJailName().length() > 12 
						&& dto.getJailName().length() < 30) {
					boolean a=dao.save(dto);
					System.out.println("Criminal name is add"+" "+dto);
					System.out.println(a);
				}
			}
		}
	}
}
