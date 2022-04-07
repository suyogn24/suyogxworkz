package com.xworkz.IplTeam;

import com.xworkz.IplTeamDAO.IplTeamDAO;
import com.xworkz.IplTeamDAO.IplTeamImplementationDAO;
import com.xworkz.IplTeamDTO.IplTeamDTO;

public class IplTeamRunner {

	public static void main(String[] args) {
		
		IplTeamDTO ipldto = new IplTeamDTO();
		ipldto.setId(67);
		ipldto.setName("Mumbai Indians");
		ipldto.setSponsor("Mukesh Ambani");
		ipldto.setCaptain("Rohit Sharma");
		ipldto.setnoofWins(5);
		ipldto.setNoofLostMatch(2);
	
		IplTeamDTO ipldto1 = new IplTeamDTO();
		ipldto1.setId(45);
		ipldto1.setName("Mumbai Indians");
		ipldto1.setSponsor("Nita Ambani");
		ipldto1.setCaptain("Rohit Sharma");
		ipldto1.setnoofWins(5);
		ipldto1.setNoofLostMatch(2);
		
		IplTeamDTO ipldto2 = new IplTeamDTO();
		ipldto2.setId(34);
		ipldto2.setName("RCB");
		ipldto2.setSponsor("Reddy Group");
		ipldto2.setCaptain("Du Plessis");
		ipldto2.setnoofWins(4);
		ipldto2.setNoofLostMatch(3);
		
		
		IplTeamDTO ipldto3 = new IplTeamDTO();
		ipldto3.setId(89);
		ipldto3.setName("CSK");
		ipldto3.setSponsor("Krishnan Murthy");
		ipldto3.setCaptain("Ravindra Jadeja");
		ipldto3.setnoofWins(6);
		ipldto3.setNoofLostMatch(1);
	
		
		IplTeamDTO ipldto4 = new IplTeamDTO();
		ipldto4.setId(65);
		ipldto4.setName("KKR");
		ipldto4.setSponsor("Shahrukh Khan");
		ipldto4.setCaptain("Shreyas Iyer");
		ipldto4.setnoofWins(7);
		ipldto4.setNoofLostMatch(2);
			
			
		IplTeamDTO ipldto5 = new IplTeamDTO();
		ipldto5.setId(36);
		ipldto5.setName("DC");
		ipldto5.setSponsor("Bajaj Group");
		ipldto5.setCaptain("Rishabh Pant");
		ipldto5.setnoofWins(6);
		ipldto5.setNoofLostMatch(3);
		
		IplTeamDTO ipldto6 = new IplTeamDTO();
		ipldto6.setId(26);
		ipldto6.setName("Sunrisers Hyderabad");
		ipldto6.setSponsor("Ambuja Cements");
		ipldto6.setCaptain("Kane Williamson");
		ipldto6.setnoofWins(7);
		ipldto6.setNoofLostMatch(3);

		
		IplTeamDTO ipldto7 = new IplTeamDTO();
		ipldto7.setId(65);
		ipldto7.setName("Rajasthan Royals");
		ipldto7.setSponsor("Shipla Shetty");
		ipldto7.setCaptain("Sanju Samson");
		ipldto7.setnoofWins(4);
		ipldto7.setNoofLostMatch(5);
		
		
		IplTeamDTO ipldto8 = new IplTeamDTO();
		ipldto.setId(66);
		ipldto.setName("Punjab Kings");
		ipldto.setSponsor("Priety Zinta");
		ipldto.setCaptain("Mayank Agarwal");
		ipldto.setnoofWins(6);
		ipldto.setNoofLostMatch(3);
		
			
	    IplTeamDTO ipldto9 = new IplTeamDTO();
		ipldto9.setId(87);
		ipldto9.setName("Lucknow Super Giants");
		ipldto9.setSponsor("Yogi Adityanath");
		ipldto9.setCaptain("KL Rahul");
		ipldto9.setnoofWins(7);
		ipldto9.setNoofLostMatch(5);
		

		IplTeamDTO ipldto10 = new IplTeamDTO();
		ipldto10.setId(77);
		ipldto10.setName("Gujarat Titans");
		ipldto10.setSponsor("Ajim Premji");
		ipldto10.setCaptain("Hardik Pandya");
		ipldto10.setnoofWins(8);
		ipldto10.setNoofLostMatch(1);
		
		
		IplTeamDTO ipldto11 = new IplTeamDTO();
		ipldto11.setId(59);
		ipldto11.setName("Mahindra Group");
		ipldto11.setSponsor("Mahindra And Mahindra");
		ipldto11.setCaptain("Rahul");
		ipldto11.setnoofWins(4);
		ipldto11.setNoofLostMatch(5);
		
		
		IplTeamDTO ipldto12 = new IplTeamDTO();
		ipldto12.setId(37);
		ipldto12.setName("Xworkz");
		ipldto12.setSponsor("Xworkz Group");
		ipldto12.setCaptain("Omkar Sir");
		ipldto12.setnoofWins(2);
		ipldto12.setNoofLostMatch(6);
		
		
		IplTeamDTO ipldto13 = new IplTeamDTO();
		ipldto13.setId(44);
		ipldto13.setName("Nellore Warroirs");
		ipldto13.setSponsor("Adani Group");
		ipldto13.setCaptain("Vignesh");
		ipldto13.setnoofWins(6);
		ipldto13.setNoofLostMatch(4);;
		
		IplTeamDTO ipldto14 = new IplTeamDTO();
		ipldto14.setId(35);
		ipldto14.setName("PUNE Warriors");
		ipldto14.setSponsor("TATA");
		ipldto14.setCaptain("Suyog");
		ipldto14.setnoofWins(6);
		ipldto14.setNoofLostMatch(4);
		
		
		IplTeamDAO dao=new IplTeamImplementationDAO();
		
		IplTeamImplementationDAO castedDAO=(IplTeamImplementationDAO)dao;
		
		
		castedDAO.save(ipldto1);
		castedDAO.save(ipldto2);
		castedDAO.save(ipldto3);
		castedDAO.save(ipldto4);
		castedDAO.save(ipldto5);
		castedDAO.save(ipldto6);
		castedDAO.save(ipldto7);
		castedDAO.save(ipldto8);
		castedDAO.save(ipldto9);
		castedDAO.save(ipldto10);
		castedDAO.save(ipldto11);
		castedDAO.save(ipldto12);
		castedDAO.save(ipldto13);
		castedDAO.save(ipldto14);

		
		castedDAO.findByName("Rishabh Pant");
		
		
		castedDAO.findByNameandSponsor("Ravindra Jadeja","Krishnan Murthy");
		

		castedDAO.findByNameandSponsorandCaptain("Ravindra Jadeja","Krishnan Murthy","CSK");
       castedDAO.getTotal();
		
	}

}
