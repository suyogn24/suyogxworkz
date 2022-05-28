package com.xworkz.Camera;

import com.xworkz.CameraDAO.CameraDAO;
import com.xworkz.CameraDAO.CameraImplementationDAO;
import com.xworkz.CameraDTO.CameraDTO;

public class CameraRunner {

	public static void main(String[] args) {
		  
		
		CameraDTO cameradto1 = new CameraDTO();
	    cameradto1.setId(4576);
		cameradto1.setBrand("Panasonic");
	    cameradto1.setPixel(100);
	    cameradto1.setType("Digital Camera");
	    cameradto1.setCost(40000);
	
		CameraDTO cameradto2= new CameraDTO();
		cameradto2.setId(7689);
		cameradto2.setBrand("Kodak");
		cameradto2.setPixel(21);
		cameradto2.setType("Pinhole Camera");
		cameradto2.setCost(60000);
		
		CameraDTO  cameradto3 = new CameraDTO();
		cameradto3.setId(3476);
		cameradto3.setBrand("Sony");
		cameradto3.setPixel(5);
		cameradto3.setType("Movie Camera");
		cameradto3.setCost(10000);
		
		CameraDAO dao=new CameraImplementationDAO();
		
		CameraImplementationDAO castedDAO=(CameraImplementationDAO)dao;
				
				castedDAO.save(cameradto1);
				castedDAO.save(cameradto2);
				castedDAO.save(cameradto3);
				
			castedDAO.findById(4545);

			castedDAO.findByMaxcost();
			
			castedDAO.findByMincost();
	}

}
