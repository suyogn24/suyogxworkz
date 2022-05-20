package com.xworkz.athelete.runner;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.athelete.dao.AtheleteDAO;
import com.xworkz.athelete.dao.AtheleteDAOImpl;
import com.xworkz.athelete.dto.AtheleteDTO;


public class AtheleteRunner {

		public static void main(String[] args) {

			AtheleteDTO dto1 = new AtheleteDTO(0, "Snehal", "Swimming", 8, "India", 2, "Summer games", 30, 5, "Rahul", 6,
					"Yes", 45000.8);

			AtheleteDTO dto2 = new AtheleteDTO(0, "Aarti", "Badminton", 7, "India", 6, "Winter games", 22, 4, "Rohan", 7,
					"Yes", 40000.5);


			List<AtheleteDTO> list = new ArrayList<AtheleteDTO>();
			list.add(dto1);
			list.add(dto2);

			AtheleteDAO dao = new AtheleteDAOImpl();
			dao.saveList(list);

			AtheleteDTO idDTO = dao.findById(8);
			System.out.println(idDTO);

			AtheleteDTO nameAndId = dao.findByNameAndId("Aarti", 7);
			System.out.println(nameAndId);

			AtheleteDTO nameAndSport = dao.findByNameAndSports("Snehal", "Swimming");
			System.out.println(nameAndSport);

			AtheleteDTO nameAndCouAndSpt = dao.findByNameAndCountryAndSports("Aarti", "India", "Cricket");
			System.out.println(nameAndCouAndSpt);

			String cout = dao.findCoachNameByNameAndCountryAndSports("Rohan", "Snehal", "India", "Badminton");
			System.out.println(cout);
			
			String nameLast=dao.findNameById("Aarti", 100);
			System.out.println(nameLast);
			
			int id1=dao.id(2);
			System.out.println(id1);
		}

	}
	

