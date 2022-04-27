package com.xworkz.PoliticalParty.service;

import com.xworkz.PoliticalPartyDAO.PoliticalPartyDAO;
import com.xworkz.PoliticalPartyDAO.PoliticalPartyDAOImpl;
import com.xworkz.PoliticalPartyDTO.PoliticalPartyDTO;

public class PoliticalPartyServiceImpl implements PoliticalPartyService  {
	
	PoliticalPartyDAOImpl politicalPartyDAO;
	
	
	public PoliticalPartyServiceImpl(PoliticalPartyDAO politicalpartyDAO3)  {
		
	
	if(politicalpartyDAO3 !=null)  {
		System.out.println("created".concat(this.getClass().getClass().getSimpleName()));
		this.politicalPartyDAO=(PoliticalPartyDAOImpl) politicalpartyDAO3;
	}

	}	

	@Override
	public void ValidateAndSave(PoliticalPartyDTO dto) {
		
		if(dto !=null) {
			
			if(dto.getName().length()>3 && dto.getName().length()<50 
					&& dto.getId()>0 && dto.getNoOfMps()>0)   {
				politicalPartyDAO.save(dto);

			}
		}
	}
	

	@Override	
	public void deleteByName(String name) {
		
	    if (name !=null) {
	    	PoliticalPartyDTO dto = politicalPartyDAO.deleteByName(name);
	        System.out.println(dto);
	
	}
	}
}
