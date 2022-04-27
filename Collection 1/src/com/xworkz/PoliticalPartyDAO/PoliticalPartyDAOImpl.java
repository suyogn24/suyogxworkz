package com.xworkz.PoliticalPartyDAO;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import com.xworkz.PoliticalPartyDTO.PoliticalPartyDTO;

public class PoliticalPartyDAOImpl implements PoliticalPartyDAO {
	
	
		
      List<PoliticalPartyDTO> list=new LinkedList<PoliticalPartyDTO>();
      
         private int index=0,i=0;

		   
		 	@Override
		 	public boolean save(PoliticalPartyDTO dto) {
		 		
		 		System.out.println("save");
		 		if(dto!=null)
		 		{
		 			
		 		list.add(dto);
		 	    System.out.println(list);
		 	    index++;
		 	    return true;
		 		}
		 		
		 		return false;
		 	
		 	}
		 	
	
		 	  public void addingDTOelementsTOCollection(PoliticalPartyDTO dto)
		 	   {
		 		list.add(dto);
		 		}
		 	   public void iterator()
		 	  {
		 		System.out.println("iterator");
		 		
		 		ListIterator<PoliticalPartyDTO>  k=list.listIterator();
		 		while(k.hasNext())
		 		{
		 			System.out.println("iterator"+k.next());
		 		}
		 	  }

		 		
		 		@Override
		 		public PoliticalPartyDTO deleteByName(String name) {
		 		
		 		System.out.println("finding name");
		 		
		 	if(name!=null)
		 	{
		 			Iterator <PoliticalPartyDTO>  iterater=list.listIterator();
				    while(iterater.hasNext())
				{
					PoliticalPartyDTO dto=(PoliticalPartyDTO)iterater.next();
					if(dto.getName().equals(name))
					{
						iterater.remove();
						System.out.println(list.size());
						return dto;
						
					}
				}
				
		 	}
		 	
				return null;
		 		
		 		}
}

