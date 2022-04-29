package com.xworkz.place;

import java.util.LinkedHashSet;
import java.util.Set;

import com.xworkz.place.dto.PlaceDTO;

public class PlaceRunner {

	public static void main(String[] args) {
		
		
		
		PlaceDTO placeDTO1 = new PlaceDTO(32,"Paithan","Aurangabad","Maharashtra","India");
		PlaceDTO placeDTO2 = new PlaceDTO(43,"Rishikesh","Dehradun","Uttarakhand","India");
		PlaceDTO placeDTO3 = new PlaceDTO(76,"Golden Temple","Amritsar","Punjab","India");
		PlaceDTO placeDTO4 = new PlaceDTO(42,"Charminar","Hyderabad","Telangana","India");
		PlaceDTO placeDTO5 = new PlaceDTO(98,"Elephanta Caves","Mumbai","Maharashtra","India");
		PlaceDTO placeDTO6 = new PlaceDTO(54,"City Palace","Jaipur","Rajasthan","India");
		PlaceDTO placeDTO7 = new PlaceDTO(25,"Borra Caves","Vishakhapatnam","Andhra Pradesh","India");
		PlaceDTO placeDTO8 = new PlaceDTO(65,"The Ridge","Shimla","Himachal Pradesh","India");
		PlaceDTO placeDTO9 = new PlaceDTO(53,"Bada Imambara","Lucknow","Uttar Pradesh","India");
		PlaceDTO placeDTO10 = new PlaceDTO(14,"Laxmi Vilas Palace","Vadodara","Gujarat","India");
		
		
		Set<PlaceDTO> placeDTOs = new LinkedHashSet<PlaceDTO>();
		
		placeDTOs.add(placeDTO1);
		placeDTOs.add(placeDTO2);
		placeDTOs.add(placeDTO3);
		placeDTOs.add(placeDTO4);
		placeDTOs.add(placeDTO5);
		placeDTOs.add(placeDTO6);
		placeDTOs.add(placeDTO7);
		placeDTOs.add(placeDTO8);
		placeDTOs.add(placeDTO9);
		placeDTOs.add(placeDTO10);
		
		System.out.println("All Places" + placeDTOs.size());
		
		
				}
	
	
	

}
