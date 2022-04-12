package com.xworkz.CameraDAO;

import com.xworkz.CameraDTO.CameraDTO;

public abstract class CameraDAO {

	private CameraDTO[] cameraDTOs = new  CameraDTO[3];
	
	protected CameraDAO() {
		
	}
	
	public CameraDTO[] getCameraDTOs() {
		 return cameraDTOs;
		 
	}
	
	public abstract boolean save(CameraDTO dto);
	
	public abstract boolean findDuplicate(CameraDTO cameraDTO);
	
	public abstract CameraDTO findById(int id);
	
	public abstract CameraDTO  findByMaxcost();
	
	public abstract CameraDTO  findByMincost();
	
	
	
}

