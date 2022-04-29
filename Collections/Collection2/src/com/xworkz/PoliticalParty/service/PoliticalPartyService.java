package com.xworkz.PoliticalParty.service;

import java.util.List;

import com.xworkz.PoliticalPartyDTO.PoliticalPartyDTO;

public interface PoliticalPartyService {

  public void ValidateAndSave(PoliticalPartyDTO dto);
	
	public void deleteByName(String name);

	List<PoliticalPartyDTO> sortByName();

	List<PoliticalPartyDTO> sortById();

	List<PoliticalPartyDTO> sortByNameAndId();
	
	
}
