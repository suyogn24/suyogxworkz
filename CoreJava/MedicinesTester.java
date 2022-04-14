class MedicinesTester{
	
	public static void main(String[] things)
	{
		
    Medicines medicines=new Medicines();

	
	medicines.addMedicines("Paracetemol");
	medicines.addMedicines("Paincular");
	medicines.addMedicines("Synarest");
	medicines.addMedicines("D cold");
	medicines.addMedicines("No cold");
	medicines.addMedicines("Cetrizine");
	medicines.addMedicines("Benzonatate");
	medicines.addMedicines("Zopidem");
	medicines.addMedicines("Naproxen");
	medicines.addMedicines("Omeprazole");
	
	
	
	medicines.findMedicines("Cetrizine");
	medicines.findMedicines("Actos");
	
	
	medicines.displayMedicines();
	
	}
	
}


	