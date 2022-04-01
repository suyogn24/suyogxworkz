package com.xworkz.expenditure;

import com.xworkz.expenditure.constants.ExpenditurePeriod;
import com.xworkz.expenditure.dao.ExpenditureDAO;
import com.xworkz.expenditure.dto.ExpenditureDTO;

public class ExpenditureRunner {

	public static void main(String[] args) {
		
		ExpenditureDTO dto = new ExpenditureDTO();
		dto.setPersonName("SUYOG");
		dto.setAmount(2000);
		dto.setExpenditurePeriod(ExpenditurePeriod.YEARLY);
		dto.setTax(18);
		dto.setSpentOn("shoes");
		
		ExpenditureDAO dao=new ExpenditureDAO();
		boolean create=dao.create(dto);
		System.out.println("CREATED"+create);
		
		ExpenditureDTO dto1 = new ExpenditureDTO();
		dto.setPersonName("SUYOG");
		dto.setAmount(200);
		dto.setExpenditurePeriod(ExpenditurePeriod.Weekly);
		dto.setTax(5);
		dto.setSpentOn("Vegetables");
		dao.create(dto1);
		
		ExpenditureDTO dto2 = new ExpenditureDTO();
		dto.setPersonName("SUYOG");
		dto.setAmount(30);
		dto.setExpenditurePeriod(ExpenditurePeriod.DAILY);
		dto.setTax(5);
		dto.setSpentOn("Milk");
		dao.create(dto2);
		
		ExpenditureDTO dto3 = new ExpenditureDTO();
		dto.setPersonName("SUYOG");
		dto.setAmount(1500);
		dto.setExpenditurePeriod(ExpenditurePeriod.QUARTERLY);
		dto.setTax(5);
		dto.setSpentOn("Dress");
		dao.create(dto3);
		
		ExpenditureDTO dto4 = new ExpenditureDTO();
		dto.setPersonName("SUYOG");
		dto.setAmount(300);
		dto.setExpenditurePeriod(ExpenditurePeriod.QUARTERLY);
		dto.setTax(12);
		dto.setSpentOn("Hotel");
		dao.create(dto4);
		
		ExpenditureDTO dto5 = new ExpenditureDTO();
		dto.setPersonName("SUYOG");
		dto.setAmount(150);
		dto.setExpenditurePeriod(ExpenditurePeriod.QUARTERLY);
		dto.setTax(18);
		dto.setSpentOn("movie");
		dao.create(dto5);
		
		ExpenditureDTO dto6 = new ExpenditureDTO();
		dto.setPersonName("SUYOG");
		dto.setAmount(3000);
		dto.setExpenditurePeriod(ExpenditurePeriod.YEARLY);
		dto.setTax(18);
		dto.setSpentOn("Picnic");
		dao.create(dto6);
		
		ExpenditureDTO dto7 = new ExpenditureDTO();
		dto.setPersonName("SUYOG");
		dto.setAmount(500);
		dto.setExpenditurePeriod(ExpenditurePeriod.QUARTERLY);
		dto.setTax(15);
		dto.setSpentOn("Motor Vehicle Service");
		dao.create(dto7);
		
		ExpenditureDTO dto8 = new ExpenditureDTO();
		dto.setPersonName("SUYOG");
		dto.setAmount(200);
		dto.setExpenditurePeriod(ExpenditurePeriod.YEARLY);
		dto.setTax(12);
		dto.setSpentOn("Sunglass");
		dao.create(dto8);
		
		ExpenditureDTO dto9 = new ExpenditureDTO();
		dto.setPersonName("SUYOG");
		dto.setAmount(150);
		dto.setExpenditurePeriod(ExpenditurePeriod.YEARLY);
		dto.setTax(12);
		dto.setSpentOn("Umbrella");
		dao.create(dto9);
		
		ExpenditureDTO dto10 = new ExpenditureDTO();
		dto.setPersonName("SUYOG");
		dto.setAmount(1000);
		dto.setExpenditurePeriod(ExpenditurePeriod.MONTHLY);
		dto.setTax(18);
		dto.setSpentOn("Cylinder");
		dao.create(dto10);
		
		ExpenditureDTO dto11 = new ExpenditureDTO();
		dto.setPersonName("SUYOG");
		dto.setAmount(250);
		dto.setExpenditurePeriod(ExpenditurePeriod.QUARTERLY);
		dto.setTax(5);
		dto.setSpentOn("Medicines");
		dao.create(dto11);
		
		ExpenditureDTO dto12 = new ExpenditureDTO();
		dto.setPersonName("SUYOG");
		dto.setAmount(100);
		dto.setExpenditurePeriod(ExpenditurePeriod.MONTHLY);
		dto.setTax(5);
		dto.setSpentOn("Paneer");
		dao.create(dto12);
		
		ExpenditureDTO dto13 = new ExpenditureDTO();
		dto.setPersonName("SUYOG");
		dto.setAmount(5);
		dto.setExpenditurePeriod(ExpenditurePeriod.DAILY);
		dto.setTax(0);
		dto.setSpentOn("Newspaper");
		dao.create(dto13);
		
		ExpenditureDTO dto14 = new ExpenditureDTO();
		dto.setPersonName("SUYOG");
		dto.setAmount(2000);
		dto.setExpenditurePeriod(ExpenditurePeriod.YEARLY);
		dto.setTax(18);
		dto.setSpentOn("shoes");
		dao.create(dto14);
		
		ExpenditureDTO dto15 = new ExpenditureDTO();
		dto.setPersonName("SUYOG");
		dto.setAmount(1000);
		dto.setExpenditurePeriod(ExpenditurePeriod.QUARTERLY);
		dto.setTax(10);
		dto.setSpentOn("Dryfruits");
		dao.create(dto15);
		
		ExpenditureDTO dto16 = new ExpenditureDTO();
		dto.setPersonName("SUYOG");
		dto.setAmount(250);
		dto.setExpenditurePeriod(ExpenditurePeriod.MONTHLY);
		dto.setTax(12);
		dto.setSpentOn("Recharge");
		dao.create(dto16);
		
		ExpenditureDTO dto17 = new ExpenditureDTO();
		dto.setPersonName("SUYOG");
		dto.setAmount(500);
		dto.setExpenditurePeriod(ExpenditurePeriod.WEEKLY);
		dto.setTax(12);
		dto.setSpentOn("Travelling");
		dao.create(dto17);
		
		ExpenditureDTO dto18 = new ExpenditureDTO();
		dto.setPersonName("SUYOG");
		dto.setAmount(4000);
		dto.setExpenditurePeriod(ExpenditurePeriod.YEARLY);
		dto.setTax(15);
		dto.setSpentOn("Festivals");
		dao.create(dto18);
		
		ExpenditureDTO dto19 = new ExpenditureDTO();
		dto.setPersonName("SUYOG");
		dto.setAmount(400);
		dto.setExpenditurePeriod(ExpenditurePeriod.MONTHLY);
		dto.setTax(12);
		dto.setSpentOn("GYM");
		dao.create(dto19);
		
		ExpenditureDTO dto20 = new ExpenditureDTO();
		dto.setPersonName("SUYOG");
		dto.setAmount(2000);
		dto.setExpenditurePeriod(ExpenditurePeriod.YEARLY);
		dto.setTax(18);
		dto.setSpentOn("Electronic Things");
		dao.create(dto20);
		

	}

}