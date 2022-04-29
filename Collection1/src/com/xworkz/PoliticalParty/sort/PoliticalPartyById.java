package com.xworkz.PoliticalParty.sort;

import java.util.Comparator;

import com.xworkz.PoliticalPartyDTO.PoliticalPartyDTO;

public class PoliticalPartyById  implements Comparator<PoliticalPartyDTO>  {

	@Override
	public int compare(PoliticalPartyDTO o1, PoliticalPartyDTO o2) {
	
		Integer id1=o1.getId();
		Integer id2=o2.getId();
		
		
		
		return id1.compareTo(id2);
		
	}
	
	
	
	

}
