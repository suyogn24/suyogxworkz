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
     
     
     
     
     public void saveMultiple(IplTeamDTO dto1,IplTeamDTO dto2)
 	{
    	 IplTeamDTO[] arrayFromParent=super.getIplTeamDTOs();
    	 int newIndex=super.getIplNewIndex();
 		if(dto1!=null )
 		{
 			arrayFromParent[newIndex]=dto1;
 			System.out.println(" dto is added to @"+newIndex);
 			newIndex++;
 			super.setIplNewIndex(newIndex);
 		}
 		
 		if(dto2!=null )
 		{
 			arrayFromParent[newIndex]=dto2;
 			System.out.println(" dto is added to @"+newIndex);
 			newIndex++;
 			super.setIplNewIndex(newIndex);
 		}
 		else
 		{
 			System.out.println("dtos are not found");
 		}
 		
 	}
 	

       
     public void updateSponsorByName(String Name,String Sponsor)
 	{
 		if( Name!=null && Sponsor!=null)
 		{
 			System.out.println("Running update by SponsorByName");
 		}
 			 IplTeamDTO[] arrayFromParent=super.getIplTeamDTOs();
 			for(int i=0;i<arrayFromParent.length;i++)
 			{
 				
 				if(arrayFromParent[i]!=null 
 						&& arrayFromParent[i].getName()!=null
 						&& arrayFromParent[i].getName().equals(Name))
 						{
 					arrayFromParent[i].setSponsor(Sponsor);
 					System.out.println("Updated to"+i);
 					}
 			}
 			
 		
    
 	}
     
     
     public void updateCaptainByName(String Name,String Captain)
  	{
  		if( Name!=null && Captain!=null)
  		{
  			System.out.println("Running update by CaptainByName");
  		}
  			 IplTeamDTO[] arrayFromParent=super.getIplTeamDTOs();
  			for(int i=0;i<arrayFromParent.length;i++)
  			{
  				
  				if(arrayFromParent[i]!=null
  						&& arrayFromParent[i].getName()!=null
  						&& arrayFromParent[i].getName().equals(Name))
  						{
  					arrayFromParent[i].setCaptain(Captain);
  					System.out.println("Updated to"+i);
  					}
  			}
  			
  		}
     
  	
}



	
