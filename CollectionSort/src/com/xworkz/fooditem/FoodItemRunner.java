package com.xworkz.fooditem;

import java.awt.List;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.stream.Collectors;

import com.xworkz.fooditem.dto.FoodItemDTO;
import com.xworkz.fooditem.dto.Type;

public class FoodItemRunner {

	public static void main(String[] args) {

		LinkedList<FoodItemDTO> fooditem=new LinkedList<FoodItemDTO>();

		
		FoodItemDTO fooditemDTO1 = new FoodItemDTO(23,"Pizza",150,Type.VEGTYPE,3,"Vidhata");
		FoodItemDTO fooditemDTO2 = new FoodItemDTO(34,"Burger",100,Type.VEGTYPE,2,"Tulsi");
		FoodItemDTO fooditemDTO3 = new FoodItemDTO(75,"Fried Chicken",350,Type.NONVEGTYPE,2.5,"Dashmesh");
		FoodItemDTO fooditemDTO4 = new FoodItemDTO(76,"Sandwich",90,Type.VEGTYPE,5,"Radhai");
		FoodItemDTO fooditemDTO5 = new FoodItemDTO(13,"Fried Fish",250,Type.NONVEGTYPE,3,"Smilestone");
		FoodItemDTO fooditemDTO6 = new FoodItemDTO(73,"Noodles",180,Type.VEGTYPE,4,"Pawan Putra");
		FoodItemDTO fooditemDTO7 = new FoodItemDTO(56,"Mutton",660,Type.NONVEGTYPE,1.5,"Lemon Tree");
		FoodItemDTO fooditemDTO8 = new FoodItemDTO(8,"Chinese Rice",120,Type.VEGTYPE,3,"Sai Prasad");
		FoodItemDTO fooditemDTO9 = new FoodItemDTO(63,"Roast Chicken",540,Type.NONVEGTYPE,3.5,"Konark");
		FoodItemDTO fooditemDTO10 = new FoodItemDTO(97,"Pasta",150,Type.VEGTYPE,6,"Taj");
	
		fooditem.add(fooditemDTO1);
		fooditem.add(fooditemDTO2);
		fooditem.add(fooditemDTO3);
		fooditem.add(fooditemDTO4);
		fooditem.add(fooditemDTO5);	
		fooditem.add(fooditemDTO6);
		fooditem.add(fooditemDTO7);
		fooditem.add(fooditemDTO8);
		fooditem.add(fooditemDTO9);
	    fooditem.add(fooditemDTO10);
		

	System.out.println(fooditem.size());
		
	System.out.println("=============================");
		
		
	System.out.println("Loop all fooditems");
	fooditem.stream().collect(Collectors.toSet())
    .forEach(fooditems->System.out.println(fooditem));
	System.out.print("=================================");

	
	System.out.println("Loop and filter items by non veg type and display");
	fooditem.stream().filter(nonveg->nonveg.getType().collect(Collectors.toList())
	.forEach(type->System.out.println(type));
	System.out.print("=================================");

		
	System.out.println("Loop and filter where price is greater than 50");
	fooditem.stream().filter(dprice->dprice.getPrice() > 50).map(name->name.getName()).collect(Collectors.toList())
	.forEach(uName->System.out.println(uName));
	System.out.print("=================================");


	System.out.println("Loop and filter where price is greater than 50 and get only hotel names");
	fooditem.stream().filter(dprice->dprice.getPrice() > 50).map(name->name.getHotelName()).collect(Collectors.toList())
	.forEach(uName->System.out.println(uName));
	System.out.print("=================================");

		
	System.out.println("Loop and filter where price is greater than 50 and get only hotel names sorted");
	fooditem.stream().filter(dprice->dprice.getPrice() > 50).map(name->name.getHotelName()).sorted(Comparator.naturalOrder()).collect(Collectors.toList())
	.forEach(uName->System.out.println(uName));
	System.out.print("=================================");
		

	System.out.println("Loop and get name sorted");
	fooditem.stream().map(name->name.getName()).sorted(Comparator.naturalOrder()).collect(Collectors.toList())
	.forEach(uName->System.out.println(uName));
	System.out.print("=================================");
			
		
	System.out.println("Loop and get only ids sorted in desc");
	fooditem.stream().map(id->id.getId()).sorted(Comparator.reverseOrder()).collect(Collectors.toList())
	.forEach(uId->System.out.println(uId));
	System.out.print("=================================");
		
	
	System.out.println("Loop and get name where hotel name");
	fooditem.stream().map(name->name.getHotelName()).collect(Collectors.toList())
	.forEach(hotelname->System.out.println(hotelname));
	System.out.print("=================================");
	
	
	System.out.println("Loop and filter items by veg type sort in desc");
	fooditem.stream().map(items->items.getType()).sorted(Comparator.reverseOrder()).collect(Collectors.toList())
	.forEach(Vegitems->System.out.println(Vegitems));
	System.out.print("=================================");
		
	
	System.out.println("Loop and sort");
	fooditem.stream().map(dprice->dprice.getPrice()).sorted(Comparator.naturalOrder()).collect(Collectors.toList())
	.forEach(price->System.out.println(price));
	System.out.print("=================================");
				
		
	System.out.println("Loop and sort desc");
	fooditem.stream().map(dprice->dprice.getPrice()).sorted(Comparator.reverseOrder()).collect(Collectors.toList())
	.forEach(price->System.out.println(price));
	System.out.print("=================================");
		
		
	System.out.println("Loop and get only name in upper case");
	fooditem.stream().map(name->name.getName()).toUpperCase().collect(Collectors.toList())
	.forEach(uName->System.out.println(uName));
	System.out.print("=================================");
	
	
	System.out.println("Loop and get only hotel name in upper case");
	fooditem.stream().map(name->name.getHotelName()).collect(Collectors.toList())
	.forEach(uName->System.out.println(uName));
	System.out.print("=================================");
	
	
	}

}
