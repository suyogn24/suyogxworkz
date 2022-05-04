package com.xworkz.collectionmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapRunner {

	public static void main(String[] args) {
		
		Map<String,String> ceoNameCompanyMap = new HashMap<>();
		ceoNameCompanyMap.put("Sundar Pichai","Google");
		ceoNameCompanyMap.put("Akshay","Acenture");
		ceoNameCompanyMap.put("Sundaram Patel","Amdocs");
		ceoNameCompanyMap.put("Ajim Premji","Wipro");
		ceoNameCompanyMap.put("Mistry","TCS");
		ceoNameCompanyMap.put("Krishnan Murthy","Infosys");
		ceoNameCompanyMap.put("Steve Job","Microsoft");
		ceoNameCompanyMap.put("Rahul","Facebook");
		ceoNameCompanyMap.put("Michael Dell","Dell");
		ceoNameCompanyMap.put("Suyog","Asus");
		ceoNameCompanyMap.put("Rahul Bajaj","Bajaj Auto");
		ceoNameCompanyMap.put("Ratan Tata","Tata TeleServices");
		ceoNameCompanyMap.put("Vignesh","Cognizant");
		ceoNameCompanyMap.put("Rohan","Capgemini");
		ceoNameCompanyMap.put("James Bond","Brisalcone");
		

        System.out.println(ceoNameCompanyMap.size());
		
		Set<String> keys = ceoNameCompanyMap.keySet();
		keys.forEach(c ->System.out.println(c));
		
		Collection<String> values = ceoNameCompanyMap.values();
		values.forEach(e ->System.out.println(e));
		
		
		System.out.println("=========Entry Set for ceoNameCompany ============== ");
		

       Set<Entry<String,String>> entrySet = ceoNameCompanyMap.entrySet();
		
		for (Entry<String,String> entry : entrySet)  {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("Key : " + key + " " + "Value " + value);
		}
		
		
		System.out.println("forEach method for ceoNameCompany ");
		
		entrySet.forEach(e ->System.out.println(e.getKey() + " " + e.getValue()));
		ceoNameCompanyMap.forEach((k,v)->System.out.println(k +" "+v));
		
		
		
	}

}
