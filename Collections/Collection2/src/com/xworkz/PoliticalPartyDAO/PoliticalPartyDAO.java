package com.xworkz.PoliticalPartyDAO;

import java.awt.List;
import java.util.Comparator;
import java.util.LinkedList;

import com.xworkz.PoliticalPartyDTO.PoliticalPartyDTO;

public interface PoliticalPartyDAO {

 	
      LinkedList<String> list=new LinkedList<String>();
 
      boolean save(PoliticalPartyDTO dto);
      
      void  deleteByName(String name);

	List sort1(Comparator<PoliticalPartyDTO> sortName);

	java.util.List<PoliticalPartyDTO> sort(Comparator<PoliticalPartyDTO> sortName);
	
	
}
