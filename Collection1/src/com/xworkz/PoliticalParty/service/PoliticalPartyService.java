package com.xworkz.PoliticalParty.service;

import com.xworkz.PoliticalPartyDTO.PoliticalPartyDTO;

public interface PoliticalPartyService {

  public void ValidateAndSave(PoliticalPartyDTO dto);
	
	public void deleteByName(String name);
	
	
}
