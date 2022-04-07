package com.xworkz.IplTeamDAO;

import com.xworkz.IplTeamDTO.IplTeamDTO;

public abstract class IplTeamDAO {

	private IplTeamDTO[] iplTeamDTOs = new IplTeamDTO[14];
	public int iplTeamIndex=0;
	
	public void save (IplTeamDTO dto) {
		System.out.println("Created save dto");
		
	
	if(dto!=null && iplTeamIndex<this.iplTeamDTOs.length)
	{
		this.iplTeamDTOs[this.iplTeamIndex] = dto;
		this.iplTeamIndex++;
		
		System.out.println("IplTeamDTO created sucessfully @"+ this.iplTeamIndex);
		
	}
	else {
		System.out.println("Ipl DTO cannot be passed because array is full");
	}
	}
  public IplTeamDTO[] getIplTeamDTOs() {
	return iplTeamDTOs;
}
  
  public int getTotal() {
 	 int n=0;
 	 for(int i=0; i<iplTeamDTOs.length;i++)
 	 {
 		 if (iplTeamDTOs[i]!=null)
 		 {
 			 n++;
 			 
 		 }
 	 }
 	 System.out.println("Total number of DTO is"+n);
 	 return n;
 	 
  }
  

}
