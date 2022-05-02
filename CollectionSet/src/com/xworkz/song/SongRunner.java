package com.xworkz.song;

import java.util.LinkedHashSet;
import java.util.Set;
import com.xworkz.song.dto.SongDTO;

public class SongRunner {

	public static void main(String[] args) {

		
		SongDTO songDTO1 = new SongDTO(13,"Raat Lambiya","Shravan",9.53);
		SongDTO songDTO2 = new SongDTO(55,"Dil Galti Kar Baitha","Alka Yagnik",13.56);
		SongDTO songDTO3 = new SongDTO(74,"Baarish Ban Jana","Shreya Ghoshal",12.43);
		SongDTO songDTO4 = new SongDTO(43,"Khushi Jab Bhi Teri","Neha Kakkar",16.06);
		SongDTO songDTO5 = new SongDTO(14,"Titliaan","Arjit Singh",7.23);
		SongDTO songDTO6 = new SongDTO(65,"Barrish Ki Jaye","Kumar Sanu",3.53);
		SongDTO songDTO7 = new SongDTO(45,"Chhor Denge","Udit Narayan",6.15);
		SongDTO songDTO8 = new SongDTO(87,"Ranjha","Sunidhi Chauhan",4.42);
		SongDTO songDTO9 = new SongDTO(45,"Dil Chahta Ho","Anuradha Paudwal",10.18);
		SongDTO songDTO10 = new SongDTO(34,"Meri Aashiqui","Lata Mangeshkar",6.25);
		SongDTO songDTO11 = new SongDTO(25,"Lagdi Lahori","Asha Bhosle",8.51);
		SongDTO songDTO12 = new SongDTO(74,"Bewafa Tera Muskurana","Tony Kakkar",9.34);
		SongDTO songDTO13 = new SongDTO(24,"Barsat Ki Dhun","Shreya Ghoshal",7.28);
		SongDTO songDTO14 = new SongDTO(64,"Mann Bharraya","Argit Singh",4.31);
		SongDTO songDTO15 = new SongDTO(25,"Hawayein","Sukhwinder Singh",3.05);
		SongDTO songDTO16 = new SongDTO(63,"Agar Tum Saath Ho","Sunidhi Chauhan",7.14);
		SongDTO songDTO17 = new SongDTO(71,"Enna Sona","Nadeem Shravan",8.08);
		SongDTO songDTO18 = new SongDTO(35,"Soch Na Sake","Shravan",6.25);
		SongDTO songDTO19 = new SongDTO(83,"Tere Yaar Hoon Main","Shravan",4.55);
		SongDTO songDTO20 = new SongDTO(84,"Channa Mereya","Shravan",5.40);
		
		
		Set<SongDTO> songDTOs = new LinkedHashSet<SongDTO>();
		
		songDTOs.add(songDTO1);
		songDTOs.add(songDTO2);
		songDTOs.add(songDTO3);
		songDTOs.add(songDTO4);
		songDTOs.add(songDTO5);
		songDTOs.add(songDTO6);
		songDTOs.add(songDTO7);
		songDTOs.add(songDTO8);
		songDTOs.add(songDTO9);
		songDTOs.add(songDTO10);
		songDTOs.add(songDTO11);
		songDTOs.add(songDTO12);
		songDTOs.add(songDTO13);
		songDTOs.add(songDTO14);
		songDTOs.add(songDTO15);
		songDTOs.add(songDTO16);
		songDTOs.add(songDTO17);
		songDTOs.add(songDTO18);
		songDTOs.add(songDTO19);
		songDTOs.add(songDTO20);
		
		System.out.println("All Songs" + songDTOs.size());
		
		
		
	}
	
	

}
