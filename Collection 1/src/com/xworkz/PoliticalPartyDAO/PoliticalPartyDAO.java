package com.xworkz.PoliticalPartyDAO;

import java.util.LinkedList;

import com.xworkz.PoliticalPartyDTO.PoliticalPartyDTO;

public interface PoliticalPartyDAO {

 	
      LinkedList<String> list=new LinkedList<String>();
 
      boolean save(PoliticalPartyDTO dto);
      
      void  deleteByName(String name);


	
	
}
