package com.xworkz.machine.dto;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

import com.xworkz.EnumType.Type;

public class WashingMachineRunner {

	public static void main(String[] args) {
		
		WashingMachineDTO  machineDTO1 = new WashingMachineDTO(98,"SAMSUNG",7,"WHITE",Type.FRONTLOAD,4500,50);
		WashingMachineDTO  machineDTO2 = new WashingMachineDTO(34,"BOSCH",4,"GREEN",Type.TOPLOAD,15500,43);
		WashingMachineDTO  machineDT03 = new WashingMachineDTO(43,"VIDEOCON",5,"BLACK",Type.FRONTLOAD,9500,67);
		WashingMachineDTO  machineDTO4 = new WashingMachineDTO(32,"WHIRLPOOL",20,"YELLOW",Type.FRONTLOAD,4560,57);
		WashingMachineDTO  machineDTO5 = new WashingMachineDTO(64,"PANASONIC",8,"PINK",Type.TOPLOAD,12500,98);
		WashingMachineDTO  machineDTO6 = new WashingMachineDTO(13,"GODREJ",18,"RED",Type.TOPLOAD,18000,26);
		WashingMachineDTO  machineDTO7 = new WashingMachineDTO(53,"SIEMENS",65,"BLUE",Type.FRONTLOAD,20000,63);
		WashingMachineDTO  machineDTO8 = new WashingMachineDTO(96,"KENMORE",75,"ORANGE",Type.TOPLOAD,9000,05);
		WashingMachineDTO  machineDTO9 = new WashingMachineDTO(35,"IFB",45,"LIGHTBLUE",Type.FRONTLOAD,14000,18);
		WashingMachineDTO  machineDTO10 = new WashingMachineDTO(24,"AMANA",85,"GREY",Type.TOPLOAD,15000,56);
		WashingMachineDTO  machineDTO11 = new WashingMachineDTO(75,"HAIER",55,"BROWN",Type.FRONTLOAD,4000,28);
		WashingMachineDTO  machineDTO12 = new WashingMachineDTO(54,"KENSTAR",9,"PURPLE",Type.TOPLOAD,35000,73);
		WashingMachineDTO  machineDTO13 = new WashingMachineDTO(73,"MIELE",95,"LIGHTYELLOW",Type.FRONTLOAD,12000,39);
		WashingMachineDTO  machineDTO14 = new WashingMachineDTO(14,"CROMA",25,"DARKBROWN",Type.TOPLOAD,6500,16);
		WashingMachineDTO  machineDTO15 = new WashingMachineDTO(27,"ONIDA",35,"SKYBLUE",Type.FRONTLOAD,7500,95);
		WashingMachineDTO  machineDTO16 = new WashingMachineDTO(45,"BPL",105,"MAROON",Type.TOPLOAD,7000,25);
		WashingMachineDTO  machineDTO17 = new WashingMachineDTO(65,"ELECTRUX",12,"VIOLET",Type.TOPLOAD,8000,84);
		WashingMachineDTO  machineDTO18 = new WashingMachineDTO(41,"ZANUSSI",15,"SILVER",Type.FRONTLOAD,5500,13);
		WashingMachineDTO  machineDTO19 = new WashingMachineDTO(86,"LIOYD",125,"NAVYBLUE",Type.FRONTLOAD,4550,03);
		WashingMachineDTO  machineDTO20 = new WashingMachineDTO(94,"MITASHI",14,"DARKRED",Type.TOPLOAD,10000,76);
		
        Collection<WashingMachineDTO> machineDTOs = new LinkedList<WashingMachineDTO>();
   
        machineDTOs.add(machineDTO1);
        machineDTOs.add(machineDTO2);
		machineDTOs.add(machineDT03);
        machineDTOs.add(machineDTO4);
        machineDTOs.add(machineDTO5);
        machineDTOs.add(machineDTO6);
        machineDTOs.add(machineDTO7);
        machineDTOs.add(machineDTO8);
        machineDTOs.add(machineDTO9);
        machineDTOs.add(machineDTO10);
        machineDTOs.add(machineDTO11);
        machineDTOs.add(machineDTO12);
        machineDTOs.add(machineDTO13);
        machineDTOs.add(machineDTO14);
        machineDTOs.add(machineDTO15);
        machineDTOs.add(machineDTO16);
	    machineDTOs.add(machineDTO17);
        machineDTOs.add(machineDTO18);
        machineDTOs.add(machineDTO19);
        machineDTOs.add(machineDTO20);
        
        System.out.println(machineDTOs.size());    
        
        System.out.println(machineDTOs.contains(machineDTO15));
        
        for(WashingMachineDTO dto:machineDTOs) {
        	
        	if(dto.getPrice()>5000)  {
        		System.out.print("Washing machine price is more");
        	}
        }
        
        for(WashingMachineDTO dto:machineDTOs) {
        	if(dto.getPrice()<5000)  {
        		System.out.print("Washing machine price is less");
        	}
        }
        
        for(WashingMachineDTO dto:machineDTOs) {
        	if(dto.getCapacity()>5)  {
        		System.out.print("Washing machine capacity is less");
        	}
        }
        
        for(WashingMachineDTO dto:machineDTOs) {
        	if(dto.getCapacity()>5 && dto.getCapacity()>15)  {
        		System.out.print("Washing machine capacity is upto 15");
        	}
        }
        
        for(WashingMachineDTO dto:machineDTOs) {
        	if(dto.getCapacity()>15)  {
        		System.out.print("Washing machine capacity is greater than 15");
        	}
        }
        
        for(WashingMachineDTO dto:machineDTOs)  {
        	String m=dto.getBrand();
        	for(int i=0;i<m.length();i++)
        		if(('f'==m.charAt(i)))
        			System.out.println(dto.getBrand());
        }
        
        for(WashingMachineDTO dto:machineDTOs) {
        	if(dto.getBrand().length()>10)  {
        		System.out.print("Washing machine brand have more than 10 characters");
        	}
        }
        

		for(WashingMachineDTO dto:machineDTOs)
		{
		      System.out.println(dto.getBrand().toUpperCase());
			
		}
        
        
        Iterator<WashingMachineDTO> dto = machineDTOs.iterator();
         while(dto.hasNext())
        	 {    
        	 
             int k=dto.next().getCapacity();
        	 if(k<5)   { 
        	     dto.remove();
        	 }
        	 else  {
        		 System.out.println("Remove capacity less than 5"+" "+k);
        	 }
        	 
        
        	 }
        
	}
}

