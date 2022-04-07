package com.xworkz.IplTeamDAO;

import com.xworkz.IplTeamDTO.IplTeamDTO;



public class IplTeamImplementationDAO extends IplTeamDAO {
	

	@Override
	public void save (IplTeamDTO ipldto) {
		System.out.println("Created save dto");
		IplTeamDTO[] arrayFromParent=super.getIplTeamDTOs();
	
	if(ipldto!=null && iplTeamIndex<arrayFromParent.length)
	{
		arrayFromParent[super.iplTeamIndex]=ipldto;
		
		System.out.println("IplTeamDTO created sucessfully @"+ super.iplTeamIndex);
	super.iplTeamIndex++;	
	}
	else {
		System.out.println("Ipl DTO cannot be passed because array is full");
	}
	}
	
	
	
	
	public IplTeamDTO findByName(String name) {
	
		IplTeamDTO[] arrayFromParent=super.getIplTeamDTOs();
		for (int index=0; index<arrayFromParent.length; index++) {
			if(name!=null && arrayFromParent[index].getCaptain().equals(name))
			{
			
				
				System.out.println("name is found sucessfully @"+ index);
		 return arrayFromParent[index];	
			}
			 
				

		}
		System.out.println("name is not found");
		
		return null;
	}
	
	
	
	public IplTeamDTO findByNameandSponsor(String name,String sponsor) {
		
		IplTeamDTO[] arrayFromParent=super.getIplTeamDTOs();
		for (int index=0; index<arrayFromParent.length; index++) {
			if(name!=null  &&sponsor!=null && arrayFromParent[index]!=null && arrayFromParent[index].getCaptain().equals(name) && arrayFromParent[index].getSponsor().equals(sponsor))
			{
			
				
				System.out.println("name and sponsor is found sucessfully @"+ index);
		 return arrayFromParent[index];	
			}
			
				

		}
		System.out.println("name is not found");

		return null;
	}
	
	
	
     public IplTeamDTO findByNameandSponsorandCaptain(String name,String sponsor,String TeamName) {
		
		IplTeamDTO[] arrayFromParent=super.getIplTeamDTOs();
		for (int index=0; index<arrayFromParent.length; index++) {
			if(name!=null  &&sponsor!=null &&TeamName!=null
					&& arrayFromParent[index]!=null
					&& arrayFromParent[index].getCaptain().equals(name)
					&& arrayFromParent[index].getSponsor().equals(sponsor)
					&& arrayFromParent[index].getName().equals(TeamName))
			{
			
				
				System.out.println("name and sponsor and captain is found sucessfully @"+ index);
		 return arrayFromParent[index];	
			}
			
				

		}
		System.out.println("name is not found");

		return null;
	}
     
     
    
}


	
