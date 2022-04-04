package com.xworkz.train.dao;

import com.xworkz.train.dto.TrainDTO;

public class TrainDAO {

	private TrainDTO[] trainDTOs = new TrainDTO[10];
	private int trainIndex=0;
	
	public TrainDAO() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}
	
	public boolean create (TrainDTO dto)  {
		
		System.out.println("invoked create train".concat(dto.toString()));
		
		this.trainDTOs[trainIndex] = dto;
		trainIndex++;
		
		return false;
		
	}

	public TrainDTO findByNumber(String number)
	{
	for(int position=0;position<this.trainDTOs.length;position++)
	{
		TrainDTO dtoFromArray=this.trainDTOs[position];
		if(dtoFromArray !=null && dtoFromArray.getNumber().equals(number))
{
	System.out.println("Number is matching"+ Number);
	return dtoFromArray;
}

return null;
		}
	}
	
	public TrainDTO findByName(String name)
	{
	for(int position=0;position<this.trainDTOs.length;position++)
	{
		TrainDTO dtoFromArray=this.trainDTOs[position];
		if(dtoFromArray !=null && dtoFromArray.getName().equals(name))
{
	System.out.println("Name is matching"+ Name);
	return dtoFromArray;
}

return null;
		}
	}
	
	public TrainDTO findByStartingPointdestination(String startingPoint,String destination)
	{
	for(int position=0;position<this.trainDTOs.length;position++)
	{
		TrainDTO dtoFromArray=this.trainDTOs[position];
		if(dtoFromArray !=null && dtoFromArray.getdestination().equals(destination) && dtoFromArray.getstartingPoint().equals(startingPoint))
{
	System.out.println("starting point and destination found succesfully"+ startingPoint and destination);
	return dtoFromArray;
}

return null;
		}
	}
		
		public int TotalTrains(int totaltrains)
		{
			return 10;
			
		}
	}
		
		
		
		
