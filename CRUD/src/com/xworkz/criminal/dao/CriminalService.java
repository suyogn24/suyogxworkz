package com.xworkz.criminal.dao;

import com.xworkz.CriminalDTO.CriminalDTO;

public class CriminalService {
	
	private CriminalDAO dao;

	public CriminalService(CriminalDTO dao2) {
		super();
		this.dao = (com.xworkz.criminal.dao.CriminalDAO) dao2;
	}
	
	public void validateAndSave(CriminalDTO dto)
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
