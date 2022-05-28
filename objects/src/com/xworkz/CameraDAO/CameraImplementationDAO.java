package com.xworkz.CameraDAO;

import com.xworkz.CameraDTO.CameraDTO;

public class CameraImplementationDAO extends CameraDAO {
	
	CameraDTO[] superCameraArray = super.getCameraDTOs();
	int adder = 0;
	
	public CameraImplementationDAO() {
		   System.out.println("Generated" + this.getClass().getSimpleName());
		   }

	@Override
	public boolean save(CameraDTO dto) {
		if (dto == null) {
			System.err.println("The DTO is null and cannot be added");
		    return false;
		}
		
		 boolean found = findDuplicate(dto);
		 if (found) {
			 System.err.println("The DTO is already present and not added");
			 return false;
		 }
		 
		if(this.adder < this.superCameraArray.length) {
			 this.superCameraArray[this.adder] = dto;
			 System.out.println("The DTO is added to index @" + this.adder);
			 this.adder++;
			 
			 return true;
		} else {
			 System.err.println("The DTO is out of bound cannot be added");
		}
		
		return false;
	}

	@Override
	public boolean findDuplicate(CameraDTO cameraDTO) {
	 if (cameraDTO == null) {
		 System.err.println("The DTO is null cannot be found");
	}

	 for (int index=0; index < this.superCameraArray.length; index++) {
		 if (this.superCameraArray[index] !=null &&  this.superCameraArray[index].equals(cameraDTO)) {
			System.out.print("The DTO is found @ index" + index);
			return true;
		 }
	 }
	 return false;
	}
	
	 
	@Override
	public CameraDTO findById(int id) {
		if (id <=0) {
			 System.err.println("The id is null cannot be found");
	       	return null;
	}
		
		for (int index=0; index < this.superCameraArray.length; index++) {
			 if (this.superCameraArray[index] !=null &&  superCameraArray[index].getId()== id) {
				System.out.print("The id is found @ DTO index" + index);
				return superCameraArray[index];
			 }
		}
		 System.err.println("The id is not found in DTO array");
	       	return null;
	}
		

	@Override
	public CameraDTO findByMaxcost() {
		double maxCost = 0;
		int maxCostIndex = 0;
		
		for (int i = 0;i <superCameraArray.length; i++) {
			if (superCameraArray[i] != null)  {
				double cost = superCameraArray[i].getCost();
				if (cost > maxCost) {
					maxCost = cost;
					maxCostIndex = i;
					
				}
			}
		}
		System.out.print("The max cost of camera is"+ maxCost +" & found @ index" + maxCostIndex);
		return superCameraArray[maxCostIndex];
	}

	@Override
	public CameraDTO findByMincost() {
		double minCost = 0;
		int minCostIndex = 0;
		
		for (int i = 0;i <superCameraArray.length; i++) {
			if (superCameraArray[i] != null)  {
				double cost = superCameraArray[i].getCost();
				if (cost < minCost) {
					minCost = cost;
					minCostIndex = i;
					
				}
			}
		}
		System.out.print("The min cost of camera is"+ minCost +" & found @ index" + minCostIndex);
		return superCameraArray[minCostIndex];
	}
}




