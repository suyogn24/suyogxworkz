package com.xworkz.athelete.dao;

import java.util.List;
import java.util.Set;

import com.xworkz.athelete.dto.AtheleteDTO;

public interface AtheleteDAO {

	boolean save (AtheleteDTO dto);

	boolean saveList(List<AtheleteDTO> list);

	 default AtheleteDTO findById(int id) {
		return null;
	}

	 default AtheleteDTO findByNameAndId(String name, int id) {
		return null;
	}

	default AtheleteDTO findByNameAndSports(String name, String sports) {
		return null;
	}

	default AtheleteDTO findByNameAndCountryAndSports(String name, String country, String sports) {
		return null;
	}

	default String findCoachNameByNameAndCountryAndSports(String coachName, String name, String country,
			String sports) {
		return null;
	}

	default String findNameById(String name,int id) {
		return null;
	}

	default int id(int id) {
		return 0;
	}

	boolean saveList();

	Set<AtheleteDTO> displayTable();

}
