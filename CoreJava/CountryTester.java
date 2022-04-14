class CountryTester{
	
	public static void main(String[] things)
	{
		
	Country country=new Country();

	
	country.addCountry("India");
	country.addCountry("France");
	country.addCountry("Canada");
	country.addCountry("Greece");
	country.addCountry("Algeria");
	country.addCountry("Belgium");
	country.addCountry("Brazil");
	country.addCountry("Afghanistan");
	country.addCountry("Argentina");
	country.addCountry("Colombia");
    country.addCountry("Germany");
	country.addCountry("Australia");
	country.addCountry("Denmark");
	country.addCountry("Egypt");
	country.addCountry("Finland");
	country.addCountry("Hungary");
	country.addCountry("Indonesia");
	country.addCountry("Italy");
	country.addCountry("Japan");
	country.addCountry("Sweden");

	
	country.findCountry("Switzerland");
	country.findCountry("Turkey");
	
	
	country.updateCountry(12, "Greece");
	country.updateCountry(26, "Italy");

	
	country.displayCountry();
	
	System.out.println("");
	
	
	country.delete(10);
	country.delete("France");
	
	country.displayCountry();
	
	}
	
}