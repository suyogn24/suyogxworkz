package com.xworkz.PoliticalParty.service;

import java.util.Comparator;
import java.util.List;

import com.xworkz.PoliticalParty.sort.PoliticalPartyByName;
import com.xworkz.PoliticalPartyDAO.PoliticalPartyDAO;
import com.xworkz.PoliticalPartyDTO.PoliticalPartyDTO;

public class PoliticalPartyServiceImpl implements PoliticalPartyService  {
	
	private PoliticalPartyDAO dao;
	
	public PoliticalPartyServiceImpl(PoliticalPartyDAO dao) {
		super();
		this.dao=dao;
	}

	@Override
	public void ValidateAndSave(PoliticalPartyDTO dto) {
		
		if(dto !=null) {
			
			if(dto.getId()>0 && (dto.getName().length()>3 && dto.getName().length()<50)
					&& dto.getNoOfMps()>0 && (dto.getPresidentName().length()>3 && dto.getPresidentName().length()<50))
			{
				System.out.println("validate and save");
				dao.save(dto);
			}
				
			}
		
		}
	

	@Override	
	public void deleteByName(String name) {
		
	    if (name !=null) {
			dao.deleteByName(name);  
	        System.out.println("The name is deleting"  +name);
	         
	          
	}
	}

	@Override
	public List<PoliticalPartyDTO> sortByName()  {
		Comparator<PoliticalPartyDTO> sortName=new PoliticalPartyByName();
		return dao.sort(sortName);
		
	}
	
	@Override
	public List<PoliticalPartyDTO> sortById()  {
		Comparator<PoliticalPartyDTO> sortName=new PoliticalPartyByName();
		return dao.sort(sortName);
	}
	
	
		@Override
		public List<PoliticalPartyDTO> sortByNameAndId()  {
			Comparator<PoliticalPartyDTO> sortName=new PoliticalPartyByName();
			return dao.sort(sortName);
		}
	
	
	
}