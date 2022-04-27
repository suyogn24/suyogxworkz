package com.xworkz.PoliticalParty;

import com.xworkz.PoliticalParty.service.PoliticalPartyService;
import com.xworkz.PoliticalParty.service.PoliticalPartyServiceImpl;
import com.xworkz.PoliticalPartyDAO.PoliticalPartyDAO;
import com.xworkz.PoliticalPartyDAO.PoliticalPartyDAOImpl;
import com.xworkz.PoliticalPartyDTO.PoliticalPartyDTO;

public class PoliticalPartyRunner {



	public static void main(String[] args) {

		PoliticalPartyDAO politicalpartyDAO = new PoliticalPartyDAOImpl();
	
		
		PoliticalPartyService politicalpartyServices = new PoliticalPartyServiceImpl(politicalpartyDAO);
	
		

		PoliticalPartyDTO politicalPartyDTO1 = new PoliticalPartyDTO(23,"Shivsena","Balasaheb Thakre","Shivsena",36);
		PoliticalPartyDTO politicalPartyDTO2 = new PoliticalPartyDTO(45,"AAP","Kejriwal","AAP",9);
		PoliticalPartyDTO politicalPartyDTO3 = new PoliticalPartyDTO(35,"Congress","Rahul Gandhi","Congress",5);
		PoliticalPartyDTO politicalPartyDTO4 = new PoliticalPartyDTO(76,"BJP","Modi","BJP",124);
		

		politicalpartyServices.ValidateAndSave(politicalPartyDTO1);
		politicalpartyServices.ValidateAndSave(politicalPartyDTO2);
		politicalpartyServices.ValidateAndSave(politicalPartyDTO3);
		politicalpartyServices.ValidateAndSave(politicalPartyDTO4);
		

		
		politicalpartyServices.deleteByName("SUYOG");	
		
		politicalpartyServices.ValidateAndSave(politicalPartyDTO3);
		
		PoliticalPartyDAOImpl daoImpl = new PoliticalPartyDAOImpl();
		
		
          daoImpl.deleteByName("suyog");
		  
		  daoImpl.save(politicalPartyDTO3);
		  
		  
	}
	
}


